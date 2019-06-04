package mypackage1;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class modiobrasActionForm extends ActionForm 
{
  String codigo;
  String titulo;
  String descripcion;
  String precio;
  String exposicion;
  String nombre;

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

  public String getCodigo()
  {
    return codigo;
  }

  public void setCodigo(String newCodigo)
  {
    codigo = newCodigo;
  }

  public String getTitulo()
  {
    return titulo;
  }

  public void setTitulo(String newTitulo)
  {
    titulo = newTitulo;
  }

  public String getDescripcion()
  {
    return descripcion;
  }

  public void setDescripcion(String newDescripcion)
  {
    descripcion = newDescripcion;
  }

  public String getPrecio()
  {
    return precio;
  }

  public void setPrecio(String newPrecio)
  {
    precio = newPrecio;
  }

  public String getExposicion()
  {
    return exposicion;
  }

  public void setExposicion(String newExposicion)
  {
    exposicion = newExposicion;
  }

  public String getNombre()
  {
    return nombre;
  }

  public void setNombre(String newNombre)
  {
    nombre = newNombre;
  }
}