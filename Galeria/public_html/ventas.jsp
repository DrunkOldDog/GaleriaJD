<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css">
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
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
Ventas
</title>
</head>
<body>
<h2>
Listado de Ventas
</h2>
<h4>Filtre los Resultados Aqui!</h4>
<input id="myInput" type="text" class="form-control" placeholder="Busque..">
<html:form action="/ventas">
<table class="table table-striped">
<thead>
    <tr>
      <th scope="col">#ID</th>
      <th scope="col">Fecha</th>
      <th scope="col">Hora</th>
      <th scope="col">Total</th>
      <th scope="col">Nombre Cliente</th>
      <th scope="col">Obra</th>
      <th scope="col">Nombre Empleado</th>
    </tr>
  </thead>
    <tbody id="myTable">
  <logic:iterate id="tabla" indexId="index" name="nn" property="tabla" >
            <tr>
              <td><bean:write name="tabla" property="idcompra"/></td>
              <td><bean:write name="tabla" property="fecha" /></td>
              <td><bean:write name="tabla" property="apecli" /></td>
              <td><bean:write name="tabla" property="total" /></td>
              <td><bean:write name="tabla" property="nomcli" /></td>
              <td><bean:write name="tabla" property="nomobr" /></td>
              <td><bean:write name="tabla" property="nomemp" /></td>
            </tr>
  </logic:iterate>
  </tbody>
  </table>
</html:form>
<p>
<%= new java.util.Date() %></p>
</body>
</html>
