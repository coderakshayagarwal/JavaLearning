package basic.functions;

/*
Find greatest common divisor
*/

import java.util.Scanner;

public class Function4 {

    public static void printFibbonacciSeriesUpto(int number) {
        
        System.out.println("Fibbonacci Series: ");

        int currentNumber = 0;
        int nextNumber = 1;
        System.out.print( currentNumber + " ");
        do {
            System.out.print( nextNumber + " ");
            int temp = currentNumber;
            currentNumber = nextNumber;
            nextNumber = temp + nextNumber;
        } while (nextNumber < number);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        printFibbonacciSeriesUpto(number);
    }
}
