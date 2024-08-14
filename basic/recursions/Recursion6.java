package basic.recursions;
/*
 * Reverse a string
 */
public class Recursion6 {

    public static void reverseString(String string, int index) {
        if (index == -1) {
            return;
        }
        System.out.print(string.charAt(index) + " ");
        reverseString(string, index - 1);
    }

    public static void main(String[] args) {
        String string = "TestString";
        reverseString(string, string.length() - 1);
    }
}
