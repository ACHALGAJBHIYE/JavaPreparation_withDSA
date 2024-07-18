/*

 *    Printing array in the form of matrix
 * 
 */

import java.util.Scanner;

public class printArrayMatrix {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Taking rows as an input
        System.out.println("Enter rows");
        int rows = sc.nextInt();
        // Taking columns as an input
        System.out.println("Enter columns");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        //array element as an input
        System.out.println("Enter element");

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }


        // Output : like matrix
        System.out.println("Output");
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                System.out.print(arr[i][j]+" "); 
            }
            System.out.println();
        }

    }
}
