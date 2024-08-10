package basic;

// importing Scanner to take input
import java.util.Scanner;

public class InputHandling {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your name:");
        
        // Taking Input of Type String and storing it in name variable
        String name = scanner.next();

        // Printing the name
        System.out.println("Your name is " + name);

        System.out.println("Enter Your age:");
        // Taking integer Input
        int age = scanner.nextInt();

        // Printing the age
        System.out.println("Your age is " + age);

        System.out.println("Enter Your Coding Experience:");
        // Taking float Input
        float experience = scanner.nextFloat();

        // Printing the age
        System.out.println("Your Coding Experience is of " + experience + " years");
    }
}