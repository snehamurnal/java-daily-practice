//19.Write a program to check whether matrix is square.(Rows = Columns)
//   (A square matrix is a matrix in which the number of rows is equal to the number of columns.)


import java.util.*;

class Array19
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

                if(rows==cols)
                {
                    System.out.println("it is a square matrix");
                }
		else
		{
		    System.out.println("it is not a square matrix");
            	}
            
        

    }
}
