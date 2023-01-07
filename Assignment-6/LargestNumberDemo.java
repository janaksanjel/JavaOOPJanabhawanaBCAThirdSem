package hw;
/*Develop an applet that receives three numeric values as input from the user and then 
display the largest of three on the screen Write a HTML page and test the applet.*/
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class LargestNumberDemo extends Applet implements ActionListener
{
  private TextField num1Field, num2Field, num3Field;
  private Button findLargestButton;

  public void init() 
  {
    num1Field = new TextField(10);
    num2Field = new TextField(10);
    num3Field = new TextField(10);
    findLargestButton = new Button("Find Largest");

    findLargestButton.addActionListener(this);

    add(num1Field);
    add(num2Field);
    add(num3Field);
    add(findLargestButton);
  }

  public void actionPerformed(ActionEvent e) 
  {
    int num1 = Integer.parseInt(num1Field.getText());
    int num2 = Integer.parseInt(num2Field.getText());
    int num3 = Integer.parseInt(num3Field.getText());

    int largest = num1;
    if (num2 > largest) 
    {
      largest = num2;
    }
    if (num3 > largest) 
    {
      largest = num3;
    }

    Graphics g = getGraphics();
    g.drawString("The largest number is: " + largest, 10, 50);
  }
}
/*<applet code="LargestNumberApplet.class" width="300" height="100"></applet>*/
