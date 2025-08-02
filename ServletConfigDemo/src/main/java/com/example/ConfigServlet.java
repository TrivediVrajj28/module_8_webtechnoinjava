package com.example;

import java.io.*;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Step 1: Get config object
        ServletConfig config = getServletConfig();

        // Step 2: Fetch init parameters
        String devName = config.getInitParameter("developer");
        String projectName = config.getInitParameter("project");

        // Step 3: Output
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Initialization Parameters:</h2>");
        out.println("<p><b>Developer Name:</b> " + devName + "</p>");
        out.println("<p><b>Project Name:</b> " + projectName + "</p>");
        out.println("</body></html>");
    }
}
