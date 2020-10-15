import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = input.nextLine();
        System.out.print("Length of the first part: ");
        int lengthOfFirstPart = Integer.parseInt(input.nextLine());
        System.out.println("Result: " + word.substring(0, lengthOfFirstPart));
    }
}
