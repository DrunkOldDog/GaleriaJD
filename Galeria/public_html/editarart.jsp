<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css">
<script type="text/javascript" language="JavaScript" src="js/valida.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
Artistas
</title>
</head>
<body>
<h2>
Editar Artista
</h2><br>
<html:form action="/buscarart">
<h5>Ingrese el Codigo de Artista: </h5> <html:text property="cod" onkeypress="EvaluateText('%d', this)" styleClass="form-control"/><br>

<html:submit value="Modificar" styleClass="btn btn-info"/>

</html:form>
</body>
</html>
