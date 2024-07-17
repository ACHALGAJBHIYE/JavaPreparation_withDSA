/*
 * 
 *    Take an array of Strings input from the & find the length of all those string
 * 
 */

import java.util.*;
public class  findlength
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of length you enter");
        int size = sc.nextInt();

        String[] arr = new String[size];//String declaration
        int tlength = 0;//initilizising total length to 0

        //Taking input from user
        System.out.println("Enter string");
        for(int i=0; i<size; i++)
        {
            arr[i] = sc.next();
            tlength = tlength + arr[i].length();
        }

        //Output total length of character
        System.out.println(tlength);
    }
}