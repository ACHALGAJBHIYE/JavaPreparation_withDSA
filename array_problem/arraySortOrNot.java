/*

 *    Take array of numbers as input and check if it is an array sorted in ascending order.
 * 
 *    Eg.: {1, 2, 4, 7} is sorted in ascending order
 *         {3, 4, 6, 2} is not sorted in ascending order
 * 
 */

import java.util.*;
public class arraySortOrNot{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

         // Taking size as an Input
         System.out.println("Enter size: ");
         int size = sc.nextInt();

         // Declare an array
         int[] arr = new int[size];

         System.out.println("Enter array of size: "+size);
         //taking Input from User
         for(int i=0; i<arr.length; i++)
         {
            arr[i] = sc.nextInt();
         }


         boolean isAscending  = true;
         // Condition which check array sorted or not.              
         for(int i=0; i<arr.length-1; i++)
         {
            if(arr[i] > arr[i+1])
            {
                isAscending  = false;
                break;
            }
         }

         // isAscending define here....
         if(isAscending)
         {
            System.out.println("Araay is in ascendind order");
         }
         else
         {
            System.out.println("Araay is not in ascendind order");
         }


    }
}