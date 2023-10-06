<%@page import="java.util.List"%>
<%@page import="model.product.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>smd e-commerce</title>
    </head>
    <body>
        <h1>Olá ${username}</h1>
        <h3>Sua senha é ${password}</h3>
        <%
            List<Product> produtosEstoque = (List<Product>) request.getAttribute("produtosEstoque");
            if (produtosEstoque != null && !produtosEstoque.isEmpty()) {
                for (Product produto : produtosEstoque) {
        %>
        <div><%= produto.getDescricao() %></div>
        <%
                }
            }
        %>
    </body>
</html>

