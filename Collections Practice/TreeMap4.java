//4.Write a java program to get key value mapping associated with the greatest key and the least key in a map

import java.util.TreeMap;
class TreeMap4
{
public static void main(String []args)
{

TreeMap<Integer,String> s =new TreeMap<>();
 
s.put(101,"sneha");
s.put(102,"amit");
s.put(103,"riya");
s.put(104,"tara");
s.put(105,"saniya");

System.out.println("the least key is:"+s.firstEntry());

System.out.println("the greatest key is:"+s.lastEntry());
}
}
