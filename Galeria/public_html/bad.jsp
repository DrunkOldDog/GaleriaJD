<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
Error
</title>
</head>
<body>
<center><h2>
Error! <%=session.getAttribute("error")%>
</h2>
<h3>Intentelo Mas Tarde..</h3></center>
<p>
<%= new java.util.Date() %></p>
</body>
</html>
