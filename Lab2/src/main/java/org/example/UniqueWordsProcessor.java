package org.example;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class UniqueWordsProcessor {

    // Метод для друку слів без повторень в алфавітному порядку
    public void printUniqueWords(String text) {
        // Перевірка вхідного рядка на null і порожнечу
        if (text == null || text.trim().isEmpty()) {
            System.out.println("Error: String cannot be empty or null");
            return;
        }

        try {
            // Розділення тексту на слова
            String[] wordsArray = text.split("\\W+");

            // Використання TreeSet для зберігання унікальних слів в алфавітному порядку
            Set<String> uniqueWords = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

            // Додавання слів у множину
            for (String word : wordsArray) {
                if (!word.trim().isEmpty()) {
                    uniqueWords.add(word.toLowerCase()); // Додаємо слова без урахування регістру
                }
            }

            // Друк унікальних слів
            System.out.println("Unique words in alphabetical order:");
            for (String word : uniqueWords) {
                System.out.println(word);
            }
        } catch (Exception e) {
            // Обробка загальних виключень
            System.out.println("An error occurred while processing the text: " + e.getMessage());
        }
    }
}
