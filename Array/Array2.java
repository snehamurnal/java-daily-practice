// 2.Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements.

import java.util.*;

class Array2
{
public static void main(String []args)
{
int i,j,temp;
int arr[]={1,1,0,0,2,0,3};

for(i=0;i<arr.length;i++)
{
for(j=0;j<arr.length-1;j++)
{
if(arr[j]==0)
{
temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}

System.out.println("the array is:");
for (i=0;i<arr.length;i++)
{
System.out.println(arr[i]);


}
}
}
