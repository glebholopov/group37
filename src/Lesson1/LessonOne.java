package Lesson1;

import java.util.Scanner;

public class LessonOne {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите номер таски: ");
        int numberOfTask = scanner.nextInt();

        switch (numberOfTask) {
            case 1 -> taskOne();
            case 2 -> taskTwo();
            case 3 -> taskThree();
            case 4 -> taskFour();
            case 5 -> taskFive();
            case 6 -> taskStar();
            default -> System.out.println("Неверный номер");
        }

    }

    /*
     * Написать приложение, которое будет вычислять и выводить значение по формуле:
     * a=4*(b+c-1)/2; b и c задаем в коде самостоятельно.
     */
    static void taskOne() {
        double a, b, c;

        b = 5;
        c = 12.5;
        a = 4 * (b + c - 1) / 2;

        System.out.println(a);
    }

    /*
     * В переменной n хранится двузначное число. Создайте программу, вычисляющую и
     * выводящую на экран сумму цифр n. Например: n = 26, в результате мы должны получить 8
     * (2+6).
     */
    static void taskTwo() {
        int n, sum;

        n = 26;
        sum = n / 10 + n % 10;

        System.out.println(sum);
    }

    /*
     * В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и
     * выводящую на экран сумму цифр n. Например: n =126, в результате мы должны получить
     * 9 (1+2+6).
     */
    static void taskThree() {
        int n, sum;

        n = 126;
        sum = (n / 100) + (n % 100 / 10) + (n % 100 % 10);

        System.out.println(sum);
    }

    /*
     * В переменной n хранится вещественное число с ненулевой дробной частью. Создайте
     * программу, округляющую число n до ближайшего целого и выводящую результат на
     * экран
     */
    static void taskFour() {
        double n = 12.4;
        int temp = (int) n;

        int result = n % temp >= 0.5 ? temp + 1 : temp;

        System.out.println(Math.round(n));
        System.out.println(result);
    }

    /*
     * В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую
     * на экран результат деления q на w с остатком. Пример вывода программы (для случая,
     * когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке.
     */
    static void taskFive() {
        int q = 21, w = 8;

        System.out.printf("%d / %d = %d в %d в остатке.", q, w, q / w, q % w);
    }

    /*
     * Написать программу которая будет менять местами значение целочисленных
     * переменных. Пример:
     * int a = 1; int b = 2;
     * //код (ваше решение)
     * sout(a); //выведет 2
     * sout(b); //выведет 1
     * Усовершенствовать программу, использовать только 2 входные переменные (a,b);
     */
    static void taskStar() {
        System.out.print("Введите а: ");
        int a = scanner.nextInt();
        System.out.print("Введите b: ");
        int b = scanner.nextInt();
        //int a = 1, b = 2;

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + " " + b);
    }
}
