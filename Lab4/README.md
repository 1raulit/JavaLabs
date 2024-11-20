# Інструкція по запуску та використанню коду до лабораторної 4

## Відношення між класами в мові програмування Java

Ця програма в якості типів використовує створені класи літер, слів, речень, розділових знаків та тексту на Java та дозволяє:
1. Ввести текст на англійській мові.
1. Вивести слова без повторень заданого тексту в алфавітному порядку за першою літерою.

## Вимоги

- Java 8 або новіша версія
- Термінал або командний рядок для запуску програми

## Запуск

1. **Склонуйте репозиторій**:  
   ```bash
   git clone https://github.com/1raulit/JavaLabs.git
   ```
   ```bash
   cd JavaLabs\Lab4\src\main\java\org\example
   ```

2. **Скомпілюйте програму**:  
   Використайте наступну команду для компіляції файлів лабораторної:
   ```bash
   javac Main.java Letter.java Sentence.java Text.java UniqueWordsProcessor.java Word.java
   ```

3. **Запустіть програму**:  
   Після компіляції програми, ви можете її запустити за допомогою такої команди:
   ```bash
   java Main
   ```

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