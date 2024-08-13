package basic.recursions;

/*
To Print Factorial
*/
public class Recursion3 {

    public static void printFactorial(int num, int factorial) {

        if (num == 0) {
            System.out.println("Factorial is " + factorial);
            return;
        }
        factorial *= num;
        printFactorial(--num, factorial);
    }

    public static void main(String[] args) {
        printFactorial(3, 1);
    }
    
}
