  // 1.Write a Java program to insert a given element into a priority queue.

import java.util.*;

class Queue1
{
public static void main(String []args)
{

PriorityQueue<String> p=new PriorityQueue<String>();

p.add("sneha");
p.add("riya");
p.add("saniya");

System.out.println("the queue before insertion is: "+p);

p.add("tanvi");

System.out.println("the queue after insertion is: "+p);

}
}
