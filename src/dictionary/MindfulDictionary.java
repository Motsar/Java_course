package dictionary;


import java.util.HashMap;

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


}