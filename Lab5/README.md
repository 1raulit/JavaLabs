# Інструкція по запуску та використанню коду до лабораторної 5

## Наслідування та поліморфізм

Ця програма створює узагальнений клас та 3 класи-нащадки, що описують задану варіантом 7 область знань та дозволяє:
1. Створити пасажирський потяг.
2. Порахувати загальну чисельність пасажирів і багажу в потязі.
3. Провести сортування вагонів потягу за рівнем комфортності.
4. Знайти вагон в потязі, що відповідає заданому діапазону кількості пасажирів.

## Вимоги

- Java 8 або новіша версія
- Термінал або командний рядок для запуску програми

## Запуск

1. **Склонуйте репозиторій**:  
   ```bash
   git clone https://github.com/1raulit/JavaLabs.git
   ```
   ```bash
   cd JavaLabs\Lab5\src\main\java\org\example
   ```

2. **Скомпілюйте програму**:  
   Використайте наступну команду для компіляції файлів лабораторної:
   ```bash
   javac Main.java CoupeCar.java LuxuryCar.java PassengerTrain.java RailwayCar.java SleeperCar.java
   ```

3. **Запустіть програму**:  
   Після компіляції програми, ви можете її запустити за допомогою такої команди:
   ```bash
   java Main
   ```

## Приклад

```
Загальна кількість пасажирів: 140
Загальна кількість багажу: 90
Вагони після сортування за рівнем комфортності:
Клас: SleeperCar, Комфорт: 1
Клас: SleeperCar, Комфорт: 1
Клас: CoupeCar, Комфорт: 2
Клас: LuxuryCar, Комфорт: 3
Вагони з кількістю пасажирів у діапазоні [20, 50]:
Клас: SleeperCar, Пасажири: 50
Клас: CoupeCar, Пасажири: 20
```