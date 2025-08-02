package com.example;

import java.io.*;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletB extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ServletContext context = getServletContext();
        String institute = context.getInitParameter("institute");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h3>Servlet B: Institute Name = " + institute + "</h3>");
    }
}
