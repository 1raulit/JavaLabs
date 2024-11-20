package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a text consisting of multiple sentences.
 */
public class Text {
    private final List<Sentence> sentences;

    public Text(String text) {
        sentences = new ArrayList<>();

        // Split text into sentences using regex for sentence delimiters
        String[] sentenceArray = text.split("(?<=[.!?])\\s+");
        for (String sentenceStr : sentenceArray) {
            sentences.add(new Sentence(sentenceStr));
        }
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    @Override
    public String toString() {
        String text = "";
        for (Sentence sentence : sentences) {
            text += sentence.toString() + " ";
        }
        return text.trim();
    }
}