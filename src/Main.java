import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverseText(text));
    }

    public static String reverseText(String text) {
        // write your code here
        String reverseText = "";
        int i = text.length() - 1;
        while (i >= 0) {
            char symbol = text.charAt(i);
            reverseText += symbol;
            i--;
        }
        return reverseText;
    }
}
