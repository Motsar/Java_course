import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in a number:");
        int number = Integer.parseInt(reader.nextLine());
        if (number % 2 == 1) {
            System.out.println("The number is odd!");
        } else {
            System.out.println("The number is even!");
        }
    }
}
