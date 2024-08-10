package basic;

public class IfElse {
    public static void main(String[] args) {
        // Example 1 - simple condition
        int age = 12;
        if (age > 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You can't vote");
        }

        // Example 2 - checking multiple conditions
        float heightInFeet = 3.2f; // casted to float, as 3.2 is double
        if (age > 5 && heightInFeet > 4) {
            System.out.println("Welcome to the theme park.");
        } else {
            System.out.println("You are not welcome to the theme park.");   
        }

        // Example 3 - using elseIf
        int marks = 70;
        char grade = 'A';
        if (marks > 80) {
            grade = 'A';
        } else if (marks > 60) {
            grade = 'B';
        } else if (marks > 40) {
            grade = 'C';
        } else if (marks > 20) {
            grade = 'B';
        } else {
            grade = 'F';
        }
        System.err.println("Your final grade is " + grade);

        // Example 4 - using nested if else
        boolean isValidUser = true;
        boolean isDiscountedUser = false;

        if (isValidUser) {
            if (isDiscountedUser) {
                System.err.println("You are discounted user.");
            } else {
                System.err.println("You are valid user but not discounted user.");
            }
        } else {
            System.err.println("You are not valid user.");
        }


    }
}
