// 17.Write a program to find largest element in a matrix.

import java.util.*;

class Array17
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int rows, cols;

        System.out.println("Enter number of rows:");
        rows = sc.nextInt();

        System.out.println("Enter number of columns:");
        cols = sc.nextInt();

        int arr[][] = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        int max = arr[0][0];

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                if(arr[i][j] > max)
                {
                    max = arr[i][j];
                }
            }
        }

        System.out.println("Largest element in matrix is: " + max);
    }
}
