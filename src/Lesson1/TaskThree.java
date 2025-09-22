package Lesson1;/*
* В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и
* выводящую на экран сумму цифр n. Например: n =126, в результате мы должны получить
* 9 (1+2+6).
*/

public class TaskThree {
    public static void main(String[] args) {
        int n, sum;

        n = 126;
        sum = (n / 100) + (n % 100 / 10) + (n % 100 % 10);

        System.out.println(sum);
    }
}
