package Lesson5;/*
* Задача 1:
* 1.1 Создать двумерный массив, заполнить его случайными числами.
* 1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
* 1.3 Найти сумму всех получившихся элементов и вывести в консоль
*/
import java.util.Random;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите кол-во строк: ");
        int row = scanner.nextInt();
        System.out.print("Введите кол-во столбцов: ");
        int col = scanner.nextInt();

        int[][] array = new int[row][col];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(1,10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Введите число, которое прибавить к каждому элементу: ");
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] += number;
                sum += array[i][j];
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.printf("Сумма новых элементов: %d", sum);
    }
}
