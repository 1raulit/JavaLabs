# Інструкція по запуску та використанню коду до лабораторної 2

## Операції з матрицями на Java

Ця програма на Java виконує операції з рядками типу `string`. Програма дозволяє:
1. Ввести рядок типу `string`.
2. Вивести слова без повторень заданого тексту в алфавітному порядку за першою літерою.

## Вимоги

- Java 8 або новіша версія
- Термінал або командний рядок для запуску програми

## Запуск

1. **Склонуйте репозиторій**:  
   ```bash
   git clone https://github.com/1raulit/JavaLabs.git
   ```
   ```bash
   cd JavaLabs\Lab2\src\main\java\org\example
   ```

2. **Скомпілюйте програму**:  
   Використайте наступну команду для компіляції файлів лабораторної:
   ```bash
   javac Main.java UniqueWordsProcessor.java
   ```

3. **Запустіть програму**:  
   Після компіляції програми, ви можете її запустити за допомогою такої команди:
   ```bash
   java Main
   ```

4. **Введіть матрицю та константу**:  
    - Програма запросить вас ввести речення.
    - Введіть речення(типу 'string')

## Приклад

```
Enter your sentence: 
This is an example text, a text that has some repeated words. For example, the words text and example.
Unique words in alphabetical order:
a
an
and
example
for
has
is
repeated
some
text
that
the
this
words
```