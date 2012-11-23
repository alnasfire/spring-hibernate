<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Spring Hibernate Example</title>
</head>
<body>
	<jsp:include flush="false" page="menu.jsp" />

	<h2>Country List</h2>

	<form:form method="post"
		action="${pageContext.request.contextPath}/country/add"
		commandName="country">
		<jsp:include flush="true" page="country_form.jsp">
			<jsp:param name="adduser" value="true" />
		</jsp:include>
	</form:form>

	<h3>
		<spring:message code="label.countries" />
	</h3>
	<c:if test="${!empty countryList}">
		<table class="data">
			<tr>
				<th><spring:message code="label.name" /></th>
				<th>&nbsp;</th>
			</tr>
			<c:forEach items="${countryList}" var="country">
				<tr>
					<td>${country.name}</td>
					<td><a
						href="${pageContext.request.contextPath}/country/edit/${country.id}"><spring:message
								code="label.edit" /></a></td>
					<td><a
						href="${pageContext.request.contextPath}/country/delete/${country.id}"><spring:message
								code="label.delete" /></a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>

</body>
</html>