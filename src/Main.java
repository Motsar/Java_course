import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int lowerNumber = 2;
        int highrNumber = 131;
        while(lowerNumber <= highrNumber){
            if(lowerNumber % 2 == 0){
                System.out.println(lowerNumber);
            }
            lowerNumber++;
        }
    }
}
