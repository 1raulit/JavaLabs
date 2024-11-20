# Інструкція по запуску та використанню коду до лабораторної 3

## Класи в мові програмування Java

Ця програма на Java має клас автомобіль, який складається з 5-и полів та дозволяє:
1. Відсортувати масив, за одним з полів за зростанням, а за іншим — за спаданням.
2. Знайти в масиві об’єкт, який ідентичний заданому.

## Вимоги

- Java 8 або новіша версія
- Термінал або командний рядок для запуску програми

## Запуск

1. **Склонуйте репозиторій**:  
   ```bash
   git clone https://github.com/1raulit/JavaLabs.git
   ```
   ```bash
   cd JavaLabs\Lab3\src\main\java\org\example
   ```

2. **Скомпілюйте програму**:  
   Використайте наступну команду для компіляції файлів лабораторної:
   ```bash
   javac Main.java CarSorter.java Car.java
   ```

3. **Запустіть програму**:  
   Після компіляції програми, ви можете її запустити за допомогою такої команди:
   ```bash
   java Main
   ```

## Приклад

```
Before Sorting:
Car{model='Model S', brand='Tesla', year=2020, price=80000.0, mileage=20000.0}
Car{model='Civic', brand='Honda', year=2018, price=18000.0, mileage=30000.0}
Car{model='Mustang', brand='Ford', year=2022, price=55000.0, mileage=15000.0}
Car{model='Camry', brand='Toyota', year=2021, price=27000.0, mileage=25000.0}
Car{model='3 Series', brand='BMW', year=2019, price=35000.0, mileage=40000.0}

After Sorting by Price (ascending) and Mileage (descending):
Car{model='Civic', brand='Honda', year=2018, price=18000.0, mileage=30000.0}
Car{model='Camry', brand='Toyota', year=2021, price=27000.0, mileage=25000.0}
Car{model='3 Series', brand='BMW', year=2019, price=35000.0, mileage=40000.0}
Car{model='Mustang', brand='Ford', year=2022, price=55000.0, mileage=15000.0}
Car{model='Model S', brand='Tesla', year=2020, price=80000.0, mileage=20000.0}

Found car: Car{model='Mustang', brand='Ford', year=2022, price=55000.0, mileage=15000.0}
```
