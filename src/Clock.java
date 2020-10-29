public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and
        // set to have the correct initial values
        this.hours= new BoundedCounter(hoursAtBeginning);
        this.minutes= new BoundedCounter(minutesAtBeginning);
        this.seconds= new BoundedCounter(secondsAtBeginning);
    }

    public void tick(){
        //clock advances by 1 sec
        if(this.seconds.getValue()== 59){
            if (this.minutes.getValue()==59){
                if(this.hours.getValue()==23){
                    this.hours.setValue(0);
                }else{
                    this.hours.next();
                }
            }
            this.minutes.next();
            this.seconds.next();
        }else{
            this.seconds.next();
        }
    }

    public String toString() {
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }
}
