/**
 * Задача 2:
 * Используя Predicate среди массива чисел вывести только те, которые являются
 * положительными
 */

package Lesson17.Task2;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{-2, 3, 4, 5, 746, 234, 547, -123, -2, 0, -21};

        Predicate<Integer> predicate = num -> num >= 0;

        for(int number : numbers) {
            if(predicate.test(number)) {
                System.out.println(number);
            }
        }
    }
}
