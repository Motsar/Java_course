import java.util.Scanner;


public class Main {

    public static boolean palindrome(String text) {
        // write your code here
        String reverseText = "";
        int i = text.length() - 1;
        while (i >= 0) {
            char symbol = text.charAt(i);
            reverseText += symbol;
            i--;
        }
        if(text!=reverseText){
            return false;
        }else{
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
