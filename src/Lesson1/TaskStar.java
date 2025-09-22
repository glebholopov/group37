package Lesson1;/*
 * Написать программу которая будет менять местами значение целочисленных
 * переменных. Пример:
 * int a = 1; int b = 2;
 * //код (ваше решение)
 * sout(a); //выведет 2
 * sout(b); //выведет 1
 * Усовершенствовать программу, использовать только 2 входные переменные (a,b);
 */

public class TaskStar {
    public static void main(String[] args) {
        int a = 1, b = 2;

        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}
