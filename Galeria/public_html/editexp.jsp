<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
Exposicion
</title>
<%
  String id =session.getAttribute("codigo").toString();
  String tit =session.getAttribute("nombre").toString();
  String desc =session.getAttribute("descr").toString();
  String fecha_a =session.getAttribute("fecha_ini").toString();
  String fecha_b =session.getAttribute("fecha_fin").toString();
%>
</head>
<body>
<h2>
Editar Exposicion 
</h2>

<html:form action="/cambiarexp">

<br>
ID Exposicion  <html:text styleClass="form-control" property="id" value="<%=id%>" readonly="TRUE" />
<br>
Titulo  <html:text property="titulo" styleClass="form-control"  value="<%=tit%>" />
<br>
Descripcion  <html:text property="descr" styleClass="form-control"  value="<%=desc%>" />
<br>
Fecha Inicio  <html:text property="fecha_ini" styleClass="form-control"  value="<%=fecha_a%>" />
<br>
Fecha Fin <html:text property="fecha_fin" styleClass="form-control"  value="<%=fecha_b%>" />
<br>
<html:submit value="Cambiar" styleClass="btn btn-success"  />
</html:form>

</body>
</html>
