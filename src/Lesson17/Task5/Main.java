/**
 * Задача 5:
 * Используя Supplier написать метод, который будет возвращать введенную с консоли
 * строку задом наперед
 */

package Lesson17.Task5;

import java.util.Scanner;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = scanner.nextLine();

        Supplier<String> supplier = () -> String.valueOf(new StringBuilder(str).reverse());

        System.out.println(supplier.get());

        scanner.close();
    }
}
