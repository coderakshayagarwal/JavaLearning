package basic.looppatterns;

/*
*****
*   *
*   *
*   *
*****
*/

public class Pattern3 {
    public static void main(String[] args) {
        for (int row = 0; row < 5; row ++) {
            for (int col = 0; col < 5; col ++) {
                if (col == 0 || col == 4 || row == 0 || row == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
