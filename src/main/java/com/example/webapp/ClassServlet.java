package com.example.webapp;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "classServlet", urlPatterns ={"/class-servlet"})
public class ClassServlet extends HttpServlet {



    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {




        response.setContentType("text/html");


        PrintWriter out = response.getWriter();
        out.println("<html>\n" +
                "<head>\n" +
                "<style>\n" +
                "table {\n" +
                "  font-family: arial, sans-serif;\n" +
                "  border-collapse: collapse;\n" +
                "  width: 80%;\n" +
                "}\n" +
                "\n" +
                "td, th {\n" +
                "  border: 1px solid #dddddd;\n" +
                "  text-align: left;\n" +
                "  padding: 8px;\n" +
                "}\n" +
                "\n" +
                "tr:nth-child(even) {\n" +
                "  background-color: #ecdfdf;\n" +
                "}\n" +
                "</style>\n" +
                "</head>\n" +
                "<body>\n" +
                "\n" +
                "<h2>Classes!</h2>\n" +
                "\n" +
                "<table>\n" +
                "  <tr>\n" +
                "    <th>Class Name</th>\n" +
                "    <th>Schedule</th>\n" +
                "    <th>Price</th>\n" +
                "  </tr>\n" +
                "  <tr>\n" +
                "    <td>Sewing I</td>\n" +
                "    <td>Mon-Tues 9am-11am</td>\n" +
                "    <td>$50</td>\n" +
                "  </tr>\n" +
                "  <tr>\n" +
                "    <td>Sewing II</td>\n" +
                "    <td>Mon-Tues 12pm-2pm</td>\n" +
                "    <td>$50</td>\n" +
                "  </tr>\n" +
                "  <tr>\n" +
                "    <td>Design basics</td>\n" +
                "    <td>Thurs-Fri 9am-11am</td>\n" +
                "    <td>$50</td>\n" +
                "  </tr>\n" +
                "  <tr>\n" +
                "    <td>Sewing III</td>\n" +
                "    <td>Thurs-Fri 12pm-1pm</td>\n" +
                "    <td>$65</td>\n" +
                "  </tr>\n" +
                "</table>\n" +
                "\n" +
                " <h3>My sewing classes are designed to help you learn or enhance " +
                "your sewing skills, with personalized instruction and hands-on practice " +
                "in a supportive environment.</h3>" +
                "<h4>Included:</h4> " +
                "<p> Each class includes access" +
                " to sewing machines, basic sewing tools, and materials for your projects." +
                "<h4>Note: </h4>" +
                "<p>Please note that special fabrics and advanced products (such " +
                "as specialty threads, patterns, or trims) are not included in the" +
                " class fee and should be provided by the student.</p> " +
                "<h4>Late policy:</h4> " +
                "<p>Late arrivals beyond 15 minutes will be considered a no-show, " +
                "and rescheduling or refunds will not be provided. We encourage early" +
                " arrival to set up and be ready to start at the designated class time.</p>" +
                "<img src='class1.jpg' alt='Example Image'/> <img src='class2.jpg' alt='Example Image'/> </body>\n" +
                "</html>\n");




    }

    public void destroy() {
    }
}
