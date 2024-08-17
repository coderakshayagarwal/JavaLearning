package basic.recursions;
/*
 * Number Pad
 */

import java.util.HashMap;

public class Recursion13 {

    public static HashMap<Integer, String> numpadMapping = new HashMap<Integer, String>();

    public static void printCombinations (String numString, char currentChar, int index, String combination) {

        if (index == numString.length()) {
            System.out.println(combination);
            return;
        }

        String currentNumberValue = numpadMapping.get(Integer.parseInt(numString.charAt(index) + ""));
        for (int i = 0; i < currentNumberValue.length(); i++) {
            currentChar = currentNumberValue.charAt(i);
            printCombinations(numString, currentChar, index + 1, combination + currentChar);
        }
    }

    public static void main(String[] args) {
        numpadMapping.put(1, "abc");
        numpadMapping.put(2, "def");
        numpadMapping.put(3, "ghi");
        numpadMapping.put(4, "jlk");
        numpadMapping.put(5, "mnop");
        numpadMapping.put(6, "qrs");
        numpadMapping.put(7, "tu");
        numpadMapping.put(8, "vwx");
        numpadMapping.put(9, "yz");
        numpadMapping.put(0, ".");

        printCombinations("1", '0', 0, "");
    }
}
