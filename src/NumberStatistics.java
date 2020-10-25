import java.util.ArrayList;

public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;
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

    public int sum() {
        // code here
        for(int number : numbers){
            sum+=number;
        }
        return sum;
    }

    public int evenNumSum() {
        // code here
        int sumOfEvenNumbers = 0;
        for(int number : numbers){
            if(number % 2 == 0 ){
                sumOfEvenNumbers += number;
            }
        }
        return sumOfEvenNumbers;
    }

    public int oddNumSum() {
        // code here
        int sumOfOddNumbers = 0;
        for(int number : numbers){
            if(number % 2 != 0 ){
                sumOfOddNumbers += number;
            }
        }
        return sumOfOddNumbers;
    }

    public double average() {
        // code here

        double n = (double)sum/(double)amountOfNumbers;
        return n;
    }
}
