package org.example;

/**
 * Абстрактний клас, що описує загальні характеристики вагонів.
 */
public abstract class RailwayCar {
    private int passengers;
    private int baggage;

    public RailwayCar(int passengers, int baggage) {
        if (passengers < 0 || baggage < 0) {
            throw new IllegalArgumentException("Кількість пасажирів і багажу не може бути негативною.");
        }
        this.passengers = passengers;
        this.baggage = baggage;
    }

    public int getPassengers() {
        return passengers;
    }

    public int getBaggage() {
        return baggage;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof RailwayCar)) return false;

        RailwayCar car = (RailwayCar) o;

        return passengers == car.passengers &&
                baggage == car.baggage;
    }

    /**
     * Метод для отримання рівня комфортності вагона.
     * @return рівень комфортності.
     */
    public abstract int getComfortLevel();
}