/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.access;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.user.UserDAO;

/**
 *
 * @author aluno
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String login = request.getParameter("login");
        String senha = request.getParameter("senha");

        UserDAO usuarioDAO = new UserDAO();
        boolean sucesso = usuarioDAO.validarAcesso(login, senha);
        response.setContentType("text/html;charset=UTF-8");
        if (sucesso) {
            // Set the attributes to be passed to the home.jsp
            request.setAttribute("username", login);
            request.setAttribute("password", senha);

            // Forward the request to home.jsp
            RequestDispatcher dispatcher = request.getRequestDispatcher("/Home");
            dispatcher.forward(request, response);

        } else {
            response.sendRedirect("index.jsp");
        }
    }
}
