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
<bean:message key="nombre.promp" />
<html:text property="nombre" />
<bean:message key="apellido.promp" />
<html:text property="apellido" />
<bean:message key="ci.promp" />
<html:text property="ci" />
<bean:message key="fec_nac.promp" />
<html:text property="fec_nac" />
<h4>Datos Compra</h4>
<bean:message key="fecha.promp" />
<html:text property="fecha" value="<%=dateFormat.format(cal.getTime())%>" readonly="TRUE" />
<bean:message key="obra.promp" />
<html:select property="obras">
          <html:options collection="ayuda" property="codigo" labelProperty="descr" />
</html:select>
</html:form>
<p>
<%= new java.util.Date() %></p>
</body>
</html>
