package org.example;

/**
 * Клас, що представляє люксовий вагон.
 */
public class LuxuryCar extends RailwayCar {
    public LuxuryCar(int passengers, int baggage) {
        super(passengers, baggage);
    }

    @Override
    public int getComfortLevel() {
        return 3; // Рівень комфортності 3 (високий)
    }
}