package Lesson4;/*
* Для всех задач исходные условия следующие: пользователь с клавиатуры вводит размер
массива (просто целое число). После того, как размер массива задан, заполнить его
одним из двух способов: используя Math.random(), или каждый элемент массива вводится
пользователем вручную. Попробовать оба варианта. После заполнения массива
данными, решить для него следующие задачи:*/

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Введите номер таски: ");
        int numberOfTask = checked();

        System.out.print("Введите размер массива(простое целое число): ");
        int sizeArray = checked();
        double[] array = new double[sizeArray];

        System.out.print("Введите способ заполнения массива(1.Автоматически/2.Вручную): ");
        int fillingMethod = checked();

        if (fillingMethod == 1) {
            for (int i = 0; i < sizeArray; i++) {
                array[i] = Math.random();
            }

        } else if (fillingMethod == 2) {
            for (int i = 0; i < sizeArray; i++) {
                System.out.printf("Введите %d элемент: ", i);
                array[i] = scanner.nextDouble();
            }

        } else {
            System.out.println("Некорректно введены данные.");
            return;
        }


        switch (numberOfTask) {
            case 1 -> taskOne(array);
            case 2 -> taskTwo(array);
            case 3 -> taskThree(array);
            case 4 -> taskFour(array);
            case 5 -> taskFive(array);
            case 6 -> taskSix(array);
            case 7 -> taskStar(array);
            default -> System.out.println("Неверный номер.");
        }

        scanner.close();
    }

    // Пройти по массиву, вывести все элементы в прямом и в обратном порядке
    public static void taskOne(double[] array) {
        // В прямом порядке
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        // В прямом порядке
        for (double element : array) {
            System.out.print(element + " ");
        }

        System.out.println();

        // В обратном порядке
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    // Найти минимальный-максимальный элементы и вывести в консоль.
    public static void taskTwo(double[] array) {
        /*
        Тут я использовал константы для начальных значений
        Можно и другим способом сделать, но мне лень :)
        2 способ заключается в том, что изначально elementOfMax и elementOfMin мы присваиваем array[0]
        и дальше сравниваем точно также (2 способ в 3 задаче)
         */
        double elementOfMax = Double.MIN_VALUE;
        double elementOfMin = Double.MAX_VALUE;

        getArray(array);
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] > elementOfMax) {
                elementOfMax = array[i];
            }

            if (array[i] < elementOfMin) {
                elementOfMin = array[i];
            }
        }

        System.out.println("Максимальный элемент: " + elementOfMax);
        System.out.println("Минимальный элемент: " + elementOfMin);

    }

    // Найти индексы минимального и максимального элементов и вывести в консоль.
    public static void taskThree(double[] array) {
        double elementOfMax = array[0];
        double elementOfMin = array[0];
        int indexOfMax = 0;
        int indexOfMin = 0;

        getArray(array);
        System.out.println();

        for (int i = 1; i < array.length; i++) {
            if (array[i] > elementOfMax) {
                elementOfMax = array[i];
                indexOfMax = i;
            }

            if (array[i] < elementOfMin) {
                elementOfMin = array[i];
                indexOfMin = i;
            }
        }

        System.out.println("Максимальный элемент: " + elementOfMax);
        System.out.println("Индекс максимального элемента: " + indexOfMax);
        System.out.println("Минимальный элемент: " + elementOfMin);
        System.out.println("Индекс минимального элемента: " + indexOfMin);
    }

    // Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести сообщение, что их нет.
    public static void taskFour(double[] array) {
        int countOfZero = 0;

        getArray(array);
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                countOfZero++;
            }
        }

        if (countOfZero != 0) {
            System.out.printf("В масиве %d нулей.", countOfZero);
        } else {
            System.out.println("Нули в массиве отсутствуют.");
        }
    }

    // Пройти по массиву и поменять местами элементы первый и последний, второй и предпоследний и т.д.
    public static void taskFive(double[] array) {
        System.out.println("Изначальный массив:");
        getArray(array);
        System.out.println();

        double temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println("Измененный массив: ");
        getArray(array);

    }

    // Проверить, является ли массив возрастающей последовательностью (каждое следующее число больше предыдущего).
    public static void taskSix(double[] array) {
        boolean isAscendingSequence = true;

        getArray(array);
        System.out.println();

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isAscendingSequence = false;
                break;
            }
        }

        if (isAscendingSequence) {
            System.out.println("Данный массив является возрастающей последовательностью.");
        } else {
            System.out.println("Данный массив не является возрастающей последовательностью.");
        }

    }

    /*
    Задача *:
    Имеется массив из неотрицательных чисел(любой). Представьте что массив
    представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
    добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
    содержит нуля в начале, кроме самого числа 0.
    Пример:
    Input: [1,4,0,5,6,3]
    Output: [1,4,0,5,6,4]
    Input: [9,9,9]
    Output: [1,0,0,0]
     */
    public static void taskStar(double[] array) {
        int number = 0;
        int[] newArray;

        for (int i = 0; i < array.length; i++) {
            number += array[i] * Math.pow(10, array.length - 1 - i);
        }

        System.out.println(Arrays.toString(array));
        number++;

        if (number / Math.pow(10, array.length - 1) >= 10) {
            newArray = new int[array.length + 1];

        } else {
            newArray = new int[array.length];
        }

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = (int) (number / Math.pow(10, newArray.length - 1 - i) % 10);
        }

        //getArray(array);
        System.out.println(Arrays.toString(newArray));
    }

    // Метод вывода всех элементов массива
    public static void getArray(double[] array) {
        for (double element : array) {
            System.out.print(element + " ");
        }
    }

    public static int checked() {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("!!!ERROR!!!");
            scanner.close();
            System.exit(1);
        }
        return 0;
    }

}