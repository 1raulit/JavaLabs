# Інструкція по запуску та використанню коду до лабораторної 6

## Робота з колекціями в мові програмування Java

Ця програма створює клас, що описує типізовану колекцію (типом колекції є узагальнений клас з лабораторної роботи №5), що реалізує інтерфейс Set() та має внутрішню структуру у вигляді однозв’язного списку та дозволяє:
1. Використовувати всі методи інтерфейсу Set() для роботи з типізовану колекцію потягів;

## Вимоги

- Java 8 або новіша версія
- Термінал або командний рядок для запуску програми

## Запуск

1. **Склонуйте репозиторій**:  
   ```bash
   git clone https://github.com/1raulit/JavaLabs.git
   ```
   ```bash
   cd JavaLabs\Lab6\src\main\java\org\example
   ```

2. **Скомпілюйте програму**:  
   Використайте наступну команду для компіляції файлів лабораторної:
   ```bash
   javac Main.java CoupeCar.java LuxuryCar.java PassengerTrain.java RailwayCar.java SleeperCar.java CustomLinkedSet.java
   ```

3. **Запустіть програму**:  
   Після компіляції програми, ви можете її запустити за допомогою такої команди:
   ```bash
   java Main
   ```

## Приклад

```
=== Створення та додавання вагонів ===
Список вагонів: [SleeperCar, CoupeCar, LuxuryCar]

=== Додавання колекції вагонів ===
Після додавання нових вагонів: [SleeperCar, CoupeCar, LuxuryCar, SleeperCar, CoupeCar]

=== Перевірка наявності вагону ===
Чи містить список вагон з 40 пасажирами і 150 багажу? true

=== Видалення елемента ===
Список після видалення вагону: [SleeperCar, LuxuryCar, SleeperCar, CoupeCar]

=== Перевірка розміру списку ===
Розмір списку: 4

=== Перебір списку за допомогою ітератора ===
Вагони у списку:
Клас: SleeperCar, Пасажири: 50, Багаж: 200, Комфорт: 1
Клас: LuxuryCar, Пасажири: 20, Багаж: 100, Комфорт: 3
Клас: SleeperCar, Пасажири: 60, Багаж: 250, Комфорт: 1
Клас: CoupeCar, Пасажири: 45, Багаж: 180, Комфорт: 2

=== Очистка списку ===
Список після очистки: []
Розмір списку після очистки: 0

=== Додавання нового вагону після очистки ===
Список вагонів: [LuxuryCar]
Розмір списку: 1
```