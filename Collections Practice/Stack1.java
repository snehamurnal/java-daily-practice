//1.Write the java program  sort the Stack values in ascending order.

import java.util.*;

class Stack1
{
public static void main(String []args)
{
int i;
Scanner sc = new Scanner(System.in);

Stack<Integer> s = new Stack<Integer>();

s.push(98);
s.push(3);
s.push(101);
s.push(64);

System.out.println("the stack is: "+s);

Collections.sort(s);

System.out.println("the ascending order Stack is: " +s);

Collections.sort(s, Collections.reverseOrder());

System.out.println("the descending order Stack is: " +s);
}
}
