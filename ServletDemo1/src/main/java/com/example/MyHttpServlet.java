package com.example;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHttpServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");

        out.println("<html><body>");
        out.println("<h2>Hello (HttpServlet), " + name + "!</h2>");
        out.println("</body></html>");
    }
}
