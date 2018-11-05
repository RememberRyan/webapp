package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Ryan Alexander on 05/11/2018.
 */

// created a servlet
public class UserServlet extends HttpServlet {

    // doGet override used just to demonstrate writing to the server
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // request & response setup to return the userName "Karl" to the /user url server request using Java
        String userName = "Karl";
        req.setAttribute("userName", userName);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/user.jsp");
        requestDispatcher.forward(req,resp); // req and resp, two objects

    }
}
