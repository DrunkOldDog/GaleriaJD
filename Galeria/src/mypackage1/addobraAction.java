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

public class addobraAction extends Action 
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
    addobraActionForm cc = (addobraActionForm) form;
    String tit = cc.getTitulo();
    String des = cc.getDescripcion();
    String pre = cc.getPrecio();
    String fec = cc.getFecha();
    String exp = cc.getExposicion();
    String est = cc.getEstilo();
    String tip = cc.getTipo();
    String art = cc.getArtista();
    String sal = cc.getSalon();
    
    int valorc = 0;
    int valors = 0;
    int valor = 0;
    Connection cn = null;
    ConnectDB conn =new ConnectDB();
    ResultSet rsConsulta = null;
    ResultSet rsConsulta2 = null;

       try
       {
        cn = conn.conexion;
        String cadena="SELECT * FROM jd_obra WHERE idobra = (SELECT MAX(idobra) FROM jd_obra)";
        System.out.println(cadena);
        rsConsulta2 = conn.getData(cadena);
        if (rsConsulta2.next()){
           valorc = Integer.parseInt(rsConsulta2.getString("idobra"))+1;
           System.out.println(valorc);
           cadena = "insert into jd_obra values ("+valorc+",'"+tit+"','"+des+"',"+pre+",TO_DATE('"+fec+"','DD/MM/YYYY'),"+art+","+est+","+tip+",0)";
           System.out.println(cadena);
           int a = conn.InsertaDatos(cadena);
        }
        
        cadena="SELECT * FROM JD_EXPOBRA WHERE IDEXPOBRA = (SELECT MAX(IDEXPOBRA) FROM JD_EXPOBRA)";
        System.out.println(cadena);
        rsConsulta = conn.getData(cadena);
        if (rsConsulta.next()){
           valor = Integer.parseInt(rsConsulta.getString("IDEXPOBRA"))+1;
           System.out.println(valor);
           cadena = "insert into JD_EXPOBRA values ("+valor+","+exp+","+valorc+","+sal+")";
           System.out.println(cadena);
           int a = conn.InsertaDatos(cadena);
        }

        cadena="SELECT * FROM JD_ARTOBRA WHERE IDARTOBRA = (SELECT MAX(IDARTOBRA) FROM JD_ARTOBRA)";
        System.out.println(cadena);
        rsConsulta = conn.getData(cadena);
        if (rsConsulta.next()){
           valors = Integer.parseInt(rsConsulta.getString("IDARTOBRA"))+1;
           System.out.println(valors);
           cadena = "insert into JD_ARTOBRA values ("+valors+","+art+","+valorc+")";
           System.out.println(cadena);
           int a = conn.InsertaDatos(cadena);
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