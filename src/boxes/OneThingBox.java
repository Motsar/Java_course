package boxes;

public class OneThingBox extends Box {

    private Thing t;

    @Override
    public void add(Thing thing) {
        if (this.t == null) {
            t = thing;
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {

        return this.t != null && this.t.equals(t);

    }

}
