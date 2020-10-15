import java.util.Scanner;

public class Main {
    public static double average(int number1, int number2, int number3, int number4) {
        // write your code here
        int sum = number1 + number2 + number3 + number4;
        double averageNum = (double) sum / 4;
        return averageNum;
    }

    public static void main(String[] args) {
        double answer = average(4, 112, 6, 1);
        System.out.println("average: " + answer);
    }
}
