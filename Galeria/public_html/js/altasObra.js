function fParams( )
{
  var Mensaje = "";
  f = document.forms[0];
  
  if(EsVacio( f.titulo.value ))
    Mensaje = Mensaje + 'Verifique el campo Titulo \n';
  if(EsVacio( f.descripcion.value ))
    Mensaje = Mensaje + 'Verifique el campo Descripicion \n';
  if(EsVacio( f.precio.value ))
    Mensaje = Mensaje + 'Verifique el campo Precio \n';
  if(EsVacio( f.fecha.value ))
    Mensaje = Mensaje + 'Verifique el campo Fecha \n';

  if( Mensaje == "" )
    return true;
  else
  {
    alert( Mensaje );
    return false;
  }
}