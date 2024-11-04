/**
27 - Remove Element

Example 1:

Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */

public class RemoveElement {
    public static void main(String[] args) {
        int nums[] = {0,1,2,2,3,0,4,2};
        int val = 2;

        // Solution
        int k = 0;
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] == val) {
                // check the next number it can be replaced with
                int replaceElementIndex = -1;
                for (int j = i+1; j < nums.length; j ++) {
                    if (nums[j] != val) {
                        replaceElementIndex = j;
                        break;
                    }
                }
                if (replaceElementIndex != -1) {
                    // swap elements
                    int temp = nums[i];
                    nums[i] = nums[replaceElementIndex];
                    nums[replaceElementIndex] = temp;
                    k++;
                }
            } else {
                k++;
            }
        }

        System.out.println("Printing the elements: :k = " + k);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
