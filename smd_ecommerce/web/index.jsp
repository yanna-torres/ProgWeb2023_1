<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SMD E-commerce - Login</title>
    </head>
    <body>
        <h1>Sign-in</h1>
        <form action="Login" method="POST">
            <input type="text" name="login" placeholder="Entre com seu login" required>
            <input type="password" name="password" placeholder="Senha" required>
            <input type="submit" value="Submit">
        </form>
        <a href="register.jsp">Cadastre-se</a>
    </body>
</html>
