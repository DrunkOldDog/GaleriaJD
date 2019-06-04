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

public class editarartAction extends Action 
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

    editarartActionForm cc = (editarartActionForm) form;
      String cod = cc.getCod();

       Connection cn = null;
    ConnectDB conn =new ConnectDB();
    ResultSet rsConsulta = null;
    try
    {
      cn = conn.conexion;
      String cadena = "Select b.idciudad, a.idartista,a.nombre,a.apellido,TO_CHAR(a.fec_nac,'DD/MM/YYYY') as fec_nac, b.nombre as ciudad from jd_artista a, jd_ciudad b where a.idartista='"+cod+"' and a.idciudad = b.idciudad order by 1";
      System.out.println(cadena);
      rsConsulta = conn.getData(cadena);
      if (rsConsulta.next())
      {
        request.getSession().setAttribute("codigo",rsConsulta.getString("idartista")); 
        request.getSession().setAttribute("nombre",rsConsulta.getString("nombre")); 
        request.getSession().setAttribute("apellido",rsConsulta.getString("apellido")); 
        request.getSession().setAttribute("fecha_nac",rsConsulta.getString("fec_nac")); 
        request.getSession().setAttribute("city",rsConsulta.getString("ciudad"));
        request.getSession().setAttribute("idcity",rsConsulta.getString("idciudad"));
        return mapping.findForward("editarart");
      }
      else
       return mapping.findForward("malo");
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