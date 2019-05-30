<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
Login
</title>
</head>
<body>

<html:form action="/login">
<table class="table table-hover">
<tr>
    <td colspan="2"><bean:message key="tit.promp" /></td>
   
</tr>
<tr>
    <td><bean:message key="nom.promp" />


</td>
    <td><html:text property="usuario" /></td>
</tr>
<tr>
    <td><bean:message key="cod.promp" />
</td>
    <td><html:password property="id" /></td>
</tr>
<tr>
    <td colspan="2"><html:submit value="Ingresar" />
</td>
</tr>
</table>
</html:form>
</body>
</html>
