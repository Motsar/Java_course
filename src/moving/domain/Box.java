package moving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing{
    private int maximumCapacity;
    private List<Thing> items;
    private int totalVolume;


    public Box(int maximumCapacity){
        this.maximumCapacity=maximumCapacity;
        this.items = new ArrayList<>();
    }

    public boolean addThing(Thing thing){
        if(thing.getVolume()+ getVolume()<=this.maximumCapacity){
            this.items.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public int getVolume() {
        totalVolume = 0;
        for(Thing thing : this.items) {
            totalVolume+=thing.getVolume();
        }
        return totalVolume;
    }

    @Override
    public String toString() {
        return " Box contains: " + items;
    }
}
