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
        int nums[] = {2};
        int val = 3;

        // Solution
        int k = 0; // number of elements
        int startIndex = 0;
        int endIndex = nums.length - 1;
        while (startIndex <= endIndex) {
            if (nums[startIndex] == val) {
                if (nums[endIndex] != val) {
                    // swap
                    int temp = nums[startIndex];
                    nums[startIndex] = nums[endIndex];
                    nums[endIndex] = temp;
                    // startIndex increase
                    startIndex ++;
                    k ++;
                }
                endIndex --;
            } else {
                k++;
                startIndex ++;
            }
        }

        System.out.println("Printing the elements: :k = " + k);
        for (int j = 0; j < k; j++) {
            System.out.print(nums[j] + " ");
        }
        System.out.println();
    }
}
/**
var k =0;
var num = [0,1,2,2,3,0,4,2,5];
var val = 2;
var i = num.length -1;
 
while (k < i) {
    
    if (num[k] === val && num[i] !== val) {
        var random = num[k];
        num[k] = num[i];
        num[i] = random;
        k++;
        i--;
    }
    if (num[k] === val && num[i] === val) {
        i--;
    }
    if (num[k] !== val){
        k++;
        console.log('hey1');
    }
}
var setval = k
if (k > 0) {
    setval = k-1
}
console.log(k);
//for (var p = 0; p<= setval; p++) {
    console.log(num);
 */