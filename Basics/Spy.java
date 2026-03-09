import java.io.*;
import java.lang.*;
import java.util.*;

class Spy
{
    public static void main(String[]args)
    {
        int a=1,n,rem=0,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        
        while (n!=0)
        {
            rem=n%10;
            sum=sum+rem;
            a=a*rem;
            n=n/10;
        }

        if(sum==rem)
        {
            System.out.println("the number is a spy number");
        }
        else
        {
            System.out.println("the number is not a spy number");
        }
    }
}