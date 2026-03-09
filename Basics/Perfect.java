import java.io.*;
import java.lang.*;
import java.util.*;

class Perfect
{
    public static void main(String[]args)
    {
        int n,i=1,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        
        while (n!=0)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        i=i+1;

        if(sum==n)
        {
            System.out.println("the number is an perfect number");
        }
        else
        {
            System.out.println("the number is not an perfect number");
        }
    }
}