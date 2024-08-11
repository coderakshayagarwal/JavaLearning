package basic.functions;

public class Function1 {

    static void printFactorial(int number) {

        int factorial = 1;
        for (int i = 1; i <= number; i ++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is " + factorial);
    }

    public static void main(String[] args) {
        printFactorial(4);
    }
}
