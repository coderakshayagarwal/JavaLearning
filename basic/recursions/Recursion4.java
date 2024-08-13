package basic.recursions;

/*
 * To Print Fibonacci Series
 */
public class Recursion4 {

    public static void printFibonacci(int currentNum, int nextNum, int count) {

        if (count == 0) {
            return;
        }
        System.out.println(currentNum + " ");
        int temp = currentNum;
        currentNum = nextNum;
        nextNum = temp + nextNum;
        printFibonacci(currentNum, nextNum, --count);
    }

    public static void main(String[] args) {
        printFibonacci(0, 1, 10);
    }
}
