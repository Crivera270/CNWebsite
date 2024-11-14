package com.example.webapp;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "revServlet", urlPatterns ={"/rev-servlet"})
public class RevServlet extends HttpServlet {



    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {




        response.setContentType("text/html");


        PrintWriter out = response.getWriter();
        out.println("<html>\n" +
                "<head>\n" +
                "\n" +
                "<style>\n" +
                "* {\n" +
                "  box-sizing: border-box;\n" +
                "}\n" +
                "\n" +
                "body {\n" +
                "  font-family: Arial;\n" +
                "  margin: 0 auto; /* Center website */\n" +
                "  max-width: 1000px; /* Max width */\n" +
                "  padding: 20px;" +
                "background-color: #fdfdfd;\n" +
                "}\n" +
                "\n" +
                ".heading {\n" +
                "  font-size: 25px;\n" +
                "  margin-right: 25px;\n" +
                "}\n" +
                "\n" +
                ".fa {\n" +
                "  font-size: 25px;\n" +
                "}\n" +
                "\n" +
                ".checked {\n" +
                "  color: orange;\n" +
                "}\n" +
                "\n" +
                "/* Three column layout */\n" +
                ".side {\n" +
                "  float: left;\n" +
                "  width: 15%;\n" +
                "  margin-top:10px;\n" +
                "}\n" +
                "\n" +
                ".middle {\n" +
                "  margin-top:10px;\n" +
                "  float: left;\n" +
                "  width: 70%;\n" +
                "}\n" +
                "\n" +
                "/* Place text to the right */\n" +
                ".right {\n" +
                "  text-align: right;\n" +
                "}\n" +
                "\n" +
                "/* Clear floats after the columns */\n" +
                ".row:after {\n" +
                "  content: \"\";\n" +
                "  display: table;\n" +
                "  clear: both;\n" +
                "}\n" +
                "\n" +
                "/* The bar container */\n" +
                ".bar-container {\n" +
                "  width: 100%;\n" +
                "  background-color: #f1f1f1;\n" +
                "  text-align: center;\n" +
                "  color: white;\n" +
                "}\n" +
                "\n" +
                "/* Individual bars */\n" +
                ".bar-5 {width: 60%; height: 18px; background-color: #ecdfdf;}\n" +
                ".bar-4 {width: 30%; height: 18px; background-color: #ecdfdf;}\n" +
                ".bar-3 {width: 10%; height: 18px; background-color: #ecdfdf;}\n" +
                ".bar-2 {width: 4%; height: 18px; background-color: #ecdfdf;}\n" +
                ".bar-1 {width: 15%; height: 18px; background-color: #ecdfdf;}\n" +
                "\n" +
                "/* Responsive layout - make the columns stack on top of each other instead of next to each other */\n" +
                "@media (max-width: 400px) {\n" +
                "  .side, .middle {\n" +
                "    width: 100%;\n" +
                "  }\n" +
                "  .right {\n" +
                "    display: none;\n" +
                "  }\n" +
                "}\n" +
                ".flip-card {\n" +
                "  background-color: transparent;\n" +
                "  width: 300px;\n" +
                "  height: 200px;\n" +
                " \n" +
                "display: inline-block;" +
                "padding: 20px;"+
                "  perspective: 1000px; /* Remove this if you don't want the 3D effect */\n" +
                "}\n" +
                "\n" +
                "/* This container is needed to position the front and back side */\n" +
                ".flip-card-inner {\n" +
                "  position: relative;\n" +
                "  width: 100%;\n" +
                "  height: 100%;\n" +
                "  text-align: center;\n" +
                "  transition: transform 0.8s;\n" +
                "  transform-style: preserve-3d;\n" +
                "}\n" +
                "\n" +
                "/* Do an horizontal flip when you move the mouse over the flip box container */\n" +
                ".flip-card:hover .flip-card-inner {\n" +
                "  transform: rotateY(180deg);\n" +
                "}\n" +
                "\n" +
                "/* Position the front and back side */\n" +
                ".flip-card-front, .flip-card-back {\n" +
                "  position: absolute;\n" +
                "  width: 100%;\n" +
                "  height: 100%;\n" +
                "  -webkit-backface-visibility: hidden; /* Safari */\n" +
                "  backface-visibility: hidden;\n" +
                "}\n" +
                "\n" +
                "/* Style the front side (fallback if image is missing) */\n" +
                ".flip-card-front {\n" +
                "  background-color: #bbb;\n" +
                "  color: black;\n" +
                "}\n" +
                "\n" +
                "/* Style the back side */\n" +
                ".flip-card-back {\n" +
                "  background-color: #ecdfdf;\n" +
                " color: white; \n" +
                "  transform: rotateY(180deg);\n" +
                "}</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<span class=\"heading\">Customer reviews</span>\n" +
                "<span class=\"fa fa-star checked\"></span>\n" +
                "<span class=\"fa fa-star checked\"></span>\n" +
                "<span class=\"fa fa-star checked\"></span>\n" +
                "<span class=\"fa fa-star checked\"></span>\n" +
                "<span class=\"fa fa-star\"></span>\n" +
                "<p>4.1 average based on 254 reviews.</p>\n" +
                "<hr style=\"border:3px solid #f1f1f1\">\n" +
                "\n" +
                "<div class=\"row\">\n" +
                "  <div class=\"side\">\n" +
                "    <div>5 star</div>\n" +
                "  </div>\n" +
                "  <div class=\"middle\">\n" +
                "    <div class=\"bar-container\">\n" +
                "      <div class=\"bar-5\"></div>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  <div class=\"side right\">\n" +
                "    <div>150</div>\n" +
                "  </div>\n" +
                "  <div class=\"side\">\n" +
                "    <div>4 star</div>\n" +
                "  </div>\n" +
                "  <div class=\"middle\">\n" +
                "    <div class=\"bar-container\">\n" +
                "      <div class=\"bar-4\"></div>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  <div class=\"side right\">\n" +
                "    <div>63</div>\n" +
                "  </div>\n" +
                "  <div class=\"side\">\n" +
                "    <div>3 star</div>\n" +
                "  </div>\n" +
                "  <div class=\"middle\">\n" +
                "    <div class=\"bar-container\">\n" +
                "      <div class=\"bar-3\"></div>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  <div class=\"side right\">\n" +
                "    <div>15</div>\n" +
                "  </div>\n" +
                "  <div class=\"side\">\n" +
                "    <div>2 star</div>\n" +
                "  </div>\n" +
                "  <div class=\"middle\">\n" +
                "    <div class=\"bar-container\">\n" +
                "      <div class=\"bar-2\"></div>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  <div class=\"side right\">\n" +
                "    <div>6</div>\n" +
                "  </div>\n" +
                "  <div class=\"side\">\n" +
                "    <div>1 star</div>\n" +
                "  </div>\n" +
                "  <div class=\"middle\">\n" +
                "    <div class=\"bar-container\">\n" +
                "      <div class=\"bar-1\"></div>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "  <div class=\"side right\">\n" +
                "    <div>20</div>\n" +
                "  </div>\n" +
                "</div>\n" +
                " <div class=\"flip-card\">\n" +
                "  <div class=\"flip-card-inner\">\n" +
                "    <div class=\"flip-card-front\">\n" +
                "      <img src=\"f2.jpg\" alt=\"Avatar\" style=\"width:300px;height:300px;\">\n" +
                "    </div>\n" +
                "    <div class=\"flip-card-back\">\n" +
                "      <h1>Max Bennett</h1>\n" +
                "      <p>5 STARS</p>\n" +
                "      <p>Perfect fit, stunning design. Highly recommend!</p>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>" +
                "\n" +
                "<div class=\"flip-card\">\n" +
                "  <div class=\"flip-card-inner\">\n" +
                "    <div class=\"flip-card-front\">\n" +
                "      <img src=\"f2.jpg\" alt=\"Avatar\" style=\"width:300px;height:300px;\">\n" +
                "    </div>\n" +
                "    <div class=\"flip-card-back\">\n" +
                "      <h1>Lila Hart</h1>\n" +
                "      <p>5 STARS</p>\n" +
                "      <p>Talented and quick. Love my custom dress!</p>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div> " +
                "<div class=\"flip-card\">\n" +
                "  <div class=\"flip-card-inner\">\n" +
                "    <div class=\"flip-card-front\">\n" +
                "      <img src=\"f2.jpg\" alt=\"Avatar\" style=\"width:300px;height:300px;\">\n" +
                "    </div>\n" +
                "    <div class=\"flip-card-back\">\n" +
                "      <h1>Ava Sinclair</h1>\n" +
                "      <p>4 STARS</p>\n" +
                "      <p>Flawless dress, great service. Worth it!</p>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div></body>\n" +
                "</html>");





    }

    public void destroy() {
    }
}
