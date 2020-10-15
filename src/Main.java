import java.util.Collections;
import java.util.ArrayList;


public class Main {
    public static void removeLast(ArrayList<String> list){
        int count = 0;
        for(String listItem: list){
            count+=1;
        }
        list.remove(count-1);
    }

    public static void main(String[] args) {
        ArrayList<String> brothers = new ArrayList<String>();
        brothers.add("Dick");
        brothers.add("Henry");
        brothers.add("Michael");
        brothers.add("Bob");

        System.out.println("brothers:");
        System.out.println(brothers);

// sorting brothers
        Collections.sort(brothers);

// removing the last item
        removeLast(brothers);

        System.out.println(brothers);

    }
}
