package boxes;

import java.util.Objects;

public class Thing  {

    private String name;
    private int weight;

    public Thing(String name, int weight) {

        if (weight < 0) {
            throw new IllegalArgumentException("weight should not be negative");
        }

        this.name = name;
        this.weight = weight;
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (!(object instanceof Thing)) {
            return false;
        }
        Thing thing = (Thing) object;
        if (this.getName().equals(thing.getName())) {
            return true;
        } else {
            return false;
        }
    }





}