// 7.Write a program to print unique elements only.

import java.util.*;

class Array7
{
public static void main(String[]args)
{
int i;

int arr[]=new int[10];
Scanner sc =new Scanner (System.in);
HashSet<Integer> h=new HashSet<Integer>();

System.out.println("enter the array: ");
for(i = 0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
h.add(arr[i]);
}

 System.out.println("unique elements are:"+h);
}
}
