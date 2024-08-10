package basic.looppatterns;


/*

54321
4321
321
21
1

*/

public class Pattern8 {
    public static void main(String[] args) {
        for (int row = 5; row >= 1; row--) {
            for (int col = row; col >= 1; col-- ) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
