

public class Main {
    public static void main(String[] args) {
        CivilService serving = new CivilService();
        serving.work();
        serving.work();
        System.out.println(serving.getDaysLeft());
    }
}

