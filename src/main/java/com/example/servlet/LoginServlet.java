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

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Kết quả đăng nhập</title>");
        out.println("</head>");

        out.println("<body>");

        if ("admin".equals(username) && "123".equals(password)) {

            out.println("<h2>Đăng nhập thành công!</h2>");
            out.println("<p>Xin chào admin.</p>");

        } else {

            out.println("<h2>Đăng nhập thất bại!</h2>");
            out.println("<p>Username hoặc password không đúng.</p>");

        }

        out.println("<a href='login.html'>Quay lại</a>");

        out.println("</body>");
        out.println("</html>");
    }
}
