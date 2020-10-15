import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = input.nextLine();
        int i = 0;
        if(name.length() >= 3){
            while(i < 3){
                System.out.println((i+1) + ". character: " + name.charAt(i));
                i++;
            }
        }
    }
}
