package org.example;

import java.util.Arrays;

/**
 * Головний клас для запуску програми.
 */
public class Main {

    public static void main(String[] args) {
        // Створюємо масив об'єктів Car
        Car[] cars = {
                new Car("Model S", "Tesla", 2020, 80000, 20000),
                new Car("Civic", "Honda", 2018, 18000, 30000),
                new Car("Mustang", "Ford", 2022, 55000, 15000),
                new Car("Camry", "Toyota", 2021, 27000, 25000),
                new Car("3 Series", "BMW", 2019, 35000, 40000)
        };

        System.out.println("Before Sorting:");
        Arrays.stream(cars).forEach(System.out::println);

        // Сортування масиву автомобілів
        CarSorter.sortCars(cars);

        System.out.println("\nAfter Sorting by Price (ascending) and Mileage (descending):");
        Arrays.stream(cars).forEach(System.out::println);

        // Пошук заданого автомобіля
        Car targetCar = new Car("Mustang", "Ford", 2022, 55000, 15000);
        int index = CarSorter.findCar(cars, targetCar);

        if (index != -1) {
            System.out.println("\nFound car: " + cars[index]);
        } else {
            System.out.println("\nCar not found");
        }
    }
}
