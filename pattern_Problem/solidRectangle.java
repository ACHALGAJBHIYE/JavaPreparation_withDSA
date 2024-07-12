/*
 *   Print following pattern(Solid Rectangle)
 * 
 *         *****
 *         *****
 *         *****
 *         ***** 
 * 
 */

 public class solidRectangle {
 
    public static void main(String[] args) 
    {
        //for loop for print rows
        for(int i=0; i<4; i++)
        {
            //for loop for print coloum
            for(int j=0; j<5; j++)//
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
 }