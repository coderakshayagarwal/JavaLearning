package basic.looppatterns;

/*

*****
 ****
  ***
   **
    *
*/
public class Pattern5 {
    public static void main(String[] args) {
        for (int row = 0; row < 5; row ++) {
            // For Starting spaces
            for (int col = 0; col < row; col ++) {
                System.out.print(" ");
            }
            // For stars
            for (int col = 5; col > row; col --) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
