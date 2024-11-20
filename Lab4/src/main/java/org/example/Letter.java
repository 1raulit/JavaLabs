package org.example;

/**
 * Represents a single character in a word.
 */
public class Letter {
    private final char character;

    public Letter(char character) {
        this.character = character;
    }

    public char getCharacter() {
        return character;
    }

    @Override
    public String toString() {
        return String.valueOf(character);
    }
}