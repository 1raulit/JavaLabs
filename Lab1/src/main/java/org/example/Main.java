package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введіть кількість рядків: ");
            int rows = scanner.nextInt();  // кількість рядків
            System.out.println("Введіть кількість стовпців: ");
            int cols = scanner.nextInt();  // кількість стовпців

            float[][] A = new float[rows][cols];
            float[][] B = new float[rows][cols];

            // Введення матриці A
            System.out.println("Введіть елементи для матриці A:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("A[" + i + "][" + j + "] = ");
                    A[i][j] = scanner.nextFloat();
                }
            }

            // Введення матриці B
            System.out.println("Введіть елементи для матриці B:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("B[" + i + "][" + j + "] = ");
                    B[i][j] = scanner.nextFloat();
                }
            }

            // Виклик класу MatrixXor та виконання операцій
            MatrixXor matrixXor = new MatrixXor();
            matrixXor.execute(A, B);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}