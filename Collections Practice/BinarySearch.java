import java.util.Scanner;
import java.util.Arrays;

class BinarySearch
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

        Arrays.sort(arr);
        System.out.println("sorted array: ");
        for(int x:arr);
        System.out.println(x+" ");

        System.out.println("enter element to search: ");
        int key=sc.nextInt();

        binarysearch(arr, n, key);


    }
        
    public static void binarysearch(int arr[], int n, int key)
        {
            int low=0;
            int high = n-1 ;
            boolean found=false;
            while(low<=high)
            {
                int mid=(low+high)/2;
                if(arr[mid]==key)
                {
                    System.out.println("element found at: "+(mid+1));
                    found =true;
                    break;
                }

                elseif(arr[mid]<key)
                {
                    low=mid+1;
                }

                else
                {
                    high=mid-1;
                }
            }

            if(!found)
            {
                System.out.println("not found");
            }

        }

}
