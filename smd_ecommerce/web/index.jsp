<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>smd e-commerce</title>
    </head>
    <body>
        <h1>Identificação do Usuário</h1>
        <form action="Login" method="post">
            <input type="text" name="login" placeholder="Entre com seu login" />
            <br/>
            <input type="password" name="senha" placeholder="Entre com sua senha" />
            <br/>
            <input type="submit" value="Entrar" />
        </form>
        <a href="register.jsp">Cadastre-se</a>
    </body>
</html>
