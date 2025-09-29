/*Задача 1:
Пользователь вводит набор чисел в виде одной строки с клавиатуры.
Например: "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран. При решении использовать коллекции.*/

package Lesson15.Task1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers (Example: 1, 2, 3, 4, 4, 5): ");
        String[] numbers = scanner.nextLine().split(", |,| ");

        Set<Integer> differenceNumbers = new HashSet<>();
        for (String number : numbers) {
            differenceNumbers.add(Integer.parseInt(number));
        }

        System.out.println(differenceNumbers);

        scanner.close();
    }
}
