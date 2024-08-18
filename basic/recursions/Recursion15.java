package basic.recursions;

/*
 * Find all the paths from (0,0) to (m,n)
 */
public class Recursion15 {

    public static int calculateTotalPath(int row, int col, int indexX, int indexY, int noOfPaths) {
        if (indexX == row || indexY == col) {
            return 0;
        }
        if (indexX == row - 1 && indexY == col - 1) {
            return 1;
        }
        int downPaths = calculateTotalPath(row, col, indexX, indexY + 1, noOfPaths);
        int rightPaths = calculateTotalPath(row, col, indexX+ 1, indexY, noOfPaths);
        return downPaths + rightPaths;
    }

    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        int noOfPath = calculateTotalPath(row, col, 0, 0, 0);
        System.out.println("No of Paths: " + noOfPath);
    }
}
