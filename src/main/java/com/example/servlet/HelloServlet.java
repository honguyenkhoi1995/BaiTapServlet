package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        String name = request.getParameter("name");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Xin chào</title>");
        out.println("</head>");

        out.println("<body>");

        if (name == null || name.trim().isEmpty()) {
            out.println("<h2>Xin chào bạn!</h2>");
        } else {
            out.println("<h2>Xin chào " + name + "!</h2>");
        }

        out.println("<a href='hello.html'>Quay lại</a>");

        out.println("</body>");
        out.println("</html>");
    }
}
