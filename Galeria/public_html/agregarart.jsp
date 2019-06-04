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
</head>
<body>
<h2>
Agregar Artista
</h2>

<html:form action="/agregarart" onsubmit="return fParams( )">
<br>
ID Artista  <html:text styleClass="form-control" property="id" readonly="TRUE" />
<br>
Nombre <html:text property="nombre" styleClass="form-control" />
<br>
Apellido  <html:text property="apellido" styleClass="form-control" />
<br>
Fecha de Nacimiento  <html:text property="fecha_nac" styleClass="form-control" />
<br>
Ciudad
<html:select property="ciudad" styleClass="form-control">
        <html:options collection="ayuda" property="codigo" labelProperty="nomobr" />
      </html:select><br>
<html:submit value="Agregar" styleClass="btn btn-success"  />
</html:form>

</body>
</html>
