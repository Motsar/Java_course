import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = input.nextLine();
        words.add(word);
        while(word.length()!=0){

            System.out.print("Type a word: ");
            word = input.nextLine();
            words.add(word);
        }
        Collections.sort(words);
        System.out.println("You typed the following words:");
        for (String listWord : words) {
            System.out.println( listWord );
        }
    }
}
