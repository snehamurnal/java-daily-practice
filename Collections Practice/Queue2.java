// 2.Write a Java program to count the number of elements in a priority queue.

import java.util.*;

class Queue2
{
public static void main(String[]args)
{

PriorityQueue<Integer> p= new PriorityQueue<Integer>();

p.add(78);
p.add(34);
p.add(90);
p.add(67);

System.out.println("the number of elements in a list is: "+ p.size());
}
}
 