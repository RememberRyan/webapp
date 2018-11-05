package servlets;

import model.UsersStore;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Ryan Alexander on 05/11/2018.
 */
public class UserListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UsersStore usersStore = UsersStore.getInstance();

        // retrieve all the usernames
        List<String> allUserNames= usersStore.getAllUserNames();

        req.setAttribute("names", allUserNames);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/views/user.jsp");
        requestDispatcher.forward(req,resp);
    }
}
