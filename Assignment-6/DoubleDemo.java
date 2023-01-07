package hw;
//Write a program to illustrate Double classes as a wrapper class of double.
public class DoubleDemo {
	  public static void main(String[] args) {
	   
	    Double d1 = new Double(3.14);
	    System.out.println("d1: " + d1);

	    
	    Double d2 = new Double("2.71828");
	    System.out.println("d2: " + d2);

	  
	    double d3 = d1.doubleValue();
	    System.out.println("d3: " + d3);

	 
	    double d4 = Double.parseDouble("1.618034");
	    System.out.println("d4: " + d4);

	   
	    String s1 = d1.toString();
	    System.out.println("s1: " + s1);

	  
	    String s2 = Double.toString(d4);
	    System.out.println("s2: " + s2);
	  }
	}

