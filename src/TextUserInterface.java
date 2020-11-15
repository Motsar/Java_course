import java.util.Scanner;

public class TextUserInterface {
    public Scanner reader;
    public Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start(){
        System.out.println("Statements:\n add - adds a word pair to the dictionary\n translate - asks a word and prints its translation\n quit - quits the text user interface");
        while(true){
            System.out.print("Statement: ");
            String input= reader.nextLine();
            if(input.equals("quit")){
                System.out.println("Cheers!");
                break;
            }else if(input.equals("add")){
                System.out.print("In Estonian: ");
                String estWord = reader.nextLine();
                System.out.print("Translation: ");
                String engWord = reader.nextLine();
                add(estWord,engWord);
            }else if(input.equals("translate")) {
                System.out.print("Type in an Estonian word: ");
                String typedWord = reader.nextLine();
                System.out.println("Translation: " + translate(typedWord));
            }  else{
                System.out.println("Unknown statement");
            }
        }
    }

    private void add(String word, String translation) {
        dictionary.add(word, translation);
    }

    public String translate(String word) {
        return dictionary.translate(word);
    }
}
