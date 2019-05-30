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
    ConnectDB conn2 =new ConnectDB();
    ResultSet rsConsulta = null;
    ResultSet rsConsulta2 = null;
    
    try
    {
      cn = conn.conexion;
      cn = conn2.conexion;
      String cadena = "select * from jd_compra order by 1";
      rsConsulta = conn.getData(cadena);
      System.out.println(cadena);
      ArrayList items = new ArrayList();
      while (rsConsulta.next())
      {
        ClaseDep item = new ClaseDep();
        item.setIdcompra(rsConsulta.getString("IDCOMPRA"));
        item.setFecha(rsConsulta.getString("FECHA"));
        item.setTotal(rsConsulta.getString("TOTAL"));
        String auxiliar = rsConsulta.getString("IDOBRA").toString();
        cadena = "select * from jd_cliente where IDCLIENTE="+rsConsulta.getString("IDCLIENTE");
        rsConsulta2 = conn2.getData(cadena);
        System.out.println(cadena);
        if(rsConsulta2.next()){
          item.setNomcli(rsConsulta2.getString("NOMBRE"));
          item.setApecli(rsConsulta2.getString("APELLIDO"));
        }

        cadena = "select * from jd_obra where IDOBRA="+auxiliar;
        rsConsulta2 = conn2.getData(cadena);
        System.out.println(cadena);
        if(rsConsulta2.next()){
          item.setNomobr(rsConsulta2.getString("TITULO"));
        }
        
        String nome = request.getSession().getAttribute("fn").toString();
        String apee = request.getSession().getAttribute("ln").toString();
        item.setNomemp(nome);
        item.setApeemp(apee);
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
      conn2.closeConnection();	
    }
  }else{
    return mapping.findForward("success");
  }
  }
}