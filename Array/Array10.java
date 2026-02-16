// 10.Write a function to count even numbers in array.

import java.util.*;

class Array10
{
int count=0;
public int array_func(int arr[])
{
for(int i = 0;i<arr.length;i++)
{
if(arr[i]%2==0)
{
count=count+1;
}
}
return(count);
}

public static void main(String []args)
{
int i;
Scanner sc =new Scanner (System.in);
int arr[]=new int[10];
System.out.println("enter the array: ");
for ( i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
Array10 a=new Array10();
int result=a.array_func(arr);

System.out.println("count of even number is "+result);
}
}
