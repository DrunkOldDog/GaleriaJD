<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css">
<script type="text/javascript" language="JavaScript" src="js/altasObra.js"></script>	
<script type="text/javascript" language="JavaScript" src="js/valida.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
Hello World
</title>
</head>
<body>
<h2>Ingresar una Nueva Obra</h2>
<html:form action="/addobra" onsubmit="return fParams( )">
  <bean:message key="titulo.promp" />
  <html:text styleClass="form-control" property="titulo" />
  <bean:message key="descripcion.promp" />
  <html:textarea styleClass="form-control" property="descripcion" />
  <bean:message key="precio.promp" />
  <html:text styleClass="form-control" property="precio" onkeypress="EvaluateText('%d', this)"/>
  <bean:message key="fecha.promp" />
  <html:text styleClass="form-control" property="fecha" />
  <h3>Datos Descriptivos:</h3>
  <bean:message key="exposicion.promp" />
  <html:select styleClass="form-control" property="exposicion">
            <html:options collection="ayuda" property="codigo" labelProperty="descr" />
  </html:select>
  <bean:message key="estilo.promp" />
  <html:select styleClass="form-control" property="estilo">
            <html:options collection="ayuda2" property="codigo" labelProperty="descr" />
  </html:select>
  <bean:message key="tipo.promp" />
  <html:select styleClass="form-control" property="tipo">
            <html:options collection="ayuda3" property="codigo" labelProperty="descr" />
  </html:select>
  <bean:message key="artista.promp" />
  <html:select styleClass="form-control" property="artista">
            <html:options collection="ayuda4" property="codigo" labelProperty="descr" />
  </html:select>
  <bean:message key="salon.promp" />
  <html:select styleClass="form-control" property="salon">
            <html:options collection="ayuda5" property="codigo" labelProperty="descr" />
  </html:select>
  <p></p>
  &nbsp;&nbsp;&nbsp;<html:submit styleClass="btn btn-success" value="Add" />
</html:form>
<p>
<%= new java.util.Date() %></p>
</body>
</html>
