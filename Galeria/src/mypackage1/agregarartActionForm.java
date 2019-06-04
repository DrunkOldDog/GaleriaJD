package mypackage1;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class agregarartActionForm extends ActionForm 
{
  String id;
  String nombre;
  String apellido;
  String fecha_nac;
  String ciudad;

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

  public String getNombre()
  {
    return nombre;
  }

  public void setNombre(String newNombre)
  {
    nombre = newNombre;
  }

  public String getApellido()
  {
    return apellido;
  }

  public void setApellido(String newApellido)
  {
    apellido = newApellido;
  }

  public String getFecha_nac()
  {
    return fecha_nac;
  }

  public void setFecha_nac(String newFecha_nac)
  {
    fecha_nac = newFecha_nac;
  }

  public String getCiudad()
  {
    return ciudad;
  }

  public void setCiudad(String newCiudad)
  {
    ciudad = newCiudad;
  }
}