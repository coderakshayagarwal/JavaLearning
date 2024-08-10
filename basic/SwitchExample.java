package basic;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.err.println("How do you want to get greeted?\n1. Namate\n2. Hello\n3.Bonjour");
        int option = scanner.nextInt();
        
        switch (option) {
            case 1: System.err.println("Namaste");
                break;
            case 2: System.err.println("Hello");
                break;
            case 3: System.err.println("Bonjour");
                break;
            default: System.err.println("Invalid Option Selected");
        }
    }
}
