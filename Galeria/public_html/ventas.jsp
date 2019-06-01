<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
Ventas
</title>
</head>
<body>
<h2>
Listado de Ventas
</h2>
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
  </table>
</html:form>
<p>
<%= new java.util.Date() %></p>
</body>
</html>
