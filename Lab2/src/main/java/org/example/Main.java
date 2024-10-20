package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Створюємо об'єкт класу UniqueWordsProcessor
        UniqueWordsProcessor processor = new UniqueWordsProcessor();
        Scanner scanner = new Scanner(System.in);
//        This is an example text, a text that has some repeated words. For example, the words text and example.
        // Текст для обробки
        System.out.println("Enter your sentence: ");
        String text = scanner.nextLine();

        // Виклик методу для друку унікальних слів
        processor.printUniqueWords(text);
    }
}
