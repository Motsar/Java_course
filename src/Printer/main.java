package Printer;


public class main {
    public static void main(String[] args) throws Exception {
        Printer printer = new Printer("src/Printer/hymn.txt");

        printer.printLinesWhichContain("sünnitand");
        System.out.println("-----");
        printer.printLinesWhichContain("isamaa");
        System.out.println("-----");
        printer.printLinesWhichContain("Led Zeppelin");
        System.out.println("-----");
        printer.printLinesWhichContain("");
        System.out.println("-----");


    }
}
