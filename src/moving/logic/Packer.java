package moving.logic;

import moving.domain.Box;
import moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

public class Packer {
    private int boxesVolume;
    private Box box;
    private List<Box> boxes;


    public Packer(int boxesVolume){
        this.boxesVolume=boxesVolume;
        this.box = new Box(boxesVolume);
        this.boxes = new ArrayList<Box>();
    }

    public List<Box> packThings(List<Thing> things){
        if(things.size()> 0){
            this.boxes.add(box);
            for (Thing thing : things){
                if (this.box.addThing(thing) == false){
                    Box newBox = new Box(boxesVolume);
                    newBox.addThing(thing);
                    this.boxes.add(newBox);
                }
            }
        }
        return this.boxes;
    }
}