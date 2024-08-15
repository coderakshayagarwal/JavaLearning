package basic.recursions;

import java.util.HashSet;
/*
 * Print all the unique subsequences of a string
 */
public class Recursion12 {

    public static void printAllSubSequences(String string, int index, String newString, HashSet<String> set) {

        if (string.length() == index) {

            if (!set.contains(newString)) {
                System.out.println(newString);
                set.add(newString);
            }
            return;
        }
        // to add in newString
        printAllSubSequences(string, index + 1, newString + string.charAt(index), set);

        // to add in newString
        printAllSubSequences(string, index + 1, newString, set);
    }

    public static void main(String[] args) {
        String string = "aaa";
        printAllSubSequences(string, 0, "", new HashSet<String>());
    }
    
}
