import java.util.ArrayList;
import java.util.List;

public class Box {
    private double maxCap;
    private ArrayList<ToBeStored> items;
    private double currWeight;
    private int numOfItems;

    public Box(double capacity){
       this.maxCap = capacity;
    }

    public void add(ToBeStored item){
        this.currWeight += item.weight();
        if(this.currWeight<=maxCap){
            this.items = new ArrayList<ToBeStored>();
            this.items.add((ToBeStored) item);
            this.numOfItems+=1;
        }else{
            this.currWeight -= item.weight();
        }
    }

    @Override
    public String toString() {
        return "Box: " + numOfItems + " things, total weight is " + currWeight + " kg.";
    }
}
