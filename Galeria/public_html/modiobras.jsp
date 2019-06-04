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
<h2>
Modifique la Obra
</h2>
<% 
String cod = session.getAttribute("ocod").toString();
String tit = session.getAttribute("otit").toString();
String des = session.getAttribute("odes").toString();
String pre = session.getAttribute("opre").toString();
String exp = session.getAttribute("oexp").toString();
String nom = session.getAttribute("onom").toString();
%>
<html:form action="/editar">
  <label><bean:message key="codi.promp" /></label>
  <html:text styleClass="form-control" property="codigo" value="<%=cod%>" readonly="TRUE" />
  <label><bean:message key="titulo.promp" /></label>
  <html:text styleClass="form-control" property="titulo" value="<%=tit%>"/>
  <label><bean:message key="descripcion.promp" /></label>
  <html:textarea styleClass="form-control" property="descripcion" value="<%=des%>"/>
  <label><bean:message key="precio.promp" /></label>
  <html:text styleClass="form-control" property="precio" value="<%=pre%>"/>
  <p></p>
  <label><bean:message key="exposicion.promp" /></label>
  <html:text styleClass="form-control" property="exposicion" value="<%=exp%>" readonly="TRUE" />
  <label><bean:message key="nombrep.promp" /></label>
  <html:text styleClass="form-control" property="nombre" value="<%=nom%>" readonly="TRUE" />
  <p></p>
  &nbsp;&nbsp;&nbsp;&nbsp;<html:submit styleClass="btn btn-success" value="EDITAR" />
</html:form>
<p>
<%= new java.util.Date() %></p>
</body>
</html>
