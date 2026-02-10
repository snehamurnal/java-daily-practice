// 1. write a java program to search for a value in a TreeMap.

import java.util.TreeMap;
import java.util.Scanner;

class TreeMap1
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
TreeMap<Integer,String> s=new TreeMap<>();

s.put(101,"amit");
s.put(102,"sneha");
s.put(103,"riya");

System.out.println("enter value to search: ");
String value=sc.next();


if(s.containsValue(value))
{
System.out.println("value present in the Treemap");
}
else
{
System.out.println("value not found");
}

}
}