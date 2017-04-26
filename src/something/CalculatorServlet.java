package something;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by traitorwtf on 24.04.2017.
 */
public class CalculatorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Double param1, param2;
        Double result = 0.0;
        String action;
        String operation = "";

        PrintWriter writer = response.getWriter();
        HttpSession session = request.getSession(true);

        ArrayList<String> listOfOperations = new ArrayList<>();

        if (session.isNew()){
            listOfOperations = new ArrayList<String>();
        } else{
           listOfOperations =(ArrayList<String>) session.getAttribute("form");
        }

        param1 = Double.parseDouble(request.getParameter("param1"));
        param2 = Double.parseDouble(request.getParameter("param2"));
        action = request.getParameter("action");

        switch (action){
            case "plus": result = param1+param2;
                break;
            case "minus": result = param1-param2;
                break;
            case "multiply": result = param1*param2;
                break;
            case "divide": result = param1/param2;
                break;
        }
        operation = "<h3>" + param1 + " " + action + " " + param2 + " = " + result + "</h3>";
        listOfOperations.add(operation);
        session.setAttribute("form", listOfOperations);

        writer.println("<!DOCTYPE html>");
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h1>"+"Session ID: "+session.getId()+"</h1>");
        writer.println("<h2>"+"Session isNew: "+session.isNew()+"</h2>");
        writer.println("<h2>"+"Number of Operations: "+listOfOperations.size()+"</h2>");
        for (String data : listOfOperations) {
            writer.println(data);
        }
        writer.println("</body>");
        writer.println("</html>");
    }
}
