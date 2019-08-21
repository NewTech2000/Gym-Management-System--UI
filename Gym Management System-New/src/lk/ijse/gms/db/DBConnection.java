package lk.ijse.gms.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private Connection connection;
    private static DBConnection db;
    private static DBConnection dBConnection;
    private DBConnection()throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String ip = "localhost";
        String port = "3307";
        String db = "gym_system";
        String user = "root";
        String password = "123456";
        String jdbcUrl = "jdbc:mysql://" + ip + ":" + port + "/" + db;
        this.connection = DriverManager.getConnection(jdbcUrl, user, password);
    }

    public static DBConnection getInstance() throws ClassNotFoundException, SQLException {
        if (dBConnection == null) {
            dBConnection = new DBConnection();
        }

        return dBConnection;
    }

    public Connection getConnection() {
        return this.connection;
    }
}
