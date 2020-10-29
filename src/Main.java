public class Main {
    public static void main(String[] args) throws Exception {

        Counter counter1 = new Counter(0, true);
        Counter counter2 = new Counter(0);
        Counter counter3 = new Counter(true);
        Counter counter4 = new Counter();

        counter1.increase();
        counter2.increase();
        counter3.increase();
        counter4.increase();

        counter1.decrease();
        counter2.decrease();
        counter3.decrease();
        counter4.decrease();

        counter1.decrease();
        counter2.decrease();
        counter3.decrease();
        counter4.decrease();

        counter1.decrease(10);
        counter2.decrease(10);
        counter3.decrease(10);
        counter4.decrease(10);

        System.out.println(counter1);
        System.out.println(counter2);
        System.out.println(counter3);
        System.out.println(counter4);
    }
}