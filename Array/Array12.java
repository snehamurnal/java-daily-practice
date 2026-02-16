// 12. Write a program to swap first and last elements using function.

import java.util.*;

class Array12
{
  
    public static void array_func(int arr[])
    {
        int temp;

        temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
    }

    public static void main(String[] args)
    {
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

        // Call function
        array_func(arr);

        System.out.println("\nArray after swapping first and last element:");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

