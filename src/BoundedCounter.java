public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int startValue) {
        // write code here
        this.upperLimit = 59;
        this.value = startValue;
    }

    public void next() {
        // write code here
        if(value!=upperLimit){
            value++;
        }else{
            value= 0;
        }
    }

    public int setValue(int counterValue){
        return value = counterValue;
    }

    public int getValue() {
        return value;

    }

    public String toString() {
        int digits = String.valueOf(this.value).length();
        if(digits<2){
            return String.format("%02d", this.value);
        }else{
            return String.valueOf(this.value);
        }
    }
}
