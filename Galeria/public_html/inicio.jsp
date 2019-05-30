<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
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
Bienvenido <%=session.getAttribute("fn")%>&nbsp;<%=session.getAttribute("ln")%>
</h2>
<html:form action="/inicio">
  <html:submit styleClass="btn btn-secondary" property="boton" value="Clientes" />
  <html:submit styleClass="btn btn-secondary" property="boton" value="Empleados" />
  <html:submit styleClass="btn btn-secondary" property="boton" value="Artistas" />
  <html:submit styleClass="btn btn-secondary" property="boton" value="Propietarios" />
  <html:submit styleClass="btn btn-secondary" property="boton" value="Exposiciones" />
  <html:submit styleClass="btn btn-secondary" property="boton" value="Obras" />
  <html:submit styleClass="btn btn-secondary" property="boton" value="Compras" />
</html:form>

<p>
<%= new java.util.Date() %></p>
</body>
</html>
