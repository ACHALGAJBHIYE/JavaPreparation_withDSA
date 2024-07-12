/*
 *   Print following pattern(Inverted half Rectangle)
 * 
 *   *****
 *   ****
 *   ***
 *   **
 *   *
 * 
 */
public class invertedHalfPyramid {
    public static void main(String[] args)
    {
        // Outer loop
        for(int i=1; i<=5; i++)
        {
            // Inner loop
            for(int j=0; j<=5-i; j++)
            {              
               System.out.print("*");           
            }
            System.out.println();
        }
    }
}

