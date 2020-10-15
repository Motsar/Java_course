import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the password: ");
        String password = reader.nextLine();
        while(!password.equals("carrot")){
            System.out.println("Wrong!");
            System.out.print("Type the password: ");
            password = reader.nextLine();
        }
        System.out.println("Right!");
        System.out.println();
        System.out.println("The secret is: jryy qbar!");
    }
}
