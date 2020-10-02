import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in the radius:");
        int radius = Integer.parseInt(reader.nextLine());
        double circumreference = (double)radius * 2 * Math.PI;
        System.out.print("Circumference of the circle: " + circumreference);
    }
}
