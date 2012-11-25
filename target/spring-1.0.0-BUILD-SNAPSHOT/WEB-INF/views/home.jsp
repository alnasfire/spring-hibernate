<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1 align="center">Personnel testing system</h1>
        <form action="" method="GET">
            <table>
                <tr>
                    <td><b>Login</b> </td>
                    <td><input type="text" name="login" size="18"/></td>
                </tr>

                <tr>
                    <td><b>Password</b></td>
                    <td><input type="password" name="password" size="18"/></td>
                </tr>

                <tr>
                    <td/>
                    <td><input type="submit" value="sign in" />
                    <a href="registerUser">Register</a></td>
                </tr>
            </table>
        </form>
    </body>
</html>
