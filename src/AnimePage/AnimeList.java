package AnimePage;

import DBConnection.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by traitorwtf on 27.04.2017.
 */
public class AnimeList {

    public ArrayList<Anime> getAnime(String request){
        ArrayList<Anime> animeList = new ArrayList<>();

        Statement statement = null;
        ResultSet resultSet = null;
        Connection connection = null;

        try {
            connection = Database.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(request);
            while (resultSet.next()){
                Anime anime = new Anime();
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int data = resultSet.getInt("data");
                String genre = resultSet.getString("genre");
                String studio = resultSet.getString("studio");
                int position = resultSet.getInt("position");
                double rating = resultSet.getDouble("rating");
                int series = resultSet.getInt("series");

                anime.setId(id);
                anime.setName(name);
                anime.setData(data);
                anime.setGenre(genre);
                anime.setStudio(studio);
                anime.setPosition(position);
                anime.setRating(rating);
                anime.setSeries(series);

                animeList.add(anime);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement!=null) statement.close();
                if (resultSet!=null) resultSet.close();
//                if (connection!=null)connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        for (Anime anime : animeList){
            System.out.println(anime.toString());
        }
        return animeList;
    }

    public ArrayList<Anime> getAllAnime(){

        return getAnime("SELECT anime.id, anime.name, anime.data, g.type as genre, s.name as studio, anime.position, anime.rating, anime.series from anime\n" +
                "inner join genre g on anime.genre = g.idgenre\n" +
                "inner join studio s on anime.studio = s.idstudio\n" +
                "order by anime.id");
    }

    public ArrayList<Anime> getAnimeByGenre(String genre_id){

        return getAnime("SELECT anime.id, anime.name, anime.data, g.type as genre, s.name as studio, anime.position, anime.rating, anime.series from anime\n" +
                "inner join genre g on anime.genre = g.idgenre\n" +
                "inner join studio s on anime.studio = s.idstudio\n" +
                "where g.idgenre = " + genre_id + " order by anime.id");
    }
}
