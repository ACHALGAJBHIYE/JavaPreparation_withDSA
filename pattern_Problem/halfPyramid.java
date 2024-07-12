/*
 *   Print following pattern(Half Pyramid)
 * 
 *   *
 *   **
 *   ***
 *   ****
 *   *****
 * 
 */
public class halfPyramid {
    public static void main(String[] args)
    {
        // Outer loop
        for(int i=1; i<=5; i++)
        {
            // Inner loop
            for(int j=1; j<=i; j++)
            {              
               System.out.print("*");           
            }
            System.out.println();
        }
    }
}
