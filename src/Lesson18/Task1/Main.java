/**
 * Задача 1:
 * Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью Stream'ов:
 * - Удалить дубликаты
 * - Оставить только четные элементы
 * - Вывести сумму оставшихся элементов в стриме
 */

package Lesson18.Task1;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(313);
        list.add(314);
        list.add(315);
        list.add(21);
        list.add(20);
        list.add(21);
        list.add(313);
        list.add(18);
        list.add(16);
        list.add(18);
        list.add(2);
        list.add(4);
        list.add(6);

        list = (ArrayList<Integer>) list.stream().filter(el -> el % 2 == 0).distinct().collect(Collectors.toList());

        AtomicInteger sum = new AtomicInteger();
        list.forEach(sum::addAndGet);

        System.out.println(list);
        System.out.println(sum);
    }
}
