//write a java program to add allthe elements of a specified treeset to another treeset

import java.util.TreeSet;
import java.util.Scanner;

class Treeset1
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        TreeSet<Integer> set1= new TreeSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);

        TreeSet<Integer>set2=new TreeSet<>();
        set2.add(40);
        set2.add(50);

        set2.addAll(set1);

        System.out.println("Treeset: "+set2);

    }
}