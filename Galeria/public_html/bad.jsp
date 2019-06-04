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
Error! <%=session.getAttribute("error")%>
</h2>
<h3>Intentelo Mas Tarde..</h3>
<p>
<%= new java.util.Date() %></p>
</body>
</html>
