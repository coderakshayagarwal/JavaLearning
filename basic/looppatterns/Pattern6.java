package basic.looppatterns;

/*

1
12
123
1234
12345

*/

public class Pattern6 {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row ++) {
            for (int col = 1; col <= row; col ++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
