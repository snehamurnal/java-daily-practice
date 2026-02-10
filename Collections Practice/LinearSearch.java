import java.util.Scanner;
import java.util.Arrays;

class LinearSearch
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of elements:");
        int n = sc.nextInt();

        int arr[]=new int[n];

        System.out.println("enter elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("enter element to search: ");
        int key=sc.nextInt();

        linearsearch(arr, n, key);
    }
        
    public static void linearsearch(int arr[], int n, int key)
        {
            boolean found=false;
            for (int i=0;i<n;i++)
            {
                if(arr[i]==key)
                {
                    found=true;
                    System.out.println("found at: "+(i+1));
                    break;

                }
            }

            if(!found)
            {
                System.out.println("not found");
            }

        }

}
