package people;



public class main {

    public static void main(String[] args) {
        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);
        System.out.println("credits " + olli.credits());
        olli.study();
        System.out.println("credits "+ olli.credits());
    }
}
