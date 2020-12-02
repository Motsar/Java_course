package boxes;

import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box {

    private int maxWeight;
    private List<Thing> t;

    public MaxWeightBox(int maxWeight) {

        this.maxWeight = maxWeight;
        this.t = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        int boxWeight = 0;
        for(Thing e : t){
            boxWeight += e.getWeight();
        }
        if(boxWeight + thing.getWeight() <= maxWeight){
            t.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return t.contains(thing);
    }

}
