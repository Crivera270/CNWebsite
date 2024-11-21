
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
                "  padding: 20px 40px;\n" +
                "  text-align: center;\n" +
                "  text-decoration: none;\n" +
                "  \n" +
                "}\n" +
                "\n" +
                "div.links{ margin: auto;" +
                "width: 50%;" +
                "display: block;}" +
                "header{    padding: 20px;\n" +
                "    text-align: left;\n" +
                "    background: #ecdfdf;\n}" +
                "a:hover, a:active {\n" +
                "  background-color: #ecdfdf;\n" +
                "  color: black;\n" +
                "}" +
                "img{display: block;\n" +
                "  margin-left: auto;\n" +
                "  margin-right: auto;\n" +
                "  width: 80%;" +
                " margin: 55px 180px;}\n" +
                "</style>\n" +
                "</head><body>");
        out.println("<header><h1>Community:</h1></header><div class =\" +\"links\"+\">");
        out.println("<h1>Follow me on my social media!</h1>");
        out.println("<a href = https://www.etsy.com/shop/carmennegronboutique/?etsrc=sdt>Etsy</a>");
        out.println("<a href = https://www.instagram.com/carmennegrondesigns/>Instagram</a>");
        out.println("<a href = https://www.facebook.com/CarmenNegronDesigns>FaceBook</a>");
        out.println("<p></p>" +
                "<img src='img.png' alt='Example Image'/></div>");

        out.println("</html></body>");





    }

    public void destroy() {
    }
}
