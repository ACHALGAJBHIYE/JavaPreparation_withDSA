/*
 *   Print following pattern(Inverted Half Pyramid)
 * 
 *       *
 *      **
 *     ***
 *    ****
 * 
 */
public class rotatedHalfPyramid {
    public static void main(String[] args)
    {
      //for loop for print rows
      for(int i=0; i<4; i++)
      {
          //for loop for print space
          for(int j=0; j<4-i; j++)
          {
             System.out.print(" ");
          }
           //for loop for print star
           for(int j=0; j<=i; j++)
           {
              System.out.print("*");
           }
          System.out.println();
      }
    }  

}
