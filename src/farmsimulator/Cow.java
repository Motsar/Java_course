package farmsimulator;

import java.util.Random;

public class Cow implements Milkable,Alive{
    private String name;
    private double udderCapacity;
    private  double amountOfMilk;
    private final Random randNum = new Random();
    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    public Cow(){
        this.name = NAMES[randNum.nextInt(NAMES.length)];
        this.udderCapacity = randNum.nextInt(40 - 15) + 15;
        this.amountOfMilk = 0;
    }

    public Cow(String name) {

        this.name = name;
        this.udderCapacity = randNum.nextInt(40 - 15) + 15;
        this.amountOfMilk = 0;
    }

    public String getName() {

        return this.name;
    }

    public double getCapacity() {

        return this.udderCapacity;
    }

    public double getAmount() {

        return this.amountOfMilk;
    }

    @Override
    public double milk() {
        double buffer = this.amountOfMilk;
        this.amountOfMilk = 0;
        return buffer;

    }

    @Override
    public void liveHour() {
        double milkProduced = 0.7 + (randNum.nextDouble()*(2 - 0.7));

        if (getAmount() + milkProduced <= getCapacity()) {
            this.amountOfMilk += milkProduced;
        }else{
            this.amountOfMilk = this.udderCapacity;
        }
    }

    @Override
    public String toString() {
        return this.name + " " + Math.round(this.amountOfMilk*10)/10.0 + "/" + Math.ceil(this.udderCapacity);
    }




}
