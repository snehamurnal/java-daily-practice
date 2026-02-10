//4.Write a Java program to implement a stack that checks if a given element is present or not in the stack.

import java.util.*;

class Stack4
{
public static void main(String[]args)
{
int n;
Scanner sc =new Scanner (System.in);

Stack<Integer> s = new Stack<>();

s.push(20);
s.push(33);
s.push(41);
s.push(64);

System.out.println("enter number to check : ");
n=sc.nextInt();

System.out.println("is the number present? "+s.contains(n));
}
}
