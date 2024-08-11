package basic.functions;

/*
Find greatest common divisor
*/

import java.util.Scanner;

public class Function3 {

    public static int greatestCommonDivisor(int number1, int number2) {
        int smallNumber = number1 < number2 ? number1 : number2;
        int greatestCommonDivisor = 1;

        if (number1 % number2 == 0) {
            greatestCommonDivisor = number2;
        } else if (number2 % number1 == 0) {
            greatestCommonDivisor = number1;
        } else {
            for (int i = smallNumber/2; i > 2; i--) {
                if (number1 % i == 0 && number2 % i == 0) {
                    greatestCommonDivisor = i;
                    break;
                }
            }
        }
        return greatestCommonDivisor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter number 2: ");
        int number2 = scanner.nextInt();

        System.out.println("Greatest Common Divisor is " + greatestCommonDivisor(number1, number2));
    }
}
