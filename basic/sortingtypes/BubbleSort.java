package basic.sortingtypes;

/**
Push largest element to the last
Time Complexity: O(n^2)
*/

public class BubbleSort {

    public static void printArray(int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 7, 6, 2, 1};
        // outer loop - represents number of iterations
        for (int i = 0; i < arr.length; i++) {

            // inner loop - actually dealing with comparisons and doing the swap
            for (int j = 0; j < arr.length - i - 1; j++) {
                if ( arr[j] > arr[j+1] ) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        printArray(arr);
    }
}
