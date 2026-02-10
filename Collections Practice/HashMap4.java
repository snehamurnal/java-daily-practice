//4.Write a Java program to get the value of a specified key in a map.

import java.util.HashMap;
import java.util.Scanner;

class HashMap4
{
    public static void main(String []args)
    {
        int n;
        Scanner sc= new Scanner (System.in);
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"Ganesh");
        hm.put(2,"vijay");
        hm.put(3,"rahul");
            
        System.out.println("Enter key: ");
        n=sc.nextInt();

        if(hm.containsKey(n))
        {
            System.out.println("value: "+hm.get(n));
        }
        else{
            System.out.println("not found!");
        }
    }
}