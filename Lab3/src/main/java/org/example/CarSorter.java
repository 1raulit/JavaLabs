package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class CarSorter {

    /**
     * Сортує масив автомобілів за ціною (зростанням) та пробігом (спаданням).
     *
     * @param cars масив автомобілів
     */
    public static void sortCars(Car[] cars) {
        Arrays.sort(cars, Comparator.comparingDouble(Car::getPrice)
                .thenComparing(Comparator.comparingDouble(Car::getMileage).reversed()));
    }

    /**
     * Пошук автомобіля, ідентичного заданому.
     *
     * @param cars масив автомобілів
     * @param targetCar автомобіль для пошуку
     * @return індекс знайденого автомобіля або -1, якщо не знайдено
     */
    public static int findCar(Car[] cars, Car targetCar) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].equals(targetCar)) {
                return i;
            }
        }
        return -1;
    }
}
