// 9.Write a function to return largest element of array.

import java.util.*;

class Array9
{

public int array_func(int arr[])
{
int max=arr[0];
for(int i = 0;i<arr.length;i++)
{
if(arr[i]>max)
{
max=arr[i];
}
}
return(max);
}

public static void main(String []args)
{
int i;
Scanner sc =new Scanner (System.in);
int arr[]=new int[10];
int max=arr[0];
System.out.println("array: ");
for ( i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
Array9 a=new Array9();
int result=a.array_func(arr);

System.out.println("largest element is "+result);
}
}
