package something;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by traitorwtf on 20.04.2017.
 */
public class HelloClass {
    public static String sayHello(String name){
        return "Hello, "+name;
    }

    public static String check() {
        String res = "1";
        try {
            InitialContext initialContext = new InitialContext();
            DataSource dataSource =    (DataSource)initialContext.lookup("java:comp/env/jdbc/animedb");
            Connection connection = dataSource.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM anime");
            System.out.println(resultSet.next());
            System.out.println(resultSet.getString(2));
            res = resultSet.getString(2);
        } catch (NamingException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
}
