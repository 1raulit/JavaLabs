package org.example;

import java.util.Scanner;

/**
 * Main class to execute the text processing application.
 */
public class Main {
    public static void main(String[] args) {
        // Create an instance of the UniqueWordsProcessor
        UniqueWordsProcessor processor = new UniqueWordsProcessor();
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.println("Enter your sentence: ");
        String inputText = scanner.nextLine();

        // Create Text object
        Text text = new Text(inputText);

        // Invoke method to print unique words
        processor.printUniqueWords(text);
    }
}