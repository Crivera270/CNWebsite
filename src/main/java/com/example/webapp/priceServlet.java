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
        out.println("<head><style>body {\n" +
                "    background-color:#ecdfdf;\n" +
                "} .content {\n" +
                "  margin-left: 200px;\n" +
                "  padding-left: 20px;\n" +
                "} .sidenav {\n" +
                "  height: 100%;\n" +
                "  width: 200px;\n" +
                "  position: fixed;\n" +
                "  z-index: 1;\n" +
                "  top: 0;\n" +
                "  left: 0;\n" +
                "  background-color: #ffffff;\n" +
                "  overflow-x: hidden;\n" +
                "}</style></head><html><body>");
        out.println("<div class=\"sidenav\">\n" +
                "<h1>Price peek:</h1> </div>\n" +
                "\n" +
                "<div class=\"content\">\n" +
                "  <h2></h2>\n" +
                "  <p>•</p>\n" +
                "<p>•\n" +
                "\n" +
                "Cocktail/Formal Gowns: Starting at $500+\n" +
                "\n" +
                "</p><p>•Wedding/Ball Gowns: Starting at $1,000+</p>" +
                " <p>•Veil prices range from $50 to $500, based on the design and complexity.</p>" +
                "<p><i>•Please note that material costs are separate " +
                "from labor fees and will be discussed during the consultation. </i></p>" +
                "<p>•<i>Please note additional materials such as lace, fabric, or buttons may incur an extra charge.</i></p>" +
                "<p>•</p>" +
                "</div>\n");
        out.println("</html></body>");





    }

    public void destroy() {
    }
}
