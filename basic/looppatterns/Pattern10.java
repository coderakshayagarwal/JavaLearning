package basic.looppatterns;

/*

1
01 
101
0101 
10101

*/

public class Pattern10 {
    public static void main(String[] args) {
        for (int row = 0; row < 5; row ++) {
            for(int col = 0; col <= row; col++) {
                if ((row + col) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();

        }
    }
}
