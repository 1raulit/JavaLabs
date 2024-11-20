package org.example;

import java.util.Set;
import java.util.TreeSet;

/**
 * Processes text to print unique words in alphabetical order.
 */
public class UniqueWordsProcessor {

    /**
     * Prints unique words from the provided text in alphabetical order.
     *
     * @param textObj The text object containing sentences.
     */
    public void printUniqueWords(Text textObj) {
        if (textObj == null || textObj.getSentences().isEmpty()) {
            System.out.println("Error: Text cannot be empty or null");
            return;
        }

        Set<String> uniqueWords = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

        // Extract words from sentences
        for (Sentence sentence : textObj.getSentences()) {
            for (Word word : sentence.getWords()) {
                String wordStr = word.toString().toLowerCase();
                if (!wordStr.isEmpty()) {
                    uniqueWords.add(wordStr);
                }
            }
        }

        // Print unique words
        System.out.println("Unique words in alphabetical order:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}
