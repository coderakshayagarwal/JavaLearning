package basic;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
         * While loops are used when there may not be any index but a particular condition when to exit the loop
         */

        String response = "yes";
        while(response.equalsIgnoreCase("yes")) {
            System.err.println("Do you want to print again?");
            response = scanner.next();
        }
    }
}
