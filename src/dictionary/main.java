package dictionary;

public class main {
    public static void main(String[] args) {
        MindfulDictionary dict = new MindfulDictionary("src/dictionary/words.txt");
        dict.load();

        dict.add("selg", "back");
        dict.add("soojus", "warmth");
        dict.add("maja", "house");

        dict.save();
    }
}
