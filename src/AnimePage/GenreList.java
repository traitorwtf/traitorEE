package AnimePage;


import DBConnection.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by traitorwtf on 26.04.2017.
 */
public class GenreList {
    private ArrayList<Genre> genreList = new ArrayList<>();

    public ArrayList<Genre> getGenreList() {
        System.out.println(genreList.isEmpty());
        if (genreList.isEmpty()) {
            return getGenre();
        } else {
            return genreList;
        }
    }

    private ArrayList<Genre> getGenre(){

        Statement statement = null;
        ResultSet resultSet = null;
        Connection connection = null;

        try {
        connection = Database.getConnection();
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from genre");

        while (resultSet.next()){
            Genre genre = new Genre();
            genre.setId(resultSet.getInt("idgenre"));
            genre.setType(resultSet.getString("type"));
            genreList.add(genre);
        }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet!=null) resultSet.close();
                if (statement!=null) statement.close();
//                if (connection!=null)connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return genreList;
    }
}
