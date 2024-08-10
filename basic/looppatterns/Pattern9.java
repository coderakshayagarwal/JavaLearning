package basic.looppatterns;

/*

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/

public class Pattern9 {
    public static void main(String[] args) {
        int numberToPrint = 1;
        for (int row = 0; row < 5; row ++) {
            for (int col = 0; col < row; col ++) {
                System.out.print(numberToPrint++ + " ");
            }
            System.out.println();
        }
    }
}
