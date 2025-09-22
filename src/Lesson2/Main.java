package Lesson2;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите номер таски: ");
        int numberOfTask = scanner.nextInt();

        switch (numberOfTask) {
            case 1 -> taskOne();
            case 2 -> taskTwo();
            case 3 -> taskThree();
            case 4 -> taskFour();
            case 5 -> taskStar();
            default -> System.out.println("Неверный номер.");
        }
    }

    public static void taskOne() {
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0)
            System.out.printf("Твоё число %d является чётным.", number);
        else
            System.out.printf("Твоё число %d является нечётным.", number);
    }

    public static void taskTwo() {
        System.out.print("Введите температуру на улице: ");
        int temperature = scanner.nextInt();

        if (temperature > -5)
            System.out.println("Warm.");
        else if (temperature <= -5 && temperature > -20) /* первое условие можно убрать, так как этот if проверится в том случае, если не сработает
                                                            предыдущий if. А предыдущий невыполнится при temperature <= -5. Следовательно условие всегда true
                                                            я оставил его, для большей читабельности*/
            System.out.println("Normal");
        else
            System.out.println("Cold");
    }

    public static void taskThree() {
        // 1 способ
        for (int i = 10; i <= 20; i++) {
            System.out.println(i + "^2 = " + (i * i));
        }

        System.out.println(); // отступ

        // 2 способ
        int number = 10;
        while (number <= 20) {
            System.out.println(number + "^2 = " + (number * number));
            number++;
        }

        System.out.println(); // отступ

        // 3 способ
        number = 10;
        do {
            System.out.println(number + "^2 = " + (number * number));
            number++;
        } while (number <= 20);
    }

    public static void taskFour() {
        /*System.out.print("Последовательность: ");
        for (int i = 1; i <= 14; i++) {
            System.out.print(7 * i + " ");
        }*/

        int i = 1;
        System.out.print("Последовательность: ");
        while (true) {
            int result = 7 * i;
            System.out.print(result + " ");

            if (result == 98)
                break;

            i++;
        }
    }

    public static void taskStar() {

        System.out.print("Введите число: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Некорректно введены данные.");
            return;
        }


        int number = scanner.nextInt();
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += i;
        }
        System.out.println(result);
    }

}
