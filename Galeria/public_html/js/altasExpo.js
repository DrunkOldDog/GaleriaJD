function fParams( )
{
  var Mensaje = "";
  f = document.forms[0];
  
  if(EsVacio( f.titulo.value ))
    Mensaje = Mensaje + 'Verifique el campo Titulo \n';
  if(EsVacio( f.descr.value ))
    Mensaje = Mensaje + 'Verifique el campo Descripicion \n';
  if(EsVacio( f.fecha_ini.value ))
    Mensaje = Mensaje + 'Verifique el campo Fecha Inicio \n';
  if(EsVacio( f.fecha_fin.value ))
    Mensaje = Mensaje + 'Verifique el campo Fecha Fin \n';

  if( Mensaje == "" )
    return true;
  else
  {
    alert( Mensaje );
    return false;
  }
}