package org.example;

/**
 * Клас, що представляє плацкартний вагон.
 */
public class SleeperCar extends RailwayCar {
    public SleeperCar(int passengers, int baggage) {
        super(passengers, baggage);
    }

    @Override
    public int getComfortLevel() {
        return 1; // Рівень комфортності 1 (низький)
    }
}