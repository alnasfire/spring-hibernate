<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<script type="text/javascript">
    function c_r() {
        if (confirm("Are you ready?")) {
            var form = this.parentNode
            this.show("http://localhost:8080")
            form.submit()
        }
    }
</script>
<a href="http://localhost:8080">home</a>

<form action="/proc" method="GET">
    <table border="0">
        <tr>
            <td><b>Login</b></td>
            <td><input type="text" name="login" size="25"/></td>
        </tr>

        <tr>
            <td><b>Password</b></td>
            <td><input type="password" name="password" size="25"/></td>
        </tr>

        <tr>
            <td><b>e-mail</b></td>
            <td><input type="text" name="mail" size="25"/></td>
        </tr>

        <tr>
            <%--<td colspan="2"><input type="submit" value="Register"/></td>--%>
            <td></td>
            <td align="right" colspan="2">
                <button onclick="c_r()">Register</button>
            </td>
        </tr>
    </table>
</form>
</body></html>