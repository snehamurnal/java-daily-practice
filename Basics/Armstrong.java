import java.io.*;
import java.lang.*;
import java.util.*;

class Armstrong
{
    public static void main(String[]args)
    {
        int a,n,rem=0,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        a=sc.nextInt();
        n=a;
        while (n!=0)
        {
            rem=n%10;
            sum=sum+rem*rem*rem;
            n=n/10;
        }

        if(a==sum)
        {
            System.out.println("the number is an armstrong number");
        }
        else
        {
            System.out.println("the number is not an armstrong number");
        }
    }
}