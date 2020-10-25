import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberStatistics stats = new NumberStatistics();
        Scanner reader = new Scanner(System.in);
        int insertedNum;
        System.out.print("Type numbers: ");
        insertedNum = Integer.parseInt(reader.nextLine());
        while (insertedNum>=0){
            stats.addNumber(insertedNum);
            insertedNum = Integer.parseInt(reader.nextLine());
        }
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + stats.evenNumSum());
        System.out.println("sum of odd: " + stats.oddNumSum());
    }
}