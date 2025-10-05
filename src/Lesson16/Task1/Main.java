/*Задача 1:
На вход поступает массив строк, верните Map<String, Boolean>, где каждая отдельная строка является ключом,
и ее значение равно true, если эта строка встречается в массиве 2 или более раз.
Пример:
wordMultiple(["а", "b", "а", "c", "b"]) -> {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) -> {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) -> {"c": true}*/

package Lesson16.Task1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[]{"а", "b", "а", "c", "b"};
        String[] array2 = new String[]{"c", "b", "a"};
        String[] array3 = new String[]{"c", "c", "c", "c"};
        System.out.println(elementOccursInArray(array));
    }

    public static Map<String, Boolean> elementOccursInArray(String[] array) {
        Map<String, Boolean> map = new HashMap<>();
        for (String s : array) {
            if (map.containsKey(s)) {
                map.put(s, true);
            } else {
                map.put(s, false);
            }
        }

        return map;
    }
}
