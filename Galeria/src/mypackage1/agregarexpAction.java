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
import java.lang.String;
import java.util.Date;
import java.text.SimpleDateFormat;  

public class agregarexpAction extends Action 
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

    Calendar cal = Calendar.getInstance();   

      agregarexpActionForm cc = (agregarexpActionForm) form;
      String cod = cc.getId();
      String tit = cc.getTitulo();
      String descr = cc.getDescr();
      String fecha_a = cc.getFecha_ini();
      String fecha_b = cc.getFecha_fin();
      String status = cc.getEstado();
    
       Connection cn = null;
    ConnectDB conn =new ConnectDB();
    ResultSet rsConsulta = null;
    ResultSet rsConsulta2 = null;
    try
    {

         cn = conn.conexion;

        String cadena="SELECT * FROM jd_exposicion WHERE idexposicion = (SELECT MAX(IDEXPOSICION) FROM jd_EXPOSICION)";
        System.out.println(cadena);
          rsConsulta2 = conn.getData(cadena);
           if (rsConsulta2.next()){
          int valorc = Integer.parseInt(rsConsulta2.getString("IDexposicion"))+1;
          System.out.println(valorc);
          String cadenab = "insert into jd_exposicion values ("+valorc+",'"+tit+"','"+descr+"',TO_DATE('"+fecha_a+"','DD/MM/YYYY'), TO_DATE('"+fecha_b+"','DD/MM/YYYY'), '"+status+"')";
          System.out.println(cadenab);   
         int a = conn.InsertaDatos(cadenab);
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