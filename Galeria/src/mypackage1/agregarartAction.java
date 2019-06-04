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
public class agregarartAction extends Action 
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

    agregarartActionForm cc = (agregarartActionForm) form;
      String cod = cc.getId();
      String name = cc.getNombre();
      String lastname = cc.getApellido();
      String date = cc.getFecha_nac();
      String city = cc.getCiudad();
    
       Connection cn = null;
    ConnectDB conn =new ConnectDB();
    ResultSet rsConsulta = null;
    ResultSet rsConsulta2 = null;
    try
    {

         cn = conn.conexion;

        String cadena="SELECT * FROM jd_artista WHERE idartista = (SELECT MAX(IDARTISTA) FROM jd_ARTISTA)";
        System.out.println(cadena);
          rsConsulta2 = conn.getData(cadena);
           if (rsConsulta2.next()){
          int valorc = Integer.parseInt(rsConsulta2.getString("IDARTISTA"))+1;
          System.out.println(valorc);

          
          String cadenab = "insert into jd_ARTISTA values ("+valorc+",'"+name+"','"+lastname+"',TO_DATE('"+date+"','DD/MM/YYYY'), '"+city+"')";
          System.out.println(cadenab);   
         int a = conn.InsertaDatos(cadenab);

         String cadenac = "insert into jd_propietario values ("+valorc+",'"+name+"','"+lastname+"',TO_DATE('"+date+"','DD/MM/YYYY'))";
          System.out.println(cadenac);   
         int c = conn.InsertaDatos(cadenac);
           }
         
          
         return mapping.findForward("bueno");
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