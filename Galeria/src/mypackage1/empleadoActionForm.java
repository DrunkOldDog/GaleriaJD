package mypackage1;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

public class empleadoActionForm extends ActionForm 
{
  String codigo;
  ArrayList tabla;
  String nombre;
  String apellido;
  String fecha_ini;
  String username;

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

  public ArrayList getTabla()
  {
    return tabla;
  }

  public void setTabla(ArrayList newTabla)
  {
    tabla = newTabla;
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

  public String getFecha_ini()
  {
    return fecha_ini;
  }

  public void setFecha_ini(String newFecha_ini)
  {
    fecha_ini = newFecha_ini;
  }

  public String getUsername()
  {
    return username;
  }

  public void setUsername(String newUsername)
  {
    username = newUsername;
  }
}