import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = input.nextLine();
        while(!words.contains(word)){
            words.add(word);
            System.out.print("Type a word: ");
            word = input.nextLine();
        }
        System.out.println("You typed word " +word+ " twice!");
    }
}
