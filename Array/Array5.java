// 5.Arrange array with positive integers before negatives

import java.util.*;

class Array5
{
public static void main(String []args)
{
int i,j,temp;

int arr[]=new int[10];
Scanner sc =new Scanner (System.in);
System.out.println("enter the array: ");
for(i = 0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}


for(i=0;i<arr.length;i++)
{
for(j=0;j<arr.length-1;j++)
{
if(arr[j]<arr[j+1])
{
temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
System.out.println("Array with positive elements before negative elements: ");
for (i = 0; i < arr.length; i++) 
{
System.out.print(arr[i] + " ");
}

}
}
