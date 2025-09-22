package Lesson1;/*
* В переменной n хранится двузначное число. Создайте программу, вычисляющую и
* выводящую на экран сумму цифр n. Например: n = 26, в результате мы должны получить 8
* (2+6).
*/

public class TaskTwo {
    public static void main(String[] args) {
        int n, sum;

        n = 26;
        sum = n / 10 + n % 10;

        System.out.println(sum);
    }
}
