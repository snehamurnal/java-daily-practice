//5.Write a Java program to get the element in a tree set which is greater than or equal to the given element.

import java.util.TreeSet;
import java.util.Scanner;

class Treeset5
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
            
        System.out.println("Enter number: ");
        int search=sc.nextInt();
        for (Integer a: set1)
        {
        if (a>=search)
        {
            System.out.println(a);
        }
        }
    }
}