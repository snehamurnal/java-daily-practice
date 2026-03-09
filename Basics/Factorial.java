import java.io.*;
import java.lang.*;
import java.util.*;

class factorial
{
    public static void main(String []args)
    {
        int fact=1,n,i;

        Scanner sc =new Scanner(System.in);
        System.out.println("enter number: ");
        n=sc.nextInt();


        for (i=1;i<=n;i++)
          {
            fact=fact*i;
          }
        
        System.out.println("factorial is "+fact);

    }
}