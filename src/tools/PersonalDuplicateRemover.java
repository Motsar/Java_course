package tools;

import java.util.HashSet;
import java.util.Set;


public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> words;
    private int countDups = 0;

    public PersonalDuplicateRemover() {
        this.words = new HashSet<String>();
    }

    @Override
    public void add(String characterString) {
        if (words.contains(characterString)) {
            countDups++;
        }
        words.add(characterString);

    }

    @Override
    public int getNumberOfDetectedDuplicates() {

        return countDups;

    }

    @Override
    public Set<String> getUniqueCharacterStrings() {

        return words;
    }

    @Override
    public void empty() {

        words.clear();
        countDups = 0;

    }

}