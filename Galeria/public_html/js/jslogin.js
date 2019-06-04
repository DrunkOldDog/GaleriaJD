function fParams( )
{
  var Mensaje = "";
  f = document.forms[0];
  
  if(EsVacio( f.usuario.value ))
    Mensaje = Mensaje + 'Verifique el campo Usuario \n';
  if(EsVacio( f.id.value ))
    Mensaje = Mensaje + 'Verifique el campo ID \n';
    
  if( Mensaje == "" )
    return true;
  else
  {
    alert( Mensaje );
    return false;
  }
}