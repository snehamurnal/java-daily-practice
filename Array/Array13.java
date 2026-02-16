// 13.Count number of three-digit numbers in an array.

import java.util.*;

class Array13
{
public static void main(String[] args)
{
int count=0;
Scanner sc = new Scanner(System.in);
int arr[] = new int[10];
System.out.println("Enter 10 elements:");

for(int i = 0; i < arr.length; i++)
{ 
arr[i] = sc.nextInt();
}
System.out.println("Original array:");
for(int i = 0; i < arr.length; i++)
 {
 System.out.print(arr[i] + " ");
 }

for (int i=0;i<arr.length;i++)
{
if(arr[i]>=100 && arr[i]<=999)
{
count=count+1;
}
}
System.out.println("count of three digit numbers in array is : "+count);

}
}


