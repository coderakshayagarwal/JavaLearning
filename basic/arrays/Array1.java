package basic.arrays;

public class Array1 {
    public static void main(String[] args) {
        
        // Defining array type 1 - with size of array
        int [] marks = new int[2];
        marks[0] = 12;
        marks[1] = 88;
        // System.out.println(marks[0]);

        for (int i = 0; i < marks.length; i ++) {
            System.err.println(marks[i]);
        }

        // defining array type 2 - with inputs
        String [] subjects = {"English", "Hindi"};

        // taking size in variable
        int size = 12;
        String [] names = new String[size];
    }
    
}
