package hw;
import java.sql.*;

public class DisplayRecords {
    public static void main(String[] args) {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            Connection con = DriverManager.getConnection
                ("jdbc:mysql://localhost/mydatabase", "username", "password");

            // Create a statement
            Statement stmt = con.createStatement();

            // Execute a SELECT query
            ResultSet rs = stmt.executeQuery("SELECT * FROM mytable");

            // Iterate through the result set and print the records
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println(id + ": " + name);
            }

            // Close the connection
            con.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
