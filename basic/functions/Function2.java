package basic.functions;

/**
Sum of all odd nubers from 1 to n
*/
import java.util.Scanner;

public class Function2 {

    public static int sumOfOddNumbers(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        
        System.out.println("Sum of odd numbers: " + sumOfOddNumbers(number));
    }
}
