//1.Write a Java program to count the number of key-value (size) mappings in a map.

import java.util.HashMap;
import java.util.Scanner;

class HashMap1
{
    public static void main(String[]args)
    {
        int count=0;
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"Ganesh");
        hm.put(2,"vijay");
        hm.put(3,"rahul");

        System.out.println(hm.size());

        
    }
}