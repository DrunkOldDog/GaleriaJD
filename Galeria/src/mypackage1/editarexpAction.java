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
public class editarexpAction extends Action 
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
        editarexpActionForm cc = (editarexpActionForm) form;
      String cod = cc.getCod();

       Connection cn = null;
    ConnectDB conn =new ConnectDB();
    ResultSet rsConsulta = null;
    try
    {
      cn = conn.conexion;
      String cadena = "select idexposicion,titulo,descripcion,TO_CHAR(fec_ini,'DD/MM/YYYY') as fec_ini,TO_CHAR(fec_cie,'DD/MM/YYYY') as fec_cie from jd_exposicion where idexposicion='"+cod+"'";
      System.out.println(cadena);
      rsConsulta = conn.getData(cadena);
      if (rsConsulta.next())
      {
        request.getSession().setAttribute("codigo",rsConsulta.getString("idexposicion")); 
        request.getSession().setAttribute("nombre",rsConsulta.getString("titulo")); 
        request.getSession().setAttribute("descr",rsConsulta.getString("descripcion")); 
        request.getSession().setAttribute("fecha_ini",rsConsulta.getString("fec_ini")); 
        request.getSession().setAttribute("fecha_fin",rsConsulta.getString("fec_cie"));
        return mapping.findForward("editarex");
      }
      else{
       request.getSession().setAttribute("error","La Exposicion con el ID: "+cod+" no se encuentra disponible actualmente");
       return mapping.findForward("malo");
      }
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

  }
}