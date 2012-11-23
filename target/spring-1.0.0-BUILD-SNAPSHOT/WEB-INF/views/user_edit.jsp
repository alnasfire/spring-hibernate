<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Spring Hibernate Example</title>
</head>
<body>
	<jsp:include flush="false" page="menu.jsp" />

	<h2>Edit '${user.name}' from ${user.country.name}</h2>

	<form:form method="post"
		action="${pageContext.request.contextPath}/user/save"
		commandName="user">
		<form:hidden path="id" />
		<jsp:include flush="true" page="user_form.jsp" />
	</form:form>

	<a href="${pageContext.request.contextPath}/user/index"
		title="User List">User List</a>
</body>
</html>