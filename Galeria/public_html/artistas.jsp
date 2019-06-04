<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
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
Artistas
</title>
</head>
<body>
<h2>
Artistas: <a class="btn btn-primary" href="editarart.jsp" role="button">Editar</a>
<a class="btn btn-success" href="agregarart.jsp" role="button">Agregar</a>
</h2>
<h4>Filtre los Resultados Aqui!</h4>
<input id="myInput" type="text" class="form-control" placeholder="Busque..">
<html:form action="/art">
<table class="table table-striped">
<thead>
    <tr>
      <th scope="col">Nombre</th>
      <th scope="col">Ciudad</th>
      <th scope="col">Fecha de Nacimiento</th>
       <th scope="col">ID (Click para eliminar)</th>
    </tr>
  </thead>
  <tbody id="myTable">
  <logic:iterate id="tabla" indexId="index" name="nn" property="tabla" >
            <tr>
              <td><bean:write name="tabla" property="nombre"/></td>
              <td><bean:write name="tabla" property="ciudad" /></td>
              <td><bean:write name="tabla" property="fecha_nac" /></td>
              <td><html:submit property="id" styleClass="btn btn-danger">
              <bean:write name="tabla" property="id" />
              </html:submit></td>
            </tr>
  </logic:iterate>
  </tbody>
  </table>
</html:form>
<br>


</body>
</html>
