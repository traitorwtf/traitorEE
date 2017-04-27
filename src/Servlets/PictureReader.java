package Servlets;

import AnimePage.Anime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

/**
 * Created by traitorwtf on 27.04.2017.
 */
@WebServlet("/PictureReader")
public class PictureReader extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("image/jpeg");
        OutputStream out = response.getOutputStream();
        try {
            int index = Integer.valueOf(request.getParameter("index"));

            ArrayList<Anime> list = (ArrayList<Anime>)request.getSession(false).getAttribute("currentAnimeList");
            Anime anime = list.get(index);
            response.setContentLength(anime.getPicture().length);
            out.write(anime.getPicture());
        } finally {
            out.close();
        }
    }
}
