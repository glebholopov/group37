/**
 * Задача *:
 * Создать набор данных в формате id-name, сохраненный в Мар. Необходимо отобрать из
 * этого набора только те данные, id которых попадает в числовой диапазон 1/2/5/8/9/13.
 * Среди отобранных значений отобрать только те, которые имеют нечетное количество
 * букв в имени. После чего вернуть список List имен, записанных буквами задом наперед.
 */

package Lesson18.Task2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Artem");
        map.put(2, "Alexei");
        map.put(3, "Ilya");
        map.put(4, "Gleb");
        map.put(5, "Sergei");
        map.put(6, "Maria");
        map.put(7, "Angelina");
        map.put(8, "Pavel");
        map.put(9, "Nikita");
        map.put(10, "Maksim");
        map.put(11, "Daniil");
        map.put(12, "Polina");
        map.put(13, "Natalia");

        List<String> list = map.entrySet().stream()
                .filter(entry -> Set.of(1, 2, 5, 8, 9, 13).contains(entry.getKey()))
                .map(Map.Entry::getValue)
                .filter(s -> s.length() % 2 != 0)
                .map(s -> new StringBuilder(s).reverse().toString())
                .toList();

        System.out.println(list);
    }
}
