<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
Exposiciones
</title>
</head>
<body>
<h2>
Exposiciones 
</h2>
<html:form action="/exp">
<table class="table table-striped">
<thead>
    <tr>
      <th scope="col">Nombre</th>
      <th scope="col">Descripcion</th>
      <th scope="col">Fecha de Inicio</th>
      <th scope="col">Fecha de Cierre</th>
       <th scope="col">ID (Click para eliminar)</th>
    </tr>
  </thead>
  <logic:iterate id="tabla" indexId="index" name="nn" property="tabla" >
            <tr>
              <td><bean:write name="tabla" property="titulo"/></td>
              <td><bean:write name="tabla" property="descr" /></td>
              <td><bean:write name="tabla" property="fecha_ini" /></td>
              <td><bean:write name="tabla" property="fecha_cierre" /></td>
              <td><center><html:submit property="id" styleClass="btn btn-danger">
              <bean:write name="tabla" property="id" />
              </html:submit></center></td>
            </tr>
  </logic:iterate>
  </table>
</html:form>
<br>
<center><h5>
Editar Exposicion: <a class="btn btn-primary" href="editarexp.jsp" role="button">Editar</a> Agregar Exposicion: <a class="btn btn-success" href="agregarexp.jsp" role="button">Agregar</a>
</h5>
</body>
</html>
