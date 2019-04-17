package com.codegym;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/display")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String product = req.getParameter("description");
        long price = Long.parseLong(req.getParameter("price"));
        long discountPercent = Long.parseLong(req.getParameter("discountPercent"));
        long discountAmount = price * discountPercent /100;
        long discountPrice = price - discountAmount;
        PrintWriter writer = resp.getWriter();
        writer.println("<h1> Product Discount Calculator </h1> <br>");
        writer.println("product description: " + product +"<br>");
        writer.println("Price: " + price + "<br>");
        writer.println("Discount Percent: " + discountPercent + "%<br>");
        writer.println("Discount Amount: " + discountAmount + "<br>");
        writer.println("Discount Price: " + discountPrice );

    }
}
