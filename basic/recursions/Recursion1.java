package basic.recursions;


/*
Print numbers from 5 to 1
*/
public class Recursion1 {
    public static void printNums(int num) {
        if (num == 0 ){
            return;
        }
        System.out.println(num);
        printNums(--num);
    }

    public static void main(String[] args) {
        printNums(5);
    }
}
