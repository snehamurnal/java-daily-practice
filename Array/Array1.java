// 1.Write a Java program to find common elements between two integer arrays.

import java.util.*;

class Array1
{
public static void main(String []args)
{
int arr1[]={1,2,3,4};
int arr2[]={1,5,3,9};

System.out.println("common elements are: ");

for(int i=0;i<arr1.length;i++)
{
for(int j=0;j<arr2.length;j++)
{
if(arr1[i]==arr2[j])
{
System.out.println(arr1[i]);
}
}
}

}
}