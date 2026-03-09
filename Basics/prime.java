import java.io.*;
import java.lang.*;
import java.util.*;

class prime
{
    public static void main(String[]args)
    {
        int n=50;

       while(n<=60)
        {
            int i=2,flag=0;
            while(i<n)
            {
                    if(n%i==0)
                    {
                    flag=1;
                    break;
                    }
                i=i+1;
            }
        if(flag==0)
        {
            System.out.println(n);
        }
        n=n+1;
        }   
    }
}