<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SMD E-commerce - Register</title>
    </head>
    <body>
        <h1>Cadastrar um Novo Cliente</h1>
        <form action="RegisterClient" method="post">
            <input type="text" name="name" placeholder="Entre com seu nome" required>
            <br/>
            <input type="text" name="address" placeholder="Entre com seu endereço" required>
            <br/>
            <input type="text" name="email" placeholder="Entre com seu e-mail" required>
            <br/>
            <input type="text" name="login" placeholder="Entre com seu login" required>
            <br/>
            <input type="password" name="password" placeholder="Entre com sua senha" required>
            <br/>
            <input type="submit" value="Cadastrar">
        </form>
        <a href="index.jsp">Voltar</a>
    </body>
</html>
