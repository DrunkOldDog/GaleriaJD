package mypackage1;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.NamingException;
import oracle.jdbc.*;
import java.util.*;

public class inicioAction extends Action 
{
  /**
   * This is the main action called from the Struts framework.
   * @param mapping The ActionMapping used to select this instance.
   * @param form The optional ActionForm bean for this request.
   * @param request The HTTP Request we are processing.
   * @param response The HTTP Response we are processing.
   */
  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  {
    inicioActionForm abm = (inicioActionForm) form;
    String boton = abm.getBoton();

  if (boton.equals("Exposiciones"))
  {
    Connection cn = null;
    ConnectDB conn =new ConnectDB();
    ResultSet rsConsulta = null;
    try
    {
      cn = conn.conexion;
      String cadena = "Select IDEXPOSICION,titulo,descripcion,fec_ini,fec_cie from jd_exposicion order by 1";
      rsConsulta = conn.getData(cadena);
      ArrayList items = new ArrayList();
      while (rsConsulta.next())
      {
        ClaseExp item = new ClaseExp();
        item.setId(rsConsulta.getString("IDEXPOSICION"));
        item.setTitulo(rsConsulta.getString("titulo"));
        item.setDescr(rsConsulta.getString("descripcion"));
        item.setFecha_ini(rsConsulta.getString("fec_ini"));
        item.setFecha_cierre(rsConsulta.getString("fec_cie"));
        items.add(item);
        System.out.println("Paso ..");
    }
    expoActionForm f = new expoActionForm ();	   
    f.setTabla(items);
    request.getSession().setAttribute("nn",f);
    return mapping.findForward("expos");
	}
	
    catch(Exception e)
    {
      e.printStackTrace();
      return (mapping.findForward("mal"));
    }
    finally
    {
      conn.closeConnection();	
    }
  }


    if (boton.equals("Compras")) {
      Connection cn = null;
      ConnectDB conn =new ConnectDB();
      ResultSet rsConsulta = null;
      try
      {
        cn = conn.conexion;
        String cadena = "select * from jd_obra order by 1";
        rsConsulta = conn.getData(cadena);
        ArrayList items = new ArrayList();
        while (rsConsulta.next())
        {
          ClaseDep item = new ClaseDep();
          item.setCodigo(rsConsulta.getString("idobra"));
          item.setDescr(rsConsulta.getString("titulo")+" ("+rsConsulta.getString("precio")+"Bs.)");
          items.add(item);
          System.out.println("Paso ..");
      }  
      request.getSession().setAttribute("ayuda",items);
      return mapping.findForward("compras");
    }
	
      catch(Exception e)
      {
        e.printStackTrace();
        return (mapping.findForward("mala"));
      }
      finally
      {
        conn.closeConnection();	
      }
  }else if(boton.equals("Ventas")) {
    Connection cn = null;
    ConnectDB conn =new ConnectDB();
    ResultSet rsConsulta = null;
    
    try
    {
      cn = conn.conexion;
      String cadena = "select a.idcompra, TO_CHAR(a.fecha,'DD/MM/YYYY') as FECHA, TO_CHAR(a.fecha,'hh24:mi:ss') as HORA, a.total, b.nombre, b.apellido, c.titulo from jd_compra a, jd_cliente b, jd_obra c where a.idcliente = b.idcliente and c.idobra = a.idobra order by 1";
      rsConsulta = conn.getData(cadena);
      System.out.println(cadena);
      ArrayList items = new ArrayList();
      while (rsConsulta.next())
      {
        ClaseDep item = new ClaseDep();
        item.setIdcompra(rsConsulta.getString("IDCOMPRA"));
        item.setFecha(rsConsulta.getString("FECHA"));
        item.setApecli(rsConsulta.getString("HORA"));
        item.setTotal(rsConsulta.getString("TOTAL"));
        item.setNomcli(rsConsulta.getString("NOMBRE")+" "+rsConsulta.getString("APELLIDO"));
        item.setNomobr(rsConsulta.getString("TITULO"));
        String nome = request.getSession().getAttribute("fn").toString();
        String apee = request.getSession().getAttribute("ln").toString();
        item.setNomemp(nome+" "+apee);
        items.add(item);
        System.out.println("Paso ..");
    }
    ventasActionForm f = new ventasActionForm();	   
    f.setTabla(items);
    request.getSession().setAttribute("nn",f);
      return mapping.findForward("ventas");
	}
	
    catch(Exception e)
    {
      e.printStackTrace();
      return (mapping.findForward("malo"));
    }
    finally
    {
      conn.closeConnection();	
    }
  }else{
    return mapping.findForward("success");
  }

 
  
  
  }
}