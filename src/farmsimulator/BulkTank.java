package farmsimulator;

public class BulkTank {
    private double capacity;
    private double volume;

    public BulkTank(){
        this.capacity=2000;
        this.volume=0;
    }

    public BulkTank(double capacity){
        this.capacity=capacity;
        this.volume=0;
    }

    public double getCapacity(){
        return this.capacity;
    }

    public double getVolume(){
        return this.volume;
    }

    public double howMuchFreeSpace(){
        return this.capacity-this.volume;
    }

    public void addToTank(double amount){
        if(this.volume+amount<=this.capacity){
            this.volume+=amount;
        }else{
            this.volume=this.capacity;
        }
    }

    public double getFromTank(double amount){
        if(this.volume>=amount){
            return this.volume-=amount;
        }
        return this.volume = 0.0;
    }

    @Override
    public String toString() {

        return Math.round(getVolume()*10)/10.0+ "/" + getCapacity();

    }

}
