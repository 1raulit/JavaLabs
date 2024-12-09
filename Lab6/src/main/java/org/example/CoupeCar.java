package org.example;

/**
 * Клас, що представляє купейний вагон.
 */
public class CoupeCar extends RailwayCar {
    public CoupeCar(int passengers, int baggage) {
        super(passengers, baggage);
    }

    @Override
    public int getComfortLevel() {
        return 2; // Рівень комфортності 2 (середній)
    }
}