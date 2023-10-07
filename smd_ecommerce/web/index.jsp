<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <% request.setAttribute("pageTitle", "smd-ecommerce"); %>
    <%@include file="./components/head.jsp" %>
    <body>
        <h1>Identificação do Usuário</h1>
        <form action="Login" method="post">
            <% request.setAttribute("inputName", "login"); %>
            <% request.setAttribute("inputPlaceholder", "Entre com seu login"); %>
            <% request.setAttribute("inputType", "text"); %>
            <%@include file="./components/text_input.jsp" %>
            <br/>
            <% request.setAttribute("inputName", "senha"); %>
            <% request.setAttribute("inputPlaceholder", "Entre com sua senha"); %>
            <% request.setAttribute("inputType", "password");%>
            <%@include file="./components/text_input.jsp" %>
            <br/>
            <input type="submit" value="Entrar" />
        </form>
        <a href="register.jsp">Cadastre-se</a>
    </body>
</html>
