package king;
/* Write a program in Java to count number of objects created by using static data and use 
of default constructor. [Hint: create instance variable say ‘count’ as static and in no- args 
constructor just increment count by 1]
 * */
public class Counter 
{
static int count=0;
Counter()
{
	count++;
}
void Display()
{
	System.out.println(count);
}
	

	public static void main(String[] args) 
	{
		Counter c1=new Counter();
		Counter c2 =new Counter();
		Counter c3 =new Counter();
		c3.Display();
				

	}

}
