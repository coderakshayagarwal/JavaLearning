package basic.recursions;

/*
 * Print all the subsequences of a String
 * eg. for "abc", subsequences are abc, ab, ac, bc, a, b, c
 */

public class Recursion11 {

    public static void printAllSubSequences(String string, int index, String newString) {

        if (string.length() == index) {
            System.out.println(newString);
            return;
        }
        // to add in newString
        printAllSubSequences(string, index + 1, newString + string.charAt(index));

        // to add in newString
        printAllSubSequences(string, index + 1, newString);
    }

    public static void main(String[] args) {
        String string = "abcd";
        printAllSubSequences(string, 0, "");
    }
}