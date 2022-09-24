package king;
//Write a program to solve quadratic equations (use if, else if and else).
import java.util.Scanner;

public class Quadraticequation 
{

	
	public static void main(String[] args) 
	{
		
		
		Scanner in =new Scanner(System.in);
		System.out.println("Enter a A:"  );
		int a =	in.nextInt();
		System.out.println("Enter a B:"  );
		int b =	in.nextInt();
		System.out.println("Enter a C:"  );
		int c =	in.nextInt();
		
		double discriminant =  (b * b - 4 * a * c);
		
		if(discriminant<=0) 
		{
			System.out.println("Roots are imaginary and equal");
		}
		
		
		else
		{
			System.out.println("Roots are not imaginary and not equal");
		}
	   
		
		
	}

}
