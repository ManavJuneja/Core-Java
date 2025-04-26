package JDBC;
import java.sql.*;
public class Main {
    //require url, username, password for making connection with db
    //they are private -> to make them secure, static -> can access from main method, final -> so nobody can't change them
    private static final String url = "jdbc:mysql://127.0.0.1:3306/mydb";//add db name in end
    private static final String username = "root";
    private static final String password = "1234";

    public static void main(String[] args) throws ClassNotFoundException {
        //Step 1
        //Driver Load karne ha
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Step 2
        try{//connection is formed on RValue side
            //but tp store the connection we made instance of Connection Interface connection
            Connection connection = DriverManager.getConnection(url, username, password);
            //creating statement
            Statement statement = connection.createStatement();
            //while retrieving data always run executeQuery
            //while performing insert, update, delete executeUpdate use karna ha
            String query = "SELECT * FROM students";
            //query -> via above query we will get a result in form fo table
            //to store the result we will make instance of result set interface
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                double marks = resultSet.getDouble("marks");
                System.out.println("ID : "+id +" Name : "+name+" Age : "+age+" Marks : "+marks);
            }



            //as inserting data is dynamic query, so we will use prepared statement
            String insertQuery = String.format("INSERT INTO students(name, age, marks) VALUES('%s',%o, %f)","Rahul",22,99.5);
            //Now as we execute insertQuery so what will happen we will get how many
            //rows get affected so will print that ge an int value
            //and for insert we will use executeUpdate
            int rowAffected = statement.executeUpdate(insertQuery);
            if(rowAffected > 0){
                System.out.println("Data Inserted Successfully!");
            }else {
                System.out.println("Data not updated!");
            }

            String updateQuery = String.format("UPDATE students SET marks = %f WHERE id = %d",77.5,2);
            int rowUpdated = statement.executeUpdate(updateQuery);
            if(rowAffected > 0){
                System.out.println("Data Updated Successfully!");
            }else{
                System.out.println("Data not updated");
            }

            String deleteQuery = "DELETE FROM students WHERE ID = 3";
            int rowDeleted = statement.executeUpdate(deleteQuery);
            if(rowDeleted > 0){
                System.out.println("Data Deleted Successfully!");
            }else{
                System.out.println("Data not deleted");
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }




    }
}
