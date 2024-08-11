package basic;

public class Strings {
    public static void main(String[] args) {
        
        String firstName = "Manju";
        String lastName = "Aunty";
        
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println(fullName.length()); // returns the length of string
        System.out.println(fullName.charAt(0)); // returns character at specific index
        System.out.println(fullName.indexOf('n')); // returns index of given character
        System.out.println(fullName.indexOf('l')); // return -1 if not found

        // compareTo is used to compare string, as == operator don't compare the content but the address of the string
        if (firstName.compareTo("Manju") > 0) {
            System.out.println("Strings are equal");
        }

        // substr
        String line = "This is sparta";
        System.out.println(line.substring(line.lastIndexOf('s')));
    }
    
}
