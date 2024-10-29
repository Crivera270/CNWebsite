package com.example.webapp;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "priceServlet", urlPatterns ={"/price-servlet"})
public class priceServlet extends HttpServlet {



    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {




        response.setContentType("text/html");


        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Price peek:</h1>");
        out.println("<p>Pricing:\n" +
                "\n" +
                "• Cocktail/Formal Gowns: Starting at $500+\n" +
                "\n" +
                "• Wedding/Ball Gowns: Starting at $1,000</p>");
        out.println("<p>*Please note that material costs are separate from labor fees and will be discussed during the consultation.</p>");
        out.println("</html></body>");





    }

    public void destroy() {
    }
}
