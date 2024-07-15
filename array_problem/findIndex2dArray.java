import java.util.*;
public class findIndex2dArray {
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

        //array element as Nan input
        System.out.println("Enter element");

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        //Taking input from user to which number has to search
        System.out.println("Enter number to be search: ");
        int search = sc.nextInt();

        // Output : position at which the element will found will be return here in form of rows and coloums
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                if(search == arr[i][j])
                {
                    System.out.println("number is found at: " +(i+1)  + " " + (j+1)+ ".");
                }
            }
        }

    }
    
}
