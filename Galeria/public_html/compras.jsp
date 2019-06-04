<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@page import="java.text.SimpleDateFormat, java.util.Calendar, java.text.DateFormat"%>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css">
<link type="text/css" rel="stylesheet" href="css/estilo.css">
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
Hello World
</title>
</head>
<body>
<h2>
Formulario de Compra
</h2>
<%
   DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
   Calendar cal = Calendar.getInstance();           
%>
<html:form action="/compras">
<h4>Datos Cliente</h4>
<label><bean:message key="nombre.promp" /></label>
<html:text styleClass="form-control" property="nombre" />
<label><bean:message key="apellido.promp" /></label>
<html:text styleClass="form-control" property="apellido" />
<label><bean:message key="ci.promp" /></label>
<html:text styleClass="form-control" property="ci" />
<label><bean:message key="fec_nac.promp" /></label>
<html:text styleClass="form-control" property="fec_nac" />
<p></p>
<h4>Datos Compra</h4>
<label><bean:message key="fecha.promp" /></label>
<html:text styleClass="form-control" property="fecha" value="<%=dateFormat.format(cal.getTime())%>" readonly="TRUE" />
<label><bean:message key="obra.promp" /></label>
<html:select styleClass="form-control" property="obras">
          <html:options collection="ayuda" property="codigo" labelProperty="descr" />
</html:select>
<p></p>
<html:submit styleClass="btn btn-success" value="Realizar Compra" />
</html:form>
<p>
<%= new java.util.Date() %></p>
</body>
</html>
