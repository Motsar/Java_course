package farmsimulator;

import java.util.Collection;

public class Barn {

    private final BulkTank tank;
    private MilkingRobot milkingRobot;

    public Barn(BulkTank tank) {

        this.tank = tank;

    }

    public BulkTank getBulkTank() {

        return this.tank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {

        this.milkingRobot = milkingRobot;
        milkingRobot.setBulkTank(this.tank);
    }

    public void takeCareOf(Cow cow) {

        if (this.milkingRobot == null) {
            throw new IllegalStateException("No MilkingRobot hasn't been installed");
        }

        this.milkingRobot.milk(cow);

    }

    public void takeCareOf(Collection<Cow> cows) {

        if (this.milkingRobot == null) {
            throw new IllegalStateException("No MilkingRobot hasn't been installed");
        }

        for (Cow cow : cows) {
            this.milkingRobot.milk(cow);
        }

    }

    public String toString() {

        return this.tank.toString();
    }

}
