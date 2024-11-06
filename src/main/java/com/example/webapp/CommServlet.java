
package com.example.webapp;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "commServlet", urlPatterns ={"/comm-servlet"})
public class CommServlet extends HttpServlet {



    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {




        response.setContentType("text/html");


        PrintWriter out = response.getWriter();
        out.println("<html><head>\n" +
                "<style>\n" +
                "a:link, a:visited {\n" +
                "  background-color: white;\n" +
                "  color: black;\n" +
                "  border: 2px solid pink;\n" +
                "  padding: 10px 20px;\n" +
                "  text-align: center;\n" +
                "  text-decoration: none;\n" +
                "  display: inline-block;\n" +
                "}\n" +
                "\n" +
                "a:hover, a:active {\n" +
                "  background-color: #ecdfdf;\n" +
                "  color: black;\n" +
                "}\n" +
                "</style>\n" +
                "</head><body>");
        out.println("<h1>Community!</h1>");
        out.println("<p>Feel free to follow me on my social media!</p>");
        out.println("<a href = https://www.etsy.com/shop/carmennegronboutique/?etsrc=sdt>Etsy</a>");
        out.println("<a href = https://www.instagram.com/carmennegrondesigns/>Instagram</a>");
        out.println("<a href = https://www.facebook.com/CarmenNegronDesigns>FaceBook</a>");
        out.println("<p></p>");

        out.println("</html></body>");





    }

    public void destroy() {
    }
}
