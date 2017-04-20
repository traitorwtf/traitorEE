package something;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by traitorwtf on 20.04.2017.
 */
@WebServlet ("/traitorsServlet")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter outWriter = resp.getWriter();

        outWriter.println("<!DOCTYPE html>");
        outWriter.println("<html>");
        outWriter.println("<body>");
        outWriter.println("<h1> This is Servlet page</h1>");
        outWriter.println("<h3> Current time is "+ new java.util.Date()+ "</h3>");
        outWriter.println("</body>");
        outWriter.println("</html>");

    }
}
