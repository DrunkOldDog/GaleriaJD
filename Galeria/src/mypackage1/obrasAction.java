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

public class obrasAction extends Action 
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
    obrasActionForm abm = (obrasActionForm) form;
    String boton = abm.getBoton();
    if (boton.equals("Add")) {
      Connection cn = null;
      ConnectDB conn =new ConnectDB();
      ResultSet rsConsulta = null;
      try
      {
      //exposiciones
        cn = conn.conexion;
        String cadena = "select * from jd_exposicion where estado=1 and fec_cie >= CURRENT_DATE order by 1";
        rsConsulta = conn.getData(cadena);
        ArrayList items = new ArrayList();
        while (rsConsulta.next())
        {
          ClaseDep item = new ClaseDep();
          item.setCodigo(rsConsulta.getString("idexposicion"));
          item.setDescr(rsConsulta.getString("titulo"));
          items.add(item);
          System.out.println("Paso ..");
        }  
        request.getSession().setAttribute("ayuda",items);
        //estilos
        cadena = "select * from jd_estilo order by 1";
        rsConsulta = conn.getData(cadena);
        ArrayList items2 = new ArrayList();
        while (rsConsulta.next())
        {
          ClaseDep item2 = new ClaseDep();
          item2.setCodigo(rsConsulta.getString("IDESTILO"));
          item2.setDescr(rsConsulta.getString("NOMBRE"));
          items2.add(item2);
          System.out.println("Paso ..");
        }  
        request.getSession().setAttribute("ayuda2",items2);
        //tipo
        cadena = "select * from jd_tipo_obra order by 1";
        rsConsulta = conn.getData(cadena);
        ArrayList items3 = new ArrayList();
        while (rsConsulta.next())
        {
          ClaseDep item3 = new ClaseDep();
          item3.setCodigo(rsConsulta.getString("IDTIPO_OBRA"));
          item3.setDescr(rsConsulta.getString("NOMBRE"));
          items3.add(item3);
          System.out.println("Paso ..");
        }  
        request.getSession().setAttribute("ayuda3",items3);
        //artista
        cadena = "select * from jd_artista order by 1";
        rsConsulta = conn.getData(cadena);
        ArrayList items4 = new ArrayList();
        while (rsConsulta.next())
        {
          ClaseDep item4 = new ClaseDep();
          item4.setCodigo(rsConsulta.getString("IDARTISTA"));
          item4.setDescr(rsConsulta.getString("NOMBRE")+" "+rsConsulta.getString("APELLIDO"));
          items4.add(item4);
          System.out.println("Paso ..");
        }  
        request.getSession().setAttribute("ayuda4",items4);
        //salon
        cadena = "select * from jd_salon order by 1";
        rsConsulta = conn.getData(cadena);
        ArrayList items5 = new ArrayList();
        while (rsConsulta.next())
        {
          ClaseDep item5 = new ClaseDep();
          item5.setCodigo(rsConsulta.getString("IDSALON"));
          item5.setDescr(rsConsulta.getString("NOMBRE"));
          items5.add(item5);
          System.out.println("Paso ..");
        }  
        request.getSession().setAttribute("ayuda5",items5);
        return mapping.findForward("addobras");
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
  }else{
      return mapping.findForward("editobras");
  }
  }
}