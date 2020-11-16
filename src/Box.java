import java.util.ArrayList;


public class Box implements ToBeStored {
    private double maxCap;
    public ArrayList<ToBeStored> items;
    private double currWeight;
    private int numOfItems;

    public Box(double capacity){
        this.items = new ArrayList<>();
       this.maxCap = capacity;
    }

    @Override
    public double weight() {
        double weight = 0;
        for(ToBeStored object : items){
            weight+=object.weight();
        }
        return weight;
    }

    public void add(ToBeStored item){

        if(weight()+item.weight()<=maxCap){
            this.items.add(item);
        }
    }



    @Override
    public String toString() {
        return "Box: " + this.items.size() + " things, total weight is " + weight() + " kg.";
    }
}
