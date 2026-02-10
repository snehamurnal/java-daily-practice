//3.Write a Java program to check whether a map contains key-value mappings (empty) or not.

import java.util.HashMap;
import java.util.Scanner;

class HashMap3
{
    public static void main(String []args)
    {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"Ganesh");
        hm.put(2,"vijay");
        hm.put(3,"rahul");
            
        if(hm.isEmpty())
        {
            System.out.println("Hashmap is empty");
        }
        else
        {
            System.out.println("hashmap is not empty");
        }
    }
}