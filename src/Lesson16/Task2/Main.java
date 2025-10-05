/*Задача 2:
На вход поступает массив непустых строк, создайте и верните Мар<String, string> следующим образом:
для каждой строки добавьте ее первый символ в качестве ключа с последним символом в качестве значения.
Пример:
pairs(["code", "bug"]) → {"b": "g", "c": "е"}
pairs(["man", "moon", "main"]) → {"m": "n"}
pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}*/

package Lesson16.Task2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[]{"code", "bug"};
        String[] array2 = new String[]{"man", "moon", "main"};
        String[] array3 = new String[]{"man", "moon", "good", "night"};

        System.out.println(pairs(array));

    }

    public static Map<String, String> pairs(String[] array) {
        Map<String, String> map = new HashMap<>();

        for (String s : array) {
            map.put(s.charAt(0) + "", s.charAt(s.length() - 1) + "");
        }

        return map;
    }
}
