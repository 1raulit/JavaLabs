package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a word consisting of a list of letters.
 */
public class Word {
    private final List<Letter> letters;

    public Word(String word) {
        letters = new ArrayList<>();
        for (char c : word.toCharArray()) {
            letters.add(new Letter(c));
        }
    }

    @Override
    public String toString() {
        String word = "";
        for (Letter letter : letters) {
            word += letter.getCharacter();
        }
        return word;
    }
}