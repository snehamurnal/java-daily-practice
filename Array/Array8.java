// 8.Write a program to pass array to a function and display elements.

import java.util.*;

class Array8
{

public void array_func(int arr[])
{
System.out.println("the array: ");
for(int i = 0;i<arr.length;i++)
{
System.out.println(arr[i]+" ");

}
}

public static void main(String []args)
{
int i;
Scanner sc =new Scanner (System.in);
int arr[]=new int[10];

System.out.println("array: ");
for ( i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
Array8 a=new Array8();
a.array_func(arr);
}
}
