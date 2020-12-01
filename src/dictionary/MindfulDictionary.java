package dictionary;


import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;


public class MindfulDictionary {

    private String file;
    private Map<String, String> dictionary = new HashMap<String, String>();



    public void add(String word, String translation) {

        if (!dictionary.containsKey(word)) {
            dictionary.put(word, translation);
        }

    }

    public String translate(String word) {

        if (dictionary.containsKey(word)) {
            return dictionary.get(word);

        } else if (dictionary.containsValue(word)) {
            for (String key : dictionary.keySet()) {
                if (dictionary.get(key).equals(word)) {
                    return key;
                }
            }
        }
        return null;
    }

    public void remove(String word) {
        List<String> bin = new ArrayList<String>();

        if (dictionary.containsKey(word)) {
            dictionary.remove(word);

        } else if (dictionary.containsValue(word)) {
            for (String key : dictionary.keySet()) {
                if (dictionary.get(key).equals(word)) {
                    bin.add(key);
                }
            }

            for (String words : bin) {
                dictionary.remove(words);
            }
        }

    }

}