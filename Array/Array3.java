/* 3.Write a Java program to find the length of the longest consecutive elements sequence from an unsorted array of integers.
Sample array: [49, 1, 3, 200, 2, 4, 70, 5]
The longest consecutive elements sequence is [1, 2, 3, 4, 5], therefore the program will return its length 5. 
*/

import java.util.*;

class Array3
{
public static void main(String[]args)
{

int i;

int arr[]=new int[10];
Scanner sc =new Scanner (System.in);
System.out.println("enter the array: ");
for(i = 0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}

Arrays.sort(arr); 
int max = 1;
int count= 1;

for ( i = 0; i < arr.length - 1; i++) {

            if (arr[i] + 1 == arr[i + 1]) {
                count++;
            } 
            else if (arr[i] != arr[i + 1]) {
                count = 1;
            }

            if (count > max) {
                max = count;
            }
        }

        System.out.println("Longest consecutive sequence length: " + max);
    }
}
