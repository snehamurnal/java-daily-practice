// 6. Separate even and odd numbers in an array 

import java.util.*;

class Array6
{
    public static void main(String []args)
    {
        int i,j=0;

        int arr[] = new int[10];
	int arr1[]=new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array: ");
        for(i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array with even numbers first and then odd numbers:");

        
        for(i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0)
            {
                System.out.print(arr[i]+" ");
            }
	    else
	    {
		arr1[j]=arr[i];
		j++;
            }
	}
        


        for(i = 0; i < j; i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}
