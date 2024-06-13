package database;

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataAccessLayer {

    private static final String URL = "jdbc:mysql://localhost:3306/first_connection";
    private static final String USER = "root";
    private static final String PASSWORD = "cgbe52250";

    public static Connection baglantiKur(Connection connection) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Veritabanı bağlantısı başarılı!");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC sürücüsü bulunamadı.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Veritabanına bağlantı kurulamadı.");
            e.printStackTrace();
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("Error Code: " + e.getErrorCode());
            System.out.println("Message: " + e.getMessage());
        } 
        return connection;
    }
}
