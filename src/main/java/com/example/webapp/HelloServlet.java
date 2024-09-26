package com.example.webapp;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", urlPatterns ={"/hello-servlet"})
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<head>\n" +
                " <link rel=\"stylesheet\" href=\"Style.css\">\n" +
                "</head>");
        out.println("<html><body>");
        out.println("<h1>Fill out the form below with any questions or inquiries to receive a free estimate!</h1>");
        out.println("<div class =" +"thatform"+"> <form >\n" +
                "  <label for=\"fname\">First name:</label><br>\n" +
                "  <input type=\"text\" id=\"fname\" name=\"fname\" value=\"\"><br>\n" +
                "  <label for=\"lname\">Last name:</label><br>\n" +
                "  <input type=\"text\" id=\"lname\" name=\"lname\" value=\"\"><br>\n" +
                "  <label for=\"Email\">Email:</label><br>\n" +
                "  <input type=\"text\" id=\"Email\" name=\"Email\" value=\"\"><br>\n" +
                "  <label for=\"Message\">Message:</label><br>\n" +
                "  <input type=\"text\" id=\"Message\" name=\"Message\" value=\"\"><br><br>\n" +
                "  <input type=\"submit\" value=\"Submit\">\n" +
                "</form></div>");
        out.println("</html></body>");


    }

    public void destroy() {
    }
    //today:Configure and add buttons, more complicated text, add slider, add interactive animation ctrl f5 if css not updating
}