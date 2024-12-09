package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Клас, що описує пасажирський потяг.
 */
public class PassengerTrain {
    private List<RailwayCar> cars;

    public PassengerTrain() {
        cars = new ArrayList<>();
    }

    public void addCar(RailwayCar car) {
        cars.add(car);
    }

    /**
     * Метод для підрахунку загальної кількості пасажирів у потязі.
     * @return кількість пасажирів.
     */
    public int getTotalPassengers() {
        return cars.stream().mapToInt(RailwayCar::getPassengers).sum();
    }

    /**
     * Метод для підрахунку загальної кількості багажу у потязі.
     * @return кількість багажу.
     */
    public int getTotalBaggage() {
        return cars.stream().mapToInt(RailwayCar::getBaggage).sum();
    }

    /**
     * Метод для сортування вагонів за рівнем комфортності.
     */
    public void sortByComfortLevel() {
        cars.sort(Comparator.comparingInt(RailwayCar::getComfortLevel));
    }

    /**
     * Метод для пошуку вагонів у заданому діапазоні кількості пасажирів.
     * @param minPassengers мінімальна кількість пасажирів.
     * @param maxPassengers максимальна кількість пасажирів.
     * @return список вагонів, що відповідають умовам.
     */
    public List<RailwayCar> findCarsByPassengerRange(int minPassengers, int maxPassengers) {
        if (minPassengers < 0 || maxPassengers < minPassengers) {
            throw new IllegalArgumentException("Некоректний діапазон пасажирів.");
        }
        List<RailwayCar> result = new ArrayList<>();
        for (RailwayCar car : cars) {
            if (car.getPassengers() >= minPassengers && car.getPassengers() <= maxPassengers) {
                result.add(car);
            }
        }
        return result;
    }

    public List<RailwayCar> getCars() {
        return cars;
    }
}