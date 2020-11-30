package moving;


import moving.domain.Box;
import moving.domain.Item;
import moving.domain.Thing;


public class Main {

    public static void main(String[] args) {
        Box movingBox =new Box(200);
        movingBox.addThing(new Item("passport", 2));
        movingBox.addThing(new Item("printer", 50));
        movingBox.addThing(new Item("toothbrash", 1));
        movingBox.addThing(new Item("circular saw", 100));

        System.out.println(movingBox.getVolume());
    }
}
