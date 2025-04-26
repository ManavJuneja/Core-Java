package JDBC;
import java.sql.*;
public class printInDB {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/alpha";
        String username = "root";
        String password = "1234";
        String printAll = "Select * From employees";
//
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("Driver Loaded Successfully");
//        }catch (ClassNotFoundException e){
//            System.out.println(e.getMessage());
//        }

        try{
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established Successfully!!");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(printAll);
            while(resultSet.next()){
                int ID = resultSet.getInt("id");
                String Name = resultSet.getString("name");
                String JobTitle = resultSet.getString("job_title");
                double Salary = resultSet.getDouble("salary");
                System.out.println("=====================================");
                System.out.println("ID: "+ID);;
                System.out.println("Name: "+Name);
                System.out.println("Job Title: "+JobTitle);
                System.out.println("Salary: "+Salary);
            }
            resultSet.close();
            statement.close();
            connection.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }





    }
}
