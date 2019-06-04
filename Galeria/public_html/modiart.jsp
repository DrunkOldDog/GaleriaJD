<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css">
<script type="text/javascript" language="JavaScript" src="js/altasArt.js"></script>	
<script type="text/javascript" language="JavaScript" src="js/valida.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
Artista
</title>
<%
  String id =session.getAttribute("codigo").toString();
  String name =session.getAttribute("nombre").toString();
  String lastname =session.getAttribute("apellido").toString();
  String date =session.getAttribute("fecha_nac").toString();
  String ciudad =session.getAttribute("city").toString();
  String idciud =session.getAttribute("idcity").toString();
%>
</head>
<body>
<h2>
Editar Artista
</h2>

<html:form action="/cambiarart" onsubmit="return fParams( )">

<br>
ID Artista  <html:text styleClass="form-control" property="id" value="<%=id%>" readonly="TRUE" />
<br>
Fecha Nacimiento  <html:text property="fecha_nac" styleClass="form-control"  value="<%=date%>" readonly="TRUE" />
<br>
Ciudad <html:text property="ciudad" styleClass="form-control"  value="<%=ciudad%>" readonly="TRUE" />
<br>
Nombre  <html:text property="nombre" styleClass="form-control"  value="<%=name%>" />
<br>
Apellido  <html:text property="apellido" styleClass="form-control"  value="<%=lastname%>" />
<br>

<html:hidden property="idcity" value="<%=idciud%>"/>

<br>
<html:submit value="Cambiar" styleClass="btn btn-success"  />
</html:form>


</body>
</html>
