//3.Write a Java program to get the first and last elements in a tree set.

import java.util.TreeSet;
import java.util.Scanner;

class Treeset3
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        TreeSet<Integer> set1= new TreeSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set1.add(50);

        System.out.println("Treeset first element: "+set1.first());
        System.out.println("Treeset last element: "+set1.last());

    }
}