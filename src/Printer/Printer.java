package Printer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Printer {
    private File f;
    private Scanner reader;


    public Printer(String fileName) throws Exception{

        try {
            this.f = new File(fileName);
        } catch (Exception e) {
            System.out.println("We couldn't read the file. Error: " + e.getMessage());
            return;
        }


    }

    public void printLinesWhichContain(String word) throws FileNotFoundException {
        this.reader = new Scanner(f, "UTF-8");

        String buffer = "";
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (line.contains(word)) {
                buffer += line +"\n";
                System.out.println(line);
            }
        }
        reader.close();
    }

}
