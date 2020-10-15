import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static int countItems(ArrayList<String> list){
        int count = 0;
        for(String listItem: list){
            count+=1;
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = input.nextLine();
        words.add(word);
        while(word.length()!=0){

            System.out.print("Type a word: ");
            word = input.nextLine();
            if(word.length()!=0){
                words.add(word);
            }
        }
        System.out.println("There are "+countItems(words)+" items in the list: ");
        for(String listWord : words){
            System.out.println(listWord);
        }

    }
}
