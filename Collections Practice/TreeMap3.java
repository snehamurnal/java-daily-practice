//3.Write a java program to delete all elements from the treeMap 

import java.util.TreeMap;
class TreeMap3
{
public static void main(String []args)
{

TreeMap<Integer,String> s =new TreeMap<>();
 
s.put(101,"sneha");
s.put(102,"amit");
s.put(103,"riya");

System.out.println("original TreeMap: " +s);
s.clear();

System.out.println("After deletion:"+s);

}
}