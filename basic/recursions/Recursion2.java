package basic.recursions;

// Print sum of n numbers
public class Recursion2 {

    public static int getSum(int minNum, int maxNum, int sum) {
        if (minNum > maxNum) {
            return sum;
        }
        sum += minNum;
        return getSum(++minNum, maxNum, sum);
    }
    public static void main(String[] args) {
        System.err.println(getSum(1, 5, 0));
    }
}
