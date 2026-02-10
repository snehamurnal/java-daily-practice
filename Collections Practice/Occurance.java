import java.util.*;

class Occurance
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner (System.in);
        int arr[]=new int[10];
        System.out.println("Enter the 10 elements: ");
        for(int i=0;i<10;i++)
        {
            arr[i] =sc.nextInt();
        }
        boolean [] flag = new boolean[arr.length];
        System.out.println("element\t time: ");
        for (int i=0;i<arr.length;i++)
        {
            if (flag[i])
            {
                continue;
            }
            int count =1;
            for (int j=i+1;j<i;i++)
            {
                if (arr[i]==arr[j])
                {
                    count++;
                    flag[j]=true;

                }
            }
            System.out.println(arr[i] +""+count);

        }
    }
}