package basic;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        final String correntPassword = "1234";
        /*
         * Do-While loops are used when you are sure that loop should run AT-LEAST one time and the next time it depends on the condition.
         */

         // this program will keep on asking passwords until you write the correct password
         do {
            System.err.println("Enter password to continue: ");
            password = scanner.next();
         } while (!correntPassword.equals(password));

    }
}
