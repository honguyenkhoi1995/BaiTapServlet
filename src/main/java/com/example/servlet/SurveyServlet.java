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

@WebServlet("/SurveyServlet")
public class SurveyServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        String name = request.getParameter("name");

        String[] hobbies = request.getParameterValues("hobby");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Kết quả khảo sát</title>");
        out.println("</head>");

        out.println("<body>");

        out.println("<h2>Kết quả khảo sát</h2>");

        out.println("<p>Tên: " + name + "</p>");

        if (hobbies == null || hobbies.length == 0) {

            out.println("<p>Bạn chưa chọn sở thích nào.</p>");

        } else {

            out.println("<p>Sở thích của bạn:</p>");
            out.println("<ul>");

            for (String hobby : hobbies) {
                out.println("<li>" + hobby + "</li>");
            }

            out.println("</ul>");
        }

        out.println("<a href='survey.html'>Quay lại</a>");

        out.println("</body>");
        out.println("</html>");
    }
}
