package org.example;

import java.util.List;

/**
 * Головний клас для запуску програми.
 */
public class Main {
    public static void main(String[] args) {
        try {
            PassengerTrain train = new PassengerTrain();

            // Додавання вагонів до потяга
            train.addCar(new SleeperCar(50, 30));
            train.addCar(new CoupeCar(20, 15));
            train.addCar(new LuxuryCar(10, 5));
            train.addCar(new SleeperCar(60, 40));

            // Виведення загальної кількості пасажирів і багажу
            System.out.println("Загальна кількість пасажирів: " + train.getTotalPassengers());
            System.out.println("Загальна кількість багажу: " + train.getTotalBaggage());

            // Сортування вагонів за рівнем комфортності
            train.sortByComfortLevel();
            System.out.println("Вагони після сортування за рівнем комфортності:");
            train.getCars().forEach(car ->
                    System.out.println("Клас: " + car.getClass().getSimpleName() + ", Комфорт: " + car.getComfortLevel())
            );

            // Пошук вагонів у заданому діапазоні пасажирів
            int minPassengers = 20;
            int maxPassengers = 50;
            List<RailwayCar> filteredCars = train.findCarsByPassengerRange(minPassengers, maxPassengers);
            System.out.println("Вагони з кількістю пасажирів у діапазоні [" + minPassengers + ", " + maxPassengers + "]:");
            filteredCars.forEach(car ->
                    System.out.println("Клас: " + car.getClass().getSimpleName() + ", Пасажири: " + car.getPassengers())
            );

        } catch (Exception e) {
            System.err.println("Помилка: " + e.getMessage());
        }
    }
}