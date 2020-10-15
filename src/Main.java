import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static int greatest(ArrayList<Integer> list) {
        // write your code here
        Collections.sort(list);
        int count = 0;

        for(int listItem: list){
            count+=1;
        }

        return list.get(count-1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(22);
        System.out.println("The greatest number is: " + greatest(list));
    }
}
