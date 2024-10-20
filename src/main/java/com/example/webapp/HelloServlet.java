package com.example.webapp;

import java.io.*;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;



@WebServlet(name = "helloServlet", urlPatterns ={"/hello-servlet"})
public class HelloServlet extends HttpServlet {
    static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
    static EntityManager entityManager = entityManagerFactory.createEntityManager();
    static EntityTransaction transaction = entityManager.getTransaction();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
      Lead first = new Lead();


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


        String fname1 = request.getParameter("fname");
        String lname1 = request.getParameter("lname");
        String Email1 = request.getParameter("Email");
        String Message1 = request.getParameter("Message");


        try {
            transaction.begin();

            first.setFirstName(fname1);
            first.setLastName(lname1);
            first.setEmail(Email1);
            first.setMessage(Message1);


            entityManager.persist(first);

            transaction.commit();


        } finally {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            //entityManager.close();
            //entityManagerFactory.close();
        }

    }

    public void destroy() {
    }
    //today:Configure and add buttons, more complicated text, add slider, add interactive animation ctrl f5 if css not updating
}