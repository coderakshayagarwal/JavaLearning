package basic.recursions;

/*
 * Remove all duplicates from a string
 */
public class Recursion10 {
    
    public static String removeDuplicates(String string, int currentIndex, String newString) {
        if (currentIndex == string.length() - 1) {
            return newString;
        }
        if (!newString.contains(string.charAt(currentIndex) + "")) {
            newString += string.charAt(currentIndex);
        }
        return removeDuplicates(string, currentIndex + 1, newString);
    }

    public static void main(String[] args) {
        String string = "abdabc";
        String newString = removeDuplicates(string, 0, "");
        System.out.println(newString);
    }
}
