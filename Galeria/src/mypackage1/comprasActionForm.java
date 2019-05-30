package mypackage1;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class comprasActionForm extends ActionForm 
{
  String fecha;
  String obras;
  String nombre;
  String apellido;
  String ci;
  String fec_nac;

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

  public String getFecha()
  {
    return fecha;
  }

  public void setFecha(String newFecha)
  {
    fecha = newFecha;
  }

  public String getObras()
  {
    return obras;
  }

  public void setObras(String newObras)
  {
    obras = newObras;
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

  public String getCi()
  {
    return ci;
  }

  public void setCi(String newCi)
  {
    ci = newCi;
  }

  public String getFec_nac()
  {
    return fec_nac;
  }

  public void setFec_nac(String newFec_nac)
  {
    fec_nac = newFec_nac;
  }
}