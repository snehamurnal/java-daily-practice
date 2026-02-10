//2.Write a Java program to remove all mappings from a map.

import java.util.HashMap;
import java.util.Scanner;

class HashMap2
{
    public static void main(String []args)
    {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"Ganesh");
        hm.put(2,"vijay");
        hm.put(3,"rahul");
            
        System.out.println("initial list:"+hm);

        hm.clear();

        System.out.println("after removal, list:"+hm);


        
    }
}