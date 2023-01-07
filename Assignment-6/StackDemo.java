package hw;
//What is Random class and what is the use of this class? Write a program to show 
//some of the important operation in stack using Stack class.

import java.util.Stack;

public class StackDemo 
{
  public static void main(String[] args) 
  {
    Stack<Integer> stack = new Stack<>();

    
    stack.push(10);
    stack.push(20);
    stack.push(30);

   
    int top = stack.peek();
    System.out.println("Top element: " + top);

    
    while (!stack.empty()) 
    {
      int i = stack.pop();
      System.out.println(i);
    }
  }
}
