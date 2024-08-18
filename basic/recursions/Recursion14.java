package basic.recursions;

/*
 * To Print All Permutations of a String
 */
public class Recursion14 {

    public static void printPermutations(String string, String newString) {

        if (string.length() == newString.length()) {
            System.out.println(newString);
            return;
        }
        
        for (int i = 0; i< string.length(); i++) {
            if (newString.indexOf(string.charAt(i)) == -1) {
                printPermutations(string, newString + string.charAt(i));
            }
        }
    }
    
    public static void main(String[] args) {
        printPermutations("abc", "");
    }
}
