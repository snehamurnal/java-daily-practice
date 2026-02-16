// 18.Write a program to find smallest element in a matrix.


import java.util.*;

class Array18
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

        int least = arr[0][0];  
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                if(arr[i][j] <least)
                {
                    least = arr[i][j];
                }
            }
        }

        System.out.println("Smallest element in matrix is: " + least);
    }
}
