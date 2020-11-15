import java.util.ArrayList;
import java.util.List;

public class Box {
    private double maxCap;
    public ArrayList<ToBeStored> items;
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

    public double weight() {
        double weight = 0;
        for(ToBeStored object : items){
            weight+=object.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + numOfItems + " things, total weight is " + this.weight() + " kg.";
    }
}
