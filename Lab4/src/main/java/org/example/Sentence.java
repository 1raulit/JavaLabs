package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a sentence consisting of words and punctuation marks.
 */
public class Sentence {
    private final List<Word> words;
    private final List<Character> punctuationMarks;

    public Sentence(String sentence) {
        words = new ArrayList<>();
        punctuationMarks = new ArrayList<>();

        // Replace multiple spaces or tabs with a single space
        sentence = sentence.replaceAll("\\s+", " ").trim();

        // Split sentence into words and punctuation
        String[] tokens = sentence.split("(?=[,.!?])|\\s+");
        for (String token : tokens) {
            if (token.matches("[,.!?]")) {
                punctuationMarks.add(token.charAt(0));
            } else {
                words.add(new Word(token));
            }
        }
    }

    public List<Word> getWords() {
        return words;
    }

    @Override
    public String toString() {
        String sentence = "";
        for (Word word : words) {
            sentence += word.toString() + " ";
        }
        for (Character punctuation : punctuationMarks) {
            sentence += punctuation;
        }
        return sentence.trim();
    }
}