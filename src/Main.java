import java.util.Scanner;

public class Main {
    private static void printStars(int amount) {
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times
        int i = 1;
        while (i <= amount){
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }
}
