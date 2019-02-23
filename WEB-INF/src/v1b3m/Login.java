package v1b3m;
import javax.servlet.http.*;
import java.io.*;

public class Login extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        // Get the parameter from the request
        String username = request.getParameter("email");

        // Send the response back to the user
        try {
            response.setContentType("text/html");
            PrintWriter writer = response.getWriter();
            response.sendRedirect("/login/index.html?username="+ username);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}