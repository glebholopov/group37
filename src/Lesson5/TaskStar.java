package Lesson5;/*
 * Задача *:
 * Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
 * Формат входных данных:
 * Программа получает на вход два числа n и m.
 * Формат выходных данных:
 * Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3
 * символа
 */

import java.util.Scanner;

public class TaskStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите кол-во строк: ");
        int row = scanner.nextInt();
        System.out.print("Введите кол-во столбцов: ");
        int col = scanner.nextInt();

        int[][] array = new int[row][col];

        for (int i = 0, temp = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array[i].length; j++, temp++) {
                    array[i][j] += temp;
                }
            } else {
                for (int j = array[i].length - 1; j >= 0; j--, temp++) {
                    array[i][j] += temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] / 10 < 1) {
                    System.out.print("  " + array[i][j] + " ");
                } else if (array[i][j] / 100 < 1) {
                    System.out.print(" " + array[i][j] + " ");
                } else {
                    System.out.print(array[i][j] + " ");
                }

            }
            System.out.println();
        }
    }
}
