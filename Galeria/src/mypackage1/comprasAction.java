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

public class comprasAction extends Action 
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
    comprasActionForm cc = (comprasActionForm) form;
    String fec = cc.getFecha();
    String obr = cc.getObras();
    String nom = cc.getNombre();
    String ape = cc.getApellido();
    String ci = cc.getCi();
    String fen = cc.getFec_nac();
    String obrisha = null;
    int valorc = 0;
    
    Connection cn = null;
    ConnectDB conn =new ConnectDB();
    ResultSet rsConsulta = null;
    ResultSet rsConsulta2 = null;

       try
       {
         cn = conn.conexion;

        String cadena="SELECT * FROM jd_cliente WHERE CI = '"+ci+"'";
        System.out.println(cadena);
        rsConsulta = conn.getData(cadena);
        if (rsConsulta.next()){
           valorc = Integer.parseInt(rsConsulta.getString("IDCLIENTE"));
           System.out.println(valorc);
           cadena = "update jd_cliente SET NOMBRE='"+nom+"', APELLIDO='"+ape+"', FEC_NAC=TO_DATE('"+fen+"','DD/MM/YYYY') WHERE IDCLIENTE="+valorc;
           System.out.println(cadena);
           int a = conn.InsertaDatos(cadena);
        }else{
        cadena="SELECT * FROM jd_cliente WHERE IDCLIENTE = (SELECT MAX(IDCLIENTE) FROM jd_cliente)";
        System.out.println(cadena);
        rsConsulta2 = conn.getData(cadena);
        if (rsConsulta2.next()){
           valorc = Integer.parseInt(rsConsulta2.getString("IDCLIENTE"))+1;
           System.out.println(valorc);
           cadena = "insert into jd_cliente values ("+valorc+",'"+nom+"','"+ape+"','"+ci+"',TO_DATE('"+fen+"','DD/MM/YYYY'))";
           System.out.println(cadena);
           int a = conn.InsertaDatos(cadena);
        }
        }

        cadena="SELECT * FROM JD_OBRA WHERE IDOBRA = "+obr;
        System.out.println(cadena);
        rsConsulta = conn.getData(cadena);
        if (rsConsulta.next()){
           obrisha = rsConsulta.getString("PRECIO");
           System.out.println(obrisha);
        }

        cadena="SELECT * FROM JD_COMPRA WHERE IDCOMPRA = (SELECT MAX(IDCOMPRA) FROM JD_COMPRA)";
        System.out.println(cadena);
        rsConsulta = conn.getData(cadena);
        if (rsConsulta.next()){
           int valor = Integer.parseInt(rsConsulta.getString("IDCOMPRA"))+1;
           System.out.println(valor);
           cadena = "insert into JD_COMPRA values ("+valor+",CURRENT_TIMESTAMP,"+obrisha+","+valorc+","+obr+","+request.getSession().getAttribute("id")+")";
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