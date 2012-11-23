<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <table>
        <tr>
            <td><form:label path="name"><spring:message code="label.name"/></form:label></td>
        <td><form:input path="name" /></td>
        </tr>
        <tr>
            <td><form:label path="password"><spring:message code="label.password"/></form:label></td>
        <td><form:input path="password" /></td>
        </tr>
        <tr>
            <td><form:label path="gender"><spring:message code="label.gender"/></form:label></td>
        <td>
        <form:radiobutton path="gender" value="male" /><spring:message code="label.male"/>
        <form:radiobutton path="gender" value="female" /><spring:message code="label.female"/>
        </td>
        </tr>
        <tr>
            <td><form:label path="country"><spring:message code="label.country"/></form:label></td>
        <td>
            <form:select path="country.id">
            	<form:option value="0" label="Select" />
            	<form:options items="${countryList}" itemValue="id" itemLabel="name" />
            </form:select>
        </td>
        </tr>
        <tr>
            <td><form:label path="subscribed"><spring:message code="label.subscribed"/></form:label></td>
        <td><form:checkbox path="subscribed" label="Would you like to join our mailinglist?" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="<spring:message code="label.saveuser"/>"/>
            </td>
        </tr>
    </table>