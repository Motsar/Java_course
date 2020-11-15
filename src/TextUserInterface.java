import java.util.Scanner;

public class TextUserInterface {
    public Scanner reader;
    public Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start(){
        System.out.println("Statements:\n quit - quits the text user interface");
        while(true){
            System.out.print("Statement: ");
            String input= reader.nextLine();
            if(input.equals("quit")){
                System.out.println("Cheers!");
                break;
            }else{
                System.out.println("Unknown statement");
            }
        }


    }

}
