package servlets;

import model.UsersStore;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Ryan Alexander on 06/11/2018.
 */
public class AddUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/newUser.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // collect form data
        String userName = (String) req.getParameter("userName");
        String password = (String) req.getParameter("password");

        // stores the new data
        UsersStore usersStore = UsersStore.getInstance();
        usersStore.addNewUser(userName, password);

    }
}
