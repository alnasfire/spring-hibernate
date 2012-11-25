<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Home</title>
</head>
<body>
<script type="text/javascript">
    function logon() {
        alert(document.getElementById("login"))
    }
</script>
<div id="up">
    <h1 align="center">Personnel testing system</h1>
</div>
<div id="main" align="center">
    <table>
        <tr>
            <td></td>
        </tr>
    </table>
</div>
<div id="left" align="left">
    <form action="/testslist" method="GET">
        <table>
            <tr>
                <td><b>Login</b></td>
                <td><input type="text" id="login" size="18"/></td>
            </tr>

            <tr>
                <td><b>Password</b></td>
                <td><input type="password" id="password" size="18"/></td>
            </tr>

            <tr>
                <td/>
                <td><button onclick="logon()">Sign in</button>
                    <a href="registerUser">Register</a></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
