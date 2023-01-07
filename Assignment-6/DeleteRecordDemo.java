package hw;

import java.sql.*;

public class DeleteRecordDemo {
    public static void main(String[] args) {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/mydb", "username", "password");

            // Create a statement
            Statement stmt = con.createStatement();

            // Delete the records
            int rowsDeleted = stmt.executeUpdate(
                "DELETE FROM student WHERE S_Address = 'Kathmandu'");
            System.out.println(rowsDeleted + " rows deleted.");

            // Execute a SELECT query
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            // Iterate through the result set and print the records
            while (rs.next()) {
                int sId = rs.getInt("S_ID");
                int roll = rs.getInt("Roll");
                String sName = rs.getString("S_Name");
                String sAddress = rs.getString("S_Address");
                System.out.println(sId + ": " + roll + " " + sName + " (" + sAddress + ")");
            }

            // Close the connection
            con.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
