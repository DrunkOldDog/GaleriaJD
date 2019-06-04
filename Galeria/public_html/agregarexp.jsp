<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
Exposicion
</title>
</head>
<body>
<h2>
Agregar Exposicion 
</h2>
<html:form action="/agregarexp">
<br>
ID Exposicion  <html:text styleClass="form-control" property="id" readonly="TRUE" />
<br>
Titulo  <html:text property="titulo" styleClass="form-control" />
<br>
Descripcion  <html:text property="descr" styleClass="form-control" />
<br>
Fecha Inicio  <html:text property="fecha_ini" styleClass="form-control" />
<br>
Fecha Fin <html:text property="fecha_fin" styleClass="form-control" />
<br>
Estado Activo <input type="radio" name="estado" value="1" checked> Estado Inactivo <input type="radio" name="estado" value="0"><br>
<html:submit value="Agregar" styleClass="btn btn-success"  />
</html:form>
</body>
</html>
