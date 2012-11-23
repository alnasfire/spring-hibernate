<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Spring Hibernate Example</title>
</head>
<body>
	<jsp:include flush="false" page="menu.jsp" />

	<h2>User List</h2>


	<form:form method="post"
		action="${pageContext.request.contextPath}/user/add"
		commandName="user">
		<jsp:include flush="true" page="user_form.jsp">
			<jsp:param name="adduser" value="true" />
		</jsp:include>
	</form:form>

	<h3>Find user: </h3>
	<form:form method="post"
		action="${pageContext.request.contextPath}/user/find"
		commandName="findUser">
        <form:label path="name"><spring:message code="label.name"/></form:label>
        <form:input path="name" />
        <input type="submit" value="<spring:message code="label.go"/>"/>
	</form:form>

	<h3>
		<spring:message code="label.users" />
	</h3>
	<c:if test="${!empty userList}">
		<table class="data">
			<tr>
				<th><spring:message code="label.name" /></th>
				<th><spring:message code="label.password" /></th>
				<th><spring:message code="label.gender" /></th>
				<th><spring:message code="label.country" /></th>
				<th><spring:message code="label.subscribed" /></th>
				<th>&nbsp;</th>
			</tr>
			<c:forEach items="${userList}" var="user">
				<tr>
					<td>${user.name}</td>
					<td>${user.password}</td>
					<td>${user.gender}</td>
					<td>${user.country.name}</td>
					<td>${user.subscribed}</td>
					<td><a
						href="${pageContext.request.contextPath}/user/edit/${user.id}"><spring:message
								code="label.edit" /></a></td>
					<td><a
						href="${pageContext.request.contextPath}/user/delete/${user.id}"><spring:message
								code="label.delete" /></a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>

</body>
</html>