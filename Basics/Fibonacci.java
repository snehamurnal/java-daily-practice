import java.io.*;
import java.lang.*;
import java.util.*;

class Fibonacci 
{
    public static void main(String [] args)
    {
        int n;
        int i=1, a=0,b=1;
        int sum;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        n=sc.nextInt();
System.out.println(a);
        while(i<n)
        {
            System.out.println(b);
            sum=a+b;
            a=b;
            b=sum;
            i=i+1;
        }

    }
}