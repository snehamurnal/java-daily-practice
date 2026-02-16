// 16.Print array without using loop (using recursion).


import java.util.*;

class Array16
{

    public static void printArray(int arr[], int index)
{
        if(index == arr.length)
        {
            return;
        }

        // Print current element
        System.out.print(arr[index] + " ");

        // Recursive call
        printArray(arr, index + 1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        System.out.println("Enter 10 elements:");

        // Input still needs loop (question only restricts printing)
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements are:");
        printArray(arr, 0);
    }
}
