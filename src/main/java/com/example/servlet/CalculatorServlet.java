package com.example.servlet;



import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                           HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        String a = request.getParameter("a");
        String b = request.getParameter("b");
        String op = request.getParameter("op");

        double numA = Double.parseDouble(a);
        double numB = Double.parseDouble(b);

        double result;

        if (op.equals("+")) {
            result = numA + numB;
        } else {
            result = numA - numB;
        }

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Kết quả</title></head>");
        out.println("<body>");

        out.println("<h2>Kết quả</h2>");
        out.println("<p>" + numA + " " + op + " " + numB
                + " = " + result + "</p>");

        out.println("<a href='index.html'>Quay lại</a>");

        out.println("</body>");
        out.println("</html>");
    }
}