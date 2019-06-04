<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css">
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>	
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
Hello World
</title>
</head>
<body>
<h2>Obras en Exposicion:</h2>
<html:form action="/obras">
<table class="table table-striped">
<thead>
    <tr>
      <th scope="col">Exposicion</th>
      <th scope="col">#ID Obra</th>
      <th scope="col">Obra</th>
      <th scope="col">Descripcion</th>
      <th scope="col">Precio</th>
      <th scope="col">Estilo</th>
      <th scope="col">Tipo de Obra</th>
      <th scope="col">Salon</th>
      <th scope="col">Artista</th>
      <th scope="col">Propietario Actual</th>
      <th scope="col">Eliminar ID</th>
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
              <td><html:submit property="boton" styleClass="btn btn-danger">
              <bean:write name="tabla" property="apecli" /></html:submit></td>
            </tr>
  </logic:iterate>
  </table>
  <html:submit styleClass="btn btn-primary" property="boton" value="Add" />
  <html:submit styleClass="btn btn-primary" property="boton" value="Editar" />
</html:form>

<p>
<%= new java.util.Date() %></p>
</body>
</html>
