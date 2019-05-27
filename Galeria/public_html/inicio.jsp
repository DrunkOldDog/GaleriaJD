<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
Hello World
</title>
</head>
<body>
<h2>
Bienvenido!
</h2>
<html:form action="/inicio">
  <html:submit property="boton" value="Clientes" />
  <html:submit property="boton" value="Empleados" />
  <html:submit property="boton" value="Artistas" />
  <html:submit property="boton" value="Propietarios" />
  <html:submit property="boton" value="Exposiciones" />
  <html:submit property="boton" value="Obras" />
  <html:submit property="boton" value="Compras" />
</html:form>

<p>
<%= new java.util.Date() %></p>
</body>
</html>
