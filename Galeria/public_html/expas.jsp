<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>	
<script>
$(document).ready(function(){
  $("#myInput").on("keyup", function() {
    var value = $(this).val().toLowerCase();
    $("#myTable tr").filter(function() {
      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    });
  });
});
</script>
<title>
Hello World
</title>
</head>
<body>
<h2>
Exposiciones Pasadas:
</h2>
  <h4>Filtre los Resultados Aqui!</h4>
  <input id="myInput" type="text" class="form-control" placeholder="Busque..">
<table class="table table-striped">
<thead>
    <tr>
      <th scope="col">Exposicion</th>
      <th scope="col">Fecha de Cierre</th>
      <th scope="col">Obra</th>
      <th scope="col">Descripcion</th>
      <th scope="col">Precio</th>
      <th scope="col">Estilo</th>
      <th scope="col">Tipo de Obra</th>
      <th scope="col">Salon</th>
      <th scope="col">Artista</th>
      <th scope="col">Propietario Actual</th>
    </tr>
  </thead>

    <tbody id="myTable">

  <logic:iterate id="tabla" indexId="index" name="nn" property="tabla" >
            <tr>
              <td><bean:write name="tabla" property="fecha" /></td>
              <td><bean:write name="tabla" property="apecli" /></td>
              <td><bean:write name="tabla" property="nomobr" /></td>
              <td><bean:write name="tabla" property="descr" /></td>
              <td><bean:write name="tabla" property="total" /></td>
              <td><bean:write name="tabla" property="codigo" /></td>
              <td><bean:write name="tabla" property="apeemp" /></td>
              <td><bean:write name="tabla" property="nomemp" /></td>
              <td><bean:write name="tabla" property="nomcli" /></td>
              <td><bean:write name="tabla" property="idcompra"/></td>
            </tr>
  </logic:iterate>
  </tbody>
  </table>

<p>
<%= new java.util.Date() %></p>
</body>
</html>
