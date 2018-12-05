package edu.tomerbu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


//instead of writing

//http://example.com/students/add
@WebServlet("/Main")
public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html"); //HTML
        //resp.setContentType("text/plain"); //plain text
        //resp.setContentType("application/json"); //JSON
        PrintWriter out = resp.getWriter();
        out.println("<h1>Hello, Servlets!</h1>");
        out.close();
    }
    //    GET
}
