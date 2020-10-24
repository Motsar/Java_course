public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.upperLimit= upperLimit;
    }

    public void next() {
        // write code here
        if(value!=upperLimit){
            value++;
        }else{
            value= 0;
        }
    }

    public String toString() {
        return String.valueOf(this.value);

    }
}
