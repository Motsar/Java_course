import java.util.ArrayList;


public class Main {
    public static double average(ArrayList<Integer> list) {
        // write your code here
        int count = 0;
        int sum = 0;
        for(int listItem: list){
            count+=1;
            sum+=listItem;
        }

        return (double) sum/count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}
