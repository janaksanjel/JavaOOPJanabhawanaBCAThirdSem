package king;
/*Write a program to print the area of a rectangle by creating a class named ‘Area’ taking 
the values of its length and breadth as parameters of its constructor and having a method 
named ‘returnArea’ which returns the area of the rectangle. Length and breadth of 
rectangle are entered through keyboard.*/
import java.util.Scanner;

public class Area 
{
int length;
int width;
float returnArea;
Area (int l, int w)
{
	length=l;
	width=w;
}
void returnArea() 
{
	returnArea =length*width;
}
void display() 
{
	System.out.println("the area of a rectangle:"+returnArea);
}
 
	public static void main(String[] args) 
	{
	 Scanner in = new Scanner (System.in);
		System.out.println("enter l:");
		int l = in.nextInt();
		System.out.println("enter w:");
		int w = in.nextInt();
		Area obj= new Area(l,w);
		obj.returnArea();
		obj.display();
	}		

	}


