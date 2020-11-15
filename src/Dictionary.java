import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> translations;
    private ArrayList<String> translation = new ArrayList<String>();

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

    public int amountOfWords(){
        int amount = 0;
        for (String key: this.translations.keySet()){
            amount+=1;
        }
        return amount;
    }

    public ArrayList<String> translationList(){
        for (String key: this.translations.keySet()){
            this.translation.add(key+" = "+this.translations.get(key));
        }
        return this.translation;
    }
}
