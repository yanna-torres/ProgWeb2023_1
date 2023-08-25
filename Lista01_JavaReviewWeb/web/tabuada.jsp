<%-- 
    Document   : q11
    Created on : 25 de ago. de 2023, 15:29:10
    Author     : aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style.css">
        <title>Questao 11</title>
    </head>
    <body>
        <h1>Tabuada da Multiplicação</h1>
        <form action="" method="post">
            <input type="number" id="quant" name="quant" min="0" max="10" value="0" required>
            <button id="calculateButton">Calculate</button>
        </form>
        <table>
            <thead>
                <tr>
                    <th>Sua entrada</th>
                    <th>Multiplicando por</th>
                    <th>Resultado</th>
                </tr>
            </thead>
            <tbody>
            <%
                int number = 0;
                String quantParam = request.getParameter("quant");
                if (quantParam != null && !quantParam.isEmpty()) {
                    try {
                        number = Integer.parseInt(quantParam);
                    } catch (NumberFormatException e) {
                        // Trate o erro de conversão aqui, se necessário.
                    }
                }
                for (int i = 0; i <= 10; i++) {
            %>
            <tr>
                <td><%= number%></td>
                <td><%= i%></td>
                <td><%= i * number%></td>
            </tr>
            <% }%>
            </tbody>
        </table>
    </body>
</html>
