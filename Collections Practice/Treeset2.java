//2.Write a Java program to create a reverse order view of the elements contained in a given tree set.

import java.util.TreeSet;
import java.util.Scanner;

class Treeset2
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

        System.out.println("Treeset: "+set1);
        System.out.println("Treeset in reverse order: "+set1.descendingSet());

    }
}