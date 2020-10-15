import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int sum = 0;
        int countAll = 0;
        int countEven = 0;
        int countOdd = 0;
        double average = 0.0;
        while(true){
            int number = Integer.parseInt(reader.nextLine());
            if(number == -1){
                break;
            }
            countAll++;
            if(number % 2 == 0){
                countEven++;
            } else {
                countOdd++;
            }
            sum += number;
            average = (double)sum / countAll;
        }
        System.out.println("Thank you and see you later!");
        System.out.println("Sum is " + sum);
        System.out.println("How many numbers: " + countAll);
        System.out.println("How many even numbers: " + countEven);
        System.out.println("How many odd numbers: " + countOdd);
        System.out.println("Average: " + average);
    }
}
