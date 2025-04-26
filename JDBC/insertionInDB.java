package JDBC;

import java.sql.*;

public class insertionInDB {
    public static void main(String[] args) throws ClassNotFoundException{
        String url = "jdbc:mysql://localhost:3306/alpha";
        String username = "root";
        String password = "1234";
        String insertData = "INSERT INTO employees (id, name, job_title, salary)VALUES (11, 'Kevin Patel', 'Cloud Architect', 95000);";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established");
            Statement statement = connection.createStatement();
            int resultSet = statement.executeUpdate(insertData);
            if(resultSet > 0){
                System.out.println("Data inserted");
            }else{
                System.out.println("Data not inserted");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
