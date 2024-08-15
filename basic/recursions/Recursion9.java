package basic.recursions;

/*
 * Move all 'x' to end using StringBuilder
 */

public class Recursion9 {
    
    public static String moveXToEnd(StringBuilder string, int currentIndex) {
        if (currentIndex == string.length() - 1) {
            return new String(string);
        }
        if (string.charAt(currentIndex) == 'x') {
            string.deleteCharAt(currentIndex);
            string.append('x');     
        }
        return moveXToEnd(string, currentIndex + 1);
    }

    public static void main(String[] args) {
        String originalString = "axbxcx";
        System.out.println(moveXToEnd(new StringBuilder(originalString), 0));

        // StringBuilder sBuilder = new StringBuilder(originalString);
        // sBuilder.deleteCharAt(1);
        // System.out.println(sBuilder.length());
    }
}
