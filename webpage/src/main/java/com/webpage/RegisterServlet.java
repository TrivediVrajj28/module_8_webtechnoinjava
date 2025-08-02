package com.webpage;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Store data in request to pass to JSP
        request.setAttribute("name", name);
        request.setAttribute("email", email);
        request.setAttribute("password", password);

        // Forward to JSP
        RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
        rd.forward(request, response);
    }
}
