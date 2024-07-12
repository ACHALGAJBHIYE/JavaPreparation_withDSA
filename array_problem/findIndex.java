/*
 *     Problem Statement:Take an Array as an Input from an user. Search for a given number x and print Index at which it occur.
 * 
 */

import java.util.*;
 
 class findIndex {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //size of an arrAY
        System.out.println("Enter size of an array");
        int size = sc.nextInt();

        //declaration of an array
        int[] arr = new int[size];

        //Taking input as an array
        for(int i=0; i<arr.length; i++)
        {
            System.out.println("Enter values of an array");
            arr[i] = sc.nextInt();
        }

        //Taking input from user to which number has to search
        System.out.println("Enter number to be search: ");
        int search = sc.nextInt();

        //for loop to search number in an array
        for(int i=0; i<arr.length; i++)
        {
            if(search == arr[i])
            {
                System.out.println("number is found at: "+i);
            }
        }

    }
 }