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

@WebServlet("/ColorServlet")
public class ColorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        String color = request.getParameter("color");

        if (color == null || color.trim().isEmpty()) {
            color = "white";
        }

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Đổi màu</title>");
        out.println("</head>");

        out.println("<body style='background-color:" + color + ";'>");

        out.println("<h2>Màu nền hiện tại: " + color + "</h2>");

        out.println("<a href='color.html'>Chọn lại màu</a>");

        out.println("</body>");
        out.println("</html>");
    }
}
