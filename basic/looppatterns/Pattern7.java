package basic.looppatterns;

/*
12345
1234
123
12
1
*/

public class Pattern7 {
    public static void main(String[] args) {
        for (int row = 5; row > 0; row --) {
            for (int col = 1; col <= row; col ++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
