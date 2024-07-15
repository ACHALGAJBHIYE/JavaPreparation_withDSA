/*

 *   Take an array of names inmput from user and print them on screen
 * 
 */

import java.util.*;
public class print1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //size of an arrAY
        System.out.println("Enter size of an array");
        int size = sc.nextInt();

        //declaration of an array
        String[] arr = new String[size];

        //Taking input as an array
        System.out.println("Enter names:");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextLine();
        }

        //Printing ouput as an array
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }


    }
}
