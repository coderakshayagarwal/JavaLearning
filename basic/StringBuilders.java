package basic;

public class StringBuilders {

    public static StringBuilder reverseString(StringBuilder stringBuilder) {

        for (int i = 0; i < stringBuilder.length() / 2; i ++) {
            char character = stringBuilder.charAt(i);
            stringBuilder.setCharAt(i, stringBuilder.charAt(stringBuilder.length() - 1 - i));
            stringBuilder.setCharAt(stringBuilder.length() - 1 - i, character);
        }

        return stringBuilder;
    }

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("HUT");

        System.out.println(stringBuilder.charAt(0));

        stringBuilder.setCharAt(1, 'A');
        System.out.println(stringBuilder);

        stringBuilder.insert(3, "S");
        System.out.println(stringBuilder);

        stringBuilder.delete(2,3);
        System.out.println(stringBuilder); // HAS

        stringBuilder.append("N'T");
        System.out.println(stringBuilder);

        System.out.println(reverseString(new StringBuilder("Akshay")));
    }
}
