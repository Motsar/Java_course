package application;


public class main {

        public static void main(String[] args) {
            Thermometer Tartu = new Thermometer();
            Thermometer Tallinn = new Thermometer();
            Thermometer Põlva = new Thermometer();
            Tallinn.on();


            System.out.println(Tartu.measure());
            System.out.println( Tallinn.measure());
            System.out.println(Põlva.measure() );
            Põlva.off();
            System.out.println(Põlva.measure() );
        }

}
