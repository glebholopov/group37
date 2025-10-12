/**
 * Задача 3:
 * Используя Function реализовать лямбду, которая будет принимать в себя строку в
 * формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
 * возвращать сумму, переведенную сразу в доллары.
 */

package Lesson17.Task3;

import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму в формате “*сумма* BYN”: ");
        String moneyByn = scanner.nextLine();

        if (!moneyByn.matches("[0-9]+(\\.[0-9]+)? BYN")) {
            throw new IllegalArgumentException("Неправильный формат.");
        }

        Function<String, Double> transfer = s -> {
            s = s.split(" ")[0];
            return Double.parseDouble(s) * 0.333;
        };

        System.out.println(transfer.apply(moneyByn) + " USD");
        scanner.close();
    }
}
