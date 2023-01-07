package hw;
/*Write a GUI application that connect to a database with database name ‘stu’ user ‘admin’ 
and password ‘admin’ and insert records into table ‘student’ with field Roll, Name, 
Address while clicking on an insert button*/
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class InsertRecordDemo extends JFrame implements ActionListener {
    private JTextField rollField;
    private JTextField nameField;
    private JTextField addressField;
    private JButton insertButton;

    public InsertRecordDemo() {
        setTitle("Insert Record");
        setSize(800, 800);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(new JLabel("Roll:"));
        rollField = new JTextField(10);
        add(rollField);

        add(new JLabel("Name:"));
        nameField = new JTextField(10);
        add(nameField);

        add(new JLabel("Address:"));
        addressField = new JTextField(10);
        add(addressField);

        insertButton = new JButton("Insert");
        insertButton.addActionListener(this);
        add(insertButton);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == insertButton) {
            insertRecord();
        }
    }

    private void insertRecord() {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/stu", "admin", "admin");

            // Create a statement
            Statement stmt = con.createStatement();

            // Get the values from the text fields
            int roll = Integer.parseInt(rollField.getText());
            String name = nameField.getText();
            String address = addressField.getText();

            // Insert the record
            stmt.executeUpdate(
                "INSERT INTO student (Roll, Name, Address) VALUES (" + roll + ", '" + name + "', '" + address + "')");

            // Close the connection
            con.close();
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        InsertRecordDemo frame = new InsertRecordDemo();
        frame.setVisible(true);
    }
}

