package hw;
//Write a program to illustrate Integer classes as a wrapper class of int.
public class IntegerDEMO {
  public static void main(String[] args) {
   
    Integer i1 = new Integer(10);
    System.out.println("i1: " + i1);

    
    Integer i2 = new Integer("20");
    System.out.println("i2: " + i2);

    
    int i3 = i1.intValue();
    System.out.println("i3: " + i3);

  
    int i4 = Integer.parseInt("30");
    System.out.println("i4: " + i4);

    
    String s1 = i1.toString();
    System.out.println("s1: " + s1);

   
    String s2 = Integer.toString(i4);
    System.out.println("s2: " + s2);
  }
}
