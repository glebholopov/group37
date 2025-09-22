package Lesson5;/*
* Задача 2:
* Создать программу для раскраски шахматной доски с помощью цикла. Создать
* двумерный массив String 8х8. С помощью циклов задать элементам массива значения
* B(Black) или W(White). При выводе результат работы программы должен быть
* следующим:
* W B W B W B W B
* B W B W B W B W
* W B W B W B W B
* B W B W B W B W
* W B W B W B W B
* B W B W B W B W
* W B W B W B W B
* B W B W B W B W
*/

public class TaskTwo {
    public static void main(String[] args) {
        String[][] array = new String[8][8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    array[i][j] = "W";
                } else {
                    array[i][j] = "B";
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
