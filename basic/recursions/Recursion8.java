package basic.recursions;

/*
 * Check if an array is sorted and strictly increasing
 * Strictly sorted means every element can ONLY be greater than the previous one
 * Like in this example, the array is not strictly sorted as it have two 4s in it.
 */
public class Recursion8 {
    public static boolean isSorted = true;

    public static boolean isSortedArray(int [] array, int index) {
        if (index == array.length) {
            return isSorted;
        }
        if (array[index] > array[index - 1]) {
            return isSortedArray(array, index + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int arr [] = {1, 2, 3, 4, 4};
        if (isSortedArray(arr, 1)) {
            System.out.println("Array is strictly sorted!");
        } else {
            System.out.println("Array is not strictly sorted!");
        }
    }
}
