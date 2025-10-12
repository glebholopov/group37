/**
 * Задача 1:
 * Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
 * когда пользователю исполнится 100 лет. Использовать Date/Time API
 */

package Lesson17.Task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите дату своего рождения в формате DD-MM-YYYY: ");
        String dateOfBirth = scanner.next();

        try {
            LocalDate localDate = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            System.out.println("Вам будет 100 в " + localDate.plusYears(100).format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
