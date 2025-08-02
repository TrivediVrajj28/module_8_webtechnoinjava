package com.example;

import java.io.*;
import java.nio.file.DirectoryStream.Filter;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ValidationFilter implements Filter {
    public void init(FilterConfig config) {}

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");

        String emailPattern = "^[A-Za-z0-9+_.-]+@(.+)$";

        if (name == null || name.trim().isEmpty()) {
            request.setAttribute("errorMsg", "Name cannot be empty!");
            request.getRequestDispatcher("register.jsp").forward(request, response);
        } else if (email == null || !email.matches(emailPattern)) {
            request.setAttribute("errorMsg", "Invalid email format!");
            request.getRequestDispatcher("register.jsp").forward(request, response);
        } else {
            chain.doFilter(request, response); // Go to servlet
        }
    }

    public void destroy() {}

	@Override
	public boolean accept(Object entry) throws IOException {
		// TODO Auto-generated method stub
		return false;
	}
}
