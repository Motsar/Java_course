package dictionary;

public class main {
    public static void main(String[] args) {
        MindfulDictionary dict = new MindfulDictionary("src/dictionary/words.txt");
        dict.load();

        System.out.println( dict.translate("apina") );
        System.out.println( dict.translate("ohjelmointi") );
        System.out.println( dict.translate("alla oleva") );
    }
}
