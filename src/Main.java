import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your age:");
        int age = Integer.parseInt(reader.nextLine());
        String status ="";
        if (age > 0 && 120 > age) {
            status = "OK";
        } else {
            status = "Impossible!";
        }
        System.out.println(status);
    }
}
