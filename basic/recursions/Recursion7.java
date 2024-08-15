package basic.recursions;
/*
 * Find the 1st and last occurance of a character in string
 */
public class Recursion7 {

    public static int first = -1;
    public static int last = -1;
    public static void findFirstAndLastOccuranceOfCharacter(char charToFind, String string, int currentIndex) {

        if (currentIndex > string.length() - 1) {
            if (first == -1) {
                System.out.println("Character is not present in the string!");
                return;
            } else if (last == -1) {
                last = first;
            }
            System.out.println("Last Occurance is " + last);
            return;
        }

        if (string.charAt(currentIndex) == charToFind) {
            if (first == -1) {
                first = currentIndex;
                System.out.println("First Occurance is " + currentIndex);
            } else {
                last = currentIndex;
            }        
        }
        findFirstAndLastOccuranceOfCharacter(charToFind, string, currentIndex + 1);
    }

    public static void main(String[] args) {
        String string = "ssaadlkjljljljlajljlkjas";
        char character = 'd';
        findFirstAndLastOccuranceOfCharacter(character, string, 0);    
    }
}
