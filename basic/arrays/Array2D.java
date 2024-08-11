package basic.arrays;

public class Array2D {

    public static void findElementIn2DArray(int element, int arr[][]){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (element == arr[i][j]) {
                    System.err.println("Element Found at index (" + i + "," + j + ")");
                    return;
                }
            }
        }
        System.out.println("Element not found!");
    }
    public static void main(String[] args) {
        
        int row = 3;
        int col = 3;

        // Declaration
        int [][] numbers = new int[row][col];

        // initializing
        int value = 10;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                numbers[i][j] = value;
                value += 10;
            }
        }

        // Code to print 2d-array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        findElementIn2DArray(50, numbers);
    }
}
