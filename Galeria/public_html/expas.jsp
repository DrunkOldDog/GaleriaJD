<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
Hello World
</title>
</head>
<body>
<h2>
Exposiciones Pasadas:
</h2>
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
  </table>

<p>
<%= new java.util.Date() %></p>
</body>
</html>
