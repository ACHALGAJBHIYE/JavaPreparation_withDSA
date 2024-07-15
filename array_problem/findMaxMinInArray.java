import java.util.*;
public class findMaxMinInArray {
    public static void main(String[] args)
    {
        Scanner  sc = new Scanner(System.in);

         // Taking size as an Input
         System.out.println("Enter size: ");
         int size = sc.nextInt();

         // Declare an array
         int[] arr = new int[size];

         //taking Input from User
         for(int i=0; i<arr.length; i++)
         {
            arr[i] = sc.nextInt();
         }

                
         int min = Integer.MAX_VALUE; // Initializing to maximum possible value
         int max = Integer.MIN_VALUE;// Initializing to minimum possible value
        
         // here we found minimum and maximum array
         for(int i=0; i<arr.length; i++)
         {
            // find minimum value 
            if(arr[i] < min)
            {
                min = arr[i];
            }
            // find maximum value
            if(arr[i] > max)
            {
                max = arr[i];
            }          
         }
         System.out.println("maximum value of an array: " +max);
         System.out.println("minimum value of an array: " +min);

    }

    
}
