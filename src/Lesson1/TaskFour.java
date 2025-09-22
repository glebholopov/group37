package Lesson1;/*
* В переменной n хранится вещественное число с ненулевой дробной частью. Создайте
* программу, округляющую число n до ближайшего целого и выводящую результат на
* экран
*/

public class TaskFour {
    public static void main(String[] args) {
        double n = 12.4;
        int temp = (int)n;

        int result = n % temp >= 0.5 ? temp + 1 : temp;

        System.out.println(Math.round(n));
        System.out.println(result);
    }
}
