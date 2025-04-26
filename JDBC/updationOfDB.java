package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class updationOfDB {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/alpha";
        String username = "root";
        String password = "1234";
        String updateQuery = "UPDATE employees SET salary = 100000, job_title = 'Senior Waiter' WHERE id = 2";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(updateQuery);
            if (rowsAffected > 0) {
                System.out.println("Updated");
            } else {
                System.out.println("Not Updated");
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
