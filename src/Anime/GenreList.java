package Anime;


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

    public ArrayList<String> getGenre(){
        ArrayList<String> getGenre = new ArrayList<>();

        Statement statement = null;
        ResultSet resultSet = null;
        Connection connection = null;

        try {
        connection = Database.getConnection();
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from genre");
        while (resultSet.next()){
            getGenre.add(resultSet.getString("type"));
        }




        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement!=null) statement.close();
                if (resultSet!=null) resultSet.close();
                if (connection!=null)connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return getGenre;
    }
}
