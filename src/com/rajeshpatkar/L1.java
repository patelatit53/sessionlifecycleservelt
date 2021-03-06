package com.rajeshpatkar;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "L1", urlPatterns = {"/L1"})
public class L1 extends HttpServlet {
    @Override
    public void service(HttpServletRequest request, 
                        HttpServletResponse response)
                        throws ServletException, 
                        IOException 
    {
        response.setContentType(
                "text/html;charset=UTF-8"
        );
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet L1</title>"); 
            out.println("</head>");
            out.println("<body>");
            out.println("<p> Entering L1 </p>");
            HttpSession ses = request.getSession();
            if(ses.isNew()){
                out.println(
                   "<p> New Session Created</p>"
                );
            }
            else{
                out.println("<p> Old Session</p>");
            }
            out.println(
                 "Sesssion Id is "+ses.getId()
            );
            out.println("<p> Leaving L1 </p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}