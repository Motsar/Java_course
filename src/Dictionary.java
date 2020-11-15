import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> translations;

    public Dictionary(){
        this.translations = new HashMap<String,String>();
    }

    public String translate(String word){
        return this.translations.get(stringCleaner(word));
    }

    public void add(String word, String translation){
        this.translations.put(stringCleaner(word),stringCleaner(translation));
    }

    private String stringCleaner(String string) {
        if (string == null) {
            return "";
        }
        string = string.toLowerCase();
        return string.trim();
    }
}
