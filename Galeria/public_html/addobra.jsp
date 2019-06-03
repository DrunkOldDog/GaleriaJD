<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
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
<h2>Ingresar una Nueva Obra</h2>
<html:form action="/addobra">
  <bean:message key="titulo.promp" />
  <html:text property="titulo" />
  <bean:message key="descripcion.promp" />
  <html:textarea style="width:400px" property="descripcion" />
  <bean:message key="precio.promp" />
  <html:text property="precio" />
  <bean:message key="fecha.promp" />
  <html:text property="fecha" />
  <p></p>
  <bean:message key="exposicion.promp" />
  <html:select property="exposicion">
            <html:options collection="ayuda" property="codigo" labelProperty="descr" />
  </html:select>
  <bean:message key="estilo.promp" />
  <html:select property="estilo">
            <html:options collection="ayuda2" property="codigo" labelProperty="descr" />
  </html:select>
  <bean:message key="tipo.promp" />
  <html:select property="tipo">
            <html:options collection="ayuda3" property="codigo" labelProperty="descr" />
  </html:select>
  <bean:message key="artista.promp" />
  <html:select property="artista">
            <html:options collection="ayuda4" property="codigo" labelProperty="descr" />
  </html:select>
  <bean:message key="salon.promp" />
  <html:select property="salon">
            <html:options collection="ayuda5" property="codigo" labelProperty="descr" />
  </html:select>
  <p></p>
  &nbsp;&nbsp;&nbsp;<html:submit styleClass="btn btn-success" value="Add" />
</html:form>
<p>
<%= new java.util.Date() %></p>
</body>
</html>
