package org.example;

public class MatrixXor {
    public void execute(float[][] A, float[][] B) {
        // Перевірка, що матриці мають однакові розміри
        if (A.length != B.length || A[0].length != B[0].length) {
            throw new IllegalArgumentException("Матриці повинні мати однакові розміри.");
        }

        int rows = A.length;
        int cols = A[0].length;
        int[][] C = new int[rows][cols];

        // Виконання XOR операції для матриць A та B
        System.out.println("Результат XOR операції:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C[i][j] = Float.floatToIntBits(A[i][j]) ^ Float.floatToIntBits(B[i][j]);
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        // Обчислення суми найменших елементів у кожному рядку
        int sum = 0;
        System.out.println("\nНайменші елементи в кожному рядку:");
        for (int i = 0; i < rows; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < cols; j++) {
                if (C[i][j] < min) {
                    min = C[i][j];
                }
            }
            sum += min;
            System.out.println("Min в рядку " + (i + 1) + ": " + min);
        }

        System.out.println("\nСума найменших елементів кожного рядка: " + sum);
    }
}