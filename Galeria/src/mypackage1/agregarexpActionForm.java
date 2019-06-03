package mypackage1;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class agregarexpActionForm extends ActionForm 
{
  String id;
  String titulo;
  String descr;
  String fecha_ini;
  String fecha_fin;
  String estado;

  /**
   * Reset all properties to their default values.
   * @param mapping The ActionMapping used to select this instance.
   * @param request The HTTP Request we are processing.
   */
  public void reset(ActionMapping mapping, HttpServletRequest request)
  {
    super.reset(mapping, request);
  }

  /**
   * Validate all properties to their default values.
   * @param mapping The ActionMapping used to select this instance.
   * @param request The HTTP Request we are processing.
   * @return ActionErrors A list of all errors found.
   */
  public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
  {
    return super.validate(mapping, request);
  }

  public String getId()
  {
    return id;
  }

  public void setId(String newId)
  {
    id = newId;
  }

  public String getTitulo()
  {
    return titulo;
  }

  public void setTitulo(String newTitulo)
  {
    titulo = newTitulo;
  }

  public String getDescr()
  {
    return descr;
  }

  public void setDescr(String newDescr)
  {
    descr = newDescr;
  }

  public String getFecha_ini()
  {
    return fecha_ini;
  }

  public void setFecha_ini(String newFecha_ini)
  {
    fecha_ini = newFecha_ini;
  }

  public String getFecha_fin()
  {
    return fecha_fin;
  }

  public void setFecha_fin(String newFecha_fin)
  {
    fecha_fin = newFecha_fin;
  }

  public String getEstado()
  {
    return estado;
  }

  public void setEstado(String newEstado)
  {
    estado = newEstado;
  }
}