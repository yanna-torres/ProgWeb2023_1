/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.client;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.user.UserDAO;

/**
 *
 * @author aluno
 */
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nome = request.getParameter("nome");
        String endereco = request.getParameter("endereco");
        String email = request.getParameter("email");
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");

        UserDAO usuarioDAO = new UserDAO();
        boolean sucesso = usuarioDAO.inserirCliente(nome, endereco, email, login, senha);

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            if (sucesso) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>smd e-commerce</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>" + ((sucesso) ? "Cliente cadastrado com sucesso!" : "Não foi possível cadastrar este cliente") + "</h1>");
                out.println("</body>");
                out.println("</html>");
            } else {
                response.sendRedirect("index.jsp");
            }
        }
    }
}
