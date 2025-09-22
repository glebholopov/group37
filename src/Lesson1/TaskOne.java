package Lesson1;/*
* Написать приложение, которое будет вычислять и выводить значение по формуле:
* a=4*(b+c-1)/2; b и c задаем в коде самостоятельно.
*/

public class TaskOne {
    public static void main(String[] args) {
        double a,b,c;

        b = 5;
        c = 12.5;
        a = 4 * (b + c - 1) / 2;

        System.out.println(a);
    }
}
