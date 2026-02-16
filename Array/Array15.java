// 15. Find sum of alternate elements.

import java.util.*;

class Array15
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int even = 0;
	int odd = 0; 

        System.out.println("Enter 10 elements:");

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        
        for(int i = 0; i < arr.length; i = i + 2)
        {
            even = even + arr[i];
        }
	for(int i = 1; i < arr.length; i = i + 2)
        {
            odd = odd + arr[i];
        }

        System.out.println("Sum of alternate elements(even place) is: " + even);
	System.out.println("Sum of alternate elements(odd place) is: " + odd);
    }
}


