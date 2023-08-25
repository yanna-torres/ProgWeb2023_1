<%-- 
    Document   : calc
    Created on : 25 de ago. de 2023, 16:35:21
    Author     : aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="calculadora.css">
        <title>Calculadora</title>
    </head>
    <body>
        <%!
            String evaluateExpression(String expression) {
                // Split the expression into operands and operator
                String[] parts = expression.split(" ");
                if (parts.length != 3) {
                    throw new IllegalArgumentException("Invalid expression");
                }

                double operand1 = Double.parseDouble(parts[0]);
                double operand2 = Double.parseDouble(parts[2]);
                String operator = parts[1];

                double result = 0.0;

                switch (operator) {
                    case "+":
                        result = operand1 + operand2;
                        break;
                    case "-":
                        result = operand1 - operand2;
                        break;
                    case "*":
                        result = operand1 * operand2;
                        break;
                    case "/":
                        if (operand2 != 0) {
                            result = operand1 / operand2;
                        } else {
                            throw new ArithmeticException("Division by zero");
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator");
                }

                return String.valueOf(result);
            }
        %>
        <div class="calculator">
            <form id="calcForm">
                <input type="text" id="expression" readonly>
                <div class="buttons">
                    <button class="btn" type="button" onclick="appendToExpression('7')">7</button>
                    <button class="btn" type="button" onclick="appendToExpression('8')">8</button>
                    <button class="btn" type="button" onclick="appendToExpression('9')">9</button>
                    <button class="btn" type="button" onclick="appendToExpression('+')">+</button>
                    <button class="btn" type="button" onclick="appendToExpression('4')">4</button>
                    <button class="btn" type="button" onclick="appendToExpression('5')">5</button>
                    <button class="btn" type="button" onclick="appendToExpression('6')">6</button>
                    <button class="btn" type="button" onclick="appendToExpression('-')">-</button>
                    <button class="btn" type="button" onclick="appendToExpression('1')">1</button>
                    <button class="btn" type="button" onclick="appendToExpression('2')">2</button>
                    <button class="btn" type="button" onclick="appendToExpression('3')">3</button>
                    <button class="btn" type="button" onclick="appendToExpression('*')">*</button>
                    <button class="btn" type="button" onclick="appendToExpression('0')">0</button>
                    <button class="btn" type="button" onclick="appendToExpression('.')">.</button>
                    <button class="btn" type="button" onclick="clearDisplay()">C</button>
                    <button class="btn" type="button" onclick="calculateResult()">=</button>
                    <button class="btn" type="button" onclick="appendToExpression('/')">/</button>
                </div>
            </form>
        </div>
        <script>
            function appendToExpression(value) {
                const expressionField = document.getElementById("expression");
                expressionField.value += value;
            }

            function clearDisplay() {
                const expressionField = document.getElementById("expression");
                expressionField.value = '';
            }

            function calculateResult() {
                const expressionField = document.getElementById("expression");
                try {
                    const result = eval(expressionField.value);
                    expressionField.value = result;
                } catch (error) {
                    expressionField.value = 'Error';
                }
            }
        </script>
    </body>
</html>
