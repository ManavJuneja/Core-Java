package JDBC;

import java.sql.*;

public class deletionInDB {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/alpha";
        String username = "root";
        String password = "1234";
        String deleteQuery = "DELETE FROM employees WHERE id = 11";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully");

            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established");

            Statement statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(deleteQuery);

            if (rowsAffected > 0) {
                System.out.println("Deletion successful");
            } else {
                System.out.println("No record found with given ID");
            }

            connection.close(); // Always close connection

        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }
    }
}
