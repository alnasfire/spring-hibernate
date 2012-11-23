<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<jsp:include flush="false" page="menu.jsp" />
	<h2>Home page ${user.name}</h2>
</body>
</html>
