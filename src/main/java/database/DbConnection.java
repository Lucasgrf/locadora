package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection implements Constantes{
    private static final Object lock = new Object();
    public static Connection con = null;

    public static Connection getConnection() {
        synchronized (lock) {
            try {
                if (con == null || con.isClosed()) {
                    con = DriverManager.getConnection(url, user, password);
                    System.out.println("Connected to PostgreSQL database");
                }
            } catch (SQLException e) {
                System.out.println("Database connection failed " + e.getMessage());
            }
        }
        return con;
    }

    public static void disconnect(){
        try {
            if(con != null || !con.isClosed()) {
                con.close();
                System.out.println("Disconnected from PostgreSQL database");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
