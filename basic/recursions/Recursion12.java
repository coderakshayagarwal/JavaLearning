package basic.recursions;

import java.util.HashSet;
/*
 * Print all the unique subsequences of a string
 * eg. aaa as String, then the result should be aaa, aa, a
 */
public class Recursion12 {

    public static void printAllUniqueSubSequences(String string, int index, String newString, HashSet<String> set) {

        if (string.length() == index) {

            if (!set.contains(newString)) {
                System.out.println(newString);
                set.add(newString);
            }
            return;
        }
        // to add in newString
        printAllUniqueSubSequences(string, index + 1, newString + string.charAt(index), set);

        // to add in newString
        printAllUniqueSubSequences(string, index + 1, newString, set);
    }

    public static void main(String[] args) {
        String string = "aaa";
        printAllUniqueSubSequences(string, 0, "", new HashSet<String>());
    }
    
}
