//2.Write a java program to get all the keys 

import java.util.TreeMap;
import java.util.Scanner;

class TreeMap2
{
public static void main(String []args)
{

TreeMap<Integer,String> s =new TreeMap<>();
 
s.put(101,"sneha");
s.put(102,"amit");
s.put(103,"riya");

for (Integer e:s.keySet()){

System.out.println(e);
}
}
}