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

public class editobrasAction extends Action 
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
    editobrasActionForm cc = (editobrasActionForm) form;
    String cod = cc.getCodigo();
    
    Connection cn = null;
    ConnectDB conn =new ConnectDB();
    ResultSet rsConsulta = null;

       try
       {
         cn = conn.conexion;
         String cadena = "select o.idobra, e.titulo as EXPOSICION, o.titulo, o.descripcion, o.precio, es.nombre as ESTILO, t.nombre as TIPO_OBRA, s.nombre as SALON, a.nombre, a.apellido from jd_exposicion e, jd_obra o, jd_estilo es, jd_tipo_obra t, jd_salon s, jd_artista a, jd_expobra eo, jd_artobra ao where ao.idartista = a.idartista and ao.idobra = o.idobra and eo.idobra = o.idobra and eo.idexposicion = e.idexposicion and eo.idsalon = s.idsalon and o.idestilo = es.idestilo and o.idtipo_obra = t.idtipo_obra and e.estado = 1 and e.fec_cie >= CURRENT_DATE AND o.IDOBRA ="+cod;
         System.out.println(cadena);
         int a = conn.InsertaDatos(cadena);
         rsConsulta = conn.getData(cadena);
         while (rsConsulta.next()){
         request.getSession().setAttribute("ocod",rsConsulta.getString("IDOBRA"));
         request.getSession().setAttribute("oexp",rsConsulta.getString("EXPOSICION"));
         request.getSession().setAttribute("otit",rsConsulta.getString("TITULO"));
         request.getSession().setAttribute("odes",rsConsulta.getString("DESCRIPCION"));
         request.getSession().setAttribute("opre",rsConsulta.getString("PRECIO"));
         request.getSession().setAttribute("oest",rsConsulta.getString("ESTILO"));
         request.getSession().setAttribute("otip",rsConsulta.getString("TIPO_OBRA"));
         request.getSession().setAttribute("osal",rsConsulta.getString("SALON"));
         request.getSession().setAttribute("onom",rsConsulta.getString("NOMBRE")+" "rsConsulta.getString("APELLIDO"));
         }
         return mapping.findForward("edit");
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