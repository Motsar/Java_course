import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in a number:");
        int points = Integer.parseInt(reader.nextLine());

        if (points < 0 || 60 < points) {
            System.out.println("Points need to be between 0 and 60");
        } else {
            if (points >= 0 && points <= 29) {
                String grade = "failed";
                System.out.println("you have " + grade + " the test!");
            } else {
                int grade = 0;
                if (points > 29 && points <= 34) {
                    grade = 1;
                } else if (points > 35 && points <= 39) {
                    grade = 2;
                } else if (points > 40 && points <= 44) {
                    grade = 3;
                } else if (points > 45 && points <= 49) {
                    grade = 4;
                } else if (points > 50 && points <= 60) {
                    grade = 5;
                }
                System.out.println("Grade is :"+ grade +" !");
            }
        }
    }
}
