import java.util.Scanner;

public class Main {
    public static int least(int number1, int number2) {
        // write program code here
        // do not print anything inside the method
        int least;
        if (number1 < number2) {
            least = number1;
        } else if (number2 < number1) {
            least = number2;
        } else {
            least = number1;
        }
        // method needs a return in the end
        return least;
    }

    public static void main(String[] args) {
        int answer = least(2, 7);
        System.out.println("Least: " + answer);
    }
}
