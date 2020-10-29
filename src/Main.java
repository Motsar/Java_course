import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);

        while (true){
            System.out.print("name: ");
            String name = reader.nextLine();
            if(name.isEmpty()) {
                break;
            }
            System.out.print("studentnumber: ");
            String studentNumber = reader.nextLine();
            list.add(new Student(name, studentNumber));
        }

        for (Student student: list){
            System.out.println(student);
        }


    }
}
