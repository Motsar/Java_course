
public class Student {
    private String name;
    private String studentNumber;

    public Student(String newName, String NewStudentNumber){
        this.name= newName;
        this.studentNumber=NewStudentNumber;
    }
    public String getName() {
        return name;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String toString() {
        return this.name + " (" + this.studentNumber +")";
    }
}
