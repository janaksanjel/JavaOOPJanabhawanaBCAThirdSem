package king;
/*Write a program to print the area of two rectangles having sides (4,5) and (5,8) 
respectively by creating a class named ‘Rectangle’ with a method named ‘returnArea’
which returns the area and length and breadth passed as parameters to its constructors.
 * */
public class Rectangle 
{
 int length1;
 int length2;
 int width1;
 int width2;
 float area1;
 float area2;
 Rectangle(int l1, int l2, int w1, int w2)
 {
	 length1=l1;
	 length2=l2;
	 width1=w1;
	 width2=w2;
	 
 }
 void Areacalc()
 {
	 area1=length1*width1;
	 area2=length2*width2;
 }
 void display() 
 {
	 System.out.println("area of rectangle1:" +area1);
	 System.out.println("area of rectangle2:" +area2);
 }
	
	public static void main(String[] args) 
	{
		Rectangle obj =new Rectangle(4,5,5,8);
		obj.Areacalc();
		obj.display();
				 
		
		
	}

}
