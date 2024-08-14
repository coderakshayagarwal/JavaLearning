package basic.recursions;

/*
 * Tower of Henoi
 */
public class Recursion5 {

    public static void towerOfHenoi(int diskNo, String source, String helper, String destination) {
        if (diskNo == 1) {
            System.out.println("transfer disk " + diskNo + " from " + source + " to " + destination);
            return;
        }
        towerOfHenoi(diskNo-1, source, destination, helper);
        System.out.println("transfer disk " + diskNo + " from " + source + " to " + destination);
        towerOfHenoi(diskNo-1, helper, source, destination);
    }

    public static void main(String[] args) {
        towerOfHenoi(5, "S", "H", "D");
    }
}
