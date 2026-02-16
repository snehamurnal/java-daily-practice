/* 4.Print all leader elements in array

Write a Java program to print all the LEADERS in the array.  
Note: An element is leader if it is greater than all the elements to its right side.
*/

import java.util.*;

class Array4
{
public static void main(String []args)
{
int i;

int arr[]=new int[10];
Scanner sc =new Scanner (System.in);
System.out.println("enter the array: ");
for(i = 0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}



System.out.println("leader elements are: ");

for(i=0;i<arr.length-1;i++)
{
if(arr[i]<arr[i+1])
{
System.out.println(arr[i+1]);
}
}
}
}