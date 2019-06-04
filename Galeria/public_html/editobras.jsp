<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
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
<h2>Editar Obras:</h2>
<h3>Ingrese el Codigo Correspondiente</h3>
  <html:form action="/editobras">
    <bean:message key="codi.promp" />
    <html:text property="codigo" />
    <html:submit value="Buscar" />
  </html:form>
<p>
<%= new java.util.Date() %></p>
</body>
</html>
