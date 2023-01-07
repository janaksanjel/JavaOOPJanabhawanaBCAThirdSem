package hw;
//Chapter 12 – Java Applets
//Write a simple program in applet that display welcome message on web page.
import java.applet.Applet;
import java.awt.*;

public class AppletDemo extends Applet 
{
  public void paint(Graphics g)
  {
    g.drawString("Welcome to my Applet!", 10, 20);
  }
}
/*<applet code="WelcomeApplet.class" width="200" height="50"></applet>*/
