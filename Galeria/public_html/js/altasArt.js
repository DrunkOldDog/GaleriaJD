function fParams( )
{
  var Mensaje = "";
  f = document.forms[0];
  
  if(EsVacio( f.nombre.value ))
    Mensaje = Mensaje + 'Verifique el campo Nombre \n';
  if(EsVacio( f.apellido.value ))
    Mensaje = Mensaje + 'Verifique el campo Apellido \n';
  if(EsVacio( f.fecha_nac.value ))
    Mensaje = Mensaje + 'Verifique el campo Fecha de Nacimiento \n';

  if( Mensaje == "" )
    return true;
  else
  {
    alert( Mensaje );
    return false;
  }
}