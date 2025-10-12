/**
 * Задача 4:
 * Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
 * формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
 * выводить сумму, переведенную сразу в доллары.
 */

package Lesson17.Task4;

import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму в формате “*сумма* BYN”: ");
        String moneyByn = scanner.nextLine();

        if(!moneyByn.matches("[0-9]+(\\.[0-9]+)? BYN")) {
            throw new IllegalAccessException("Неправильный формат.");
        }

        Consumer<String> consumer = s -> {
            s = s.split(" ")[0];
            System.out.println(Double.parseDouble(s) * 0.333 + " USD");
        };

        consumer.accept(moneyByn);
        scanner.close();
    }
}
