import java.util.ArrayList;

public class NumberStatistics {
    private int amountOfNumbers;
    private ArrayList<Integer> numbers = new ArrayList<Integer>();

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        amountOfNumbers();
    }
    public void addNumber(int number) {
        // code here
        this.numbers.add(number);
    }
    public int amountOfNumbers() {
        // code here
        for(int number : numbers){
            amountOfNumbers+=1;
        }
        return amountOfNumbers;
    }
}
