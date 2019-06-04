<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css">
<title>
Empleado
</title>
</head>
<body>
<h2>
Datos del Empleado
</h2>
<% 
String fn = session.getAttribute("fn").toString();
String ln = session.getAttribute("ln").toString();
String fi = session.getAttribute("fi").toString();
String un = session.getAttribute("un").toString();
String id = session.getAttribute("id").toString();
%>
<html:form action="/editemp">
  <label><bean:message key="codi.promp" /></label>
  <html:text styleClass="form-control" property="codigo" value="<%=id%>" readonly="TRUE" />
  <label><bean:message key="nombre.promp" /></label>
  <html:text styleClass="form-control" property="nombre" value="<%=fn%>"/>
  <label><bean:message key="apellido.promp" /></label>
  <html:text styleClass="form-control" property="apellido" value="<%=ln%>"/>
  <label><bean:message key="fecha_ini.promp" /></label>
  <html:text styleClass="form-control" property="fecha_ini" value="<%=fi%>" readonly="TRUE"/>
  <label><bean:message key="username.promp" /></label>
  <html:text styleClass="form-control" property="username" value="<%=un%>"/>
  <p></p>
  <html:submit styleClass="btn btn-success" value="EDITAR" />
</html:form>

<p>
<%= new java.util.Date() %></p>
</body>
</html>
