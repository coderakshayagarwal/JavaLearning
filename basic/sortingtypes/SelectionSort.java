package basic.sortingtypes;

/**
Find the smallest and move it to first
Time Complexity: O(n^2)
*/

public class SelectionSort {

    public static void printArray(int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr [] = {5, 1, 4, 3, 2};
        // for number of iteration i.e. number of elements - 1
        for (int i = 0; i < arr.length; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
        printArray(arr);
    }
}
