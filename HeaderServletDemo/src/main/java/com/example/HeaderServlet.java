package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/headers")
public class HeaderServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Handle GET request
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set content type
        response.setContentType("text/html");

        // Add custom response headers
        response.setHeader("X-Powered-By", "JavaServlet");
        response.setHeader("X-Custom-Header", "VrajBhaiRocks");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>HTTP Request Headers</h2>");
        out.println("<table border='1' cellpadding='5'>");
        out.println("<tr><th>Header Name</th><th>Header Value</th></tr>");

        // Get all request headers
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String header = headerNames.nextElement();
            String value = request.getHeader(header);
            out.println("<tr><td>" + header + "</td><td>" + value + "</td></tr>");
        }

        out.println("</table>");
        out.println("<p>Custom headers are sent in this response.</p>");
        out.println("</body></html>");
    }
}
