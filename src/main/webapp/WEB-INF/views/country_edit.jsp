<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Spring Hibernate Example</title>
</head>
<body>
	<jsp:include flush="false" page="menu.jsp" />

	<h2>Edit '${country.name}'</h2>
	
	<form:form method="post"
		action="${pageContext.request.contextPath}/country/save"
		commandName="country">
		<form:hidden path="id" />
		<jsp:include flush="true" page="country_form.jsp" />
	</form:form>

	<a href="${pageContext.request.contextPath}/country/index"
		title="Country List">Country List</a>
</body>
</html>