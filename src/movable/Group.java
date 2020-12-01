package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {

    private List<Movable> group;

    public Group() {
        this.group = new ArrayList<Movable>();
    }


    public void addToGroup(Movable movable) {
        group.add(movable);
    }

    @Override
    public void move(int x, int y) {
        for (Movable e : group) {
            e.move(x, y);
        }
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (Movable e : this.group) {
            sb.append(e.toString()).append("\n");
        }
        return sb.toString();
    }

}
