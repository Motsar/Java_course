

public class Main {
    public static void main(String[] args) {
        MilitaryService inTheArmyNow = new MilitaryService(273);
        inTheArmyNow.work();
        inTheArmyNow.work();
        inTheArmyNow.work();
        System.out.println(inTheArmyNow.getDaysLeft());
    }
}

