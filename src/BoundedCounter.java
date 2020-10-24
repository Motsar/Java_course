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
        int digits = String.valueOf(this.value).length();
        if(digits<2){
            return String.format("%02d", this.value);
        }else{
            return String.valueOf(this.value);
        }
    }
}
