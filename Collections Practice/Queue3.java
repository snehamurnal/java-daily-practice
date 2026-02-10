 // 3.Write a Java program to add all the elements of a priority queue to another priority queue.

import java.util.*;

class Queue3
{
public static void main(String[]args)
{
PriorityQueue<Integer> p1=new PriorityQueue<Integer>();

p1.add(59);
p1.add(45);
p1.add(26);
p1.add(15);
p1.add(50);

System.out.println("in queue 1: "+p1);

PriorityQueue<Integer> p2=new PriorityQueue<Integer>();

p2.addAll(p1);

System.out.println("in queue 2: "+p2);
}
}