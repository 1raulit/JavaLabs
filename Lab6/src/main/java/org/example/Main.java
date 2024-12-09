package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Створення та додавання вагонів ===");
        CustomLinkedSet<RailwayCar> railwayCars = new CustomLinkedSet<>();

        // Додавання елементів до списку
        railwayCars.add(new SleeperCar(50, 200));
        railwayCars.add(new CoupeCar(40, 150));
        railwayCars.add(new LuxuryCar(20, 100));

        // Виведення списку
        System.out.println("Список вагонів: " + railwayCars);

        System.out.println("\n=== Додавання колекції вагонів ===");
        CustomLinkedSet<RailwayCar> moreCars = new CustomLinkedSet<>(Arrays.asList(
                new SleeperCar(60, 250),
                new CoupeCar(45, 180)
        ));
        railwayCars.addAll(moreCars);

        // Виведення списку після додавання
        System.out.println("Після додавання нових вагонів: " + railwayCars);

        System.out.println("\n=== Перевірка наявності вагону ===");
        RailwayCar testCar = new CoupeCar(40, 150);
        System.out.println("Чи містить список вагон з 40 пасажирами і 150 багажу? " + railwayCars.contains(testCar));

        System.out.println("\n=== Видалення елемента ===");
        railwayCars.remove(testCar);
        System.out.println("Список після видалення вагону: " + railwayCars);

        System.out.println("\n=== Перевірка розміру списку ===");
        System.out.println("Розмір списку: " + railwayCars.size());

        System.out.println("\n=== Перебір списку за допомогою ітератора ===");
        System.out.println("Вагони у списку:");
        for (RailwayCar car : railwayCars) {
            System.out.println("Клас: " + car.getClass().getSimpleName() +
                    ", Пасажири: " + car.getPassengers() +
                    ", Багаж: " + car.getBaggage() +
                    ", Комфорт: " + car.getComfortLevel());
        }

        System.out.println("\n=== Очистка списку ===");
        railwayCars.clear();
        System.out.println("Список після очистки: " + railwayCars);
        System.out.println("Розмір списку після очистки: " + railwayCars.size());

        System.out.println("\n=== Додавання нового вагону після очистки ===");
        railwayCars.add(new LuxuryCar(25, 120));
        System.out.println("Список вагонів: " + railwayCars);
        System.out.println("Розмір списку: " + railwayCars.size());
    }
}