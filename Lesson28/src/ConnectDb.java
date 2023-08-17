import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class  ConnectDb {
    public static Connection connect() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/div_academy";
        String username = "postgres";
        String password = "xedice2003";
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }

}
