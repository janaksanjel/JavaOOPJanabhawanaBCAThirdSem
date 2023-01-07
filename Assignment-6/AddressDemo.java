package hw;
//Chapter 11 – Java Application
//Write a GUI based application to accept name, address and store in file by using 
//Stream classes while clicking store button.
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class AddressDemo 
{
  private JFrame frame;
  private JTextField nameField;
  private JTextField addressField;
  private JButton storeButton;

  public AddressDemo() {
    frame = new JFrame("Address Book");
    frame.setSize(800,800);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel nameLabel = new JLabel("Enter Name");
    JLabel addressLabel = new JLabel("Addres");
    nameField = new JTextField(10);
    addressField = new JTextField(10);
    storeButton = new JButton("Store");

    storeButton.addActionListener(new ActionListener() 
    {
      public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String address = addressField.getText();
        try 
        {
          store(name, address);
          JOptionPane.showMessageDialog(frame, "Address stored successfully!");
        } catch (IOException ex) 
        {
          JOptionPane.showMessageDialog(frame, "Error storing address.");
        }
      }
    });

    frame.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    c.gridx = 0;
    c.gridy = 0;
    frame.add(nameLabel, c);
    c.gridx = 1;
    frame.add(nameField, c);
    c.gridx = 0;
    c.gridy = 1;
    frame.add(addressLabel, c);
    c.gridx = 1;
    frame.add(addressField, c);
    c.gridx = 0;
    c.gridy = 2;
    c.gridwidth = 2;
    frame.add(storeButton, c);

    frame.setVisible(true);
  }

  private void store(String name, String address) throws IOException 
  {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("address.txt", true))) {
      writer.write(name);
      writer.newLine();
      writer.write(address);
      writer.newLine();
    }
  }

  public static void main(String[] args) {
	  new AddressDemo();
  }
  }
