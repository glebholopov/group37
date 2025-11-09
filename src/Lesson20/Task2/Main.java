package Lesson20.Task2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[50];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(array));

        InsertionSortRunnable insertionSortRunnable = new InsertionSortRunnable(array);
        SelectionSortRunnable selectionSortRunnable = new SelectionSortRunnable(array);
        BubbleSortRunnable bubbleSortRunnable = new BubbleSortRunnable(array);

        Thread insertionSort = new Thread(insertionSortRunnable);
        Thread selectionSort = new Thread(selectionSortRunnable);
        Thread bubbleSort = new Thread(bubbleSortRunnable);
        insertionSort.start();
        selectionSort.start();
        bubbleSort.start();

        insertionSort.join();
        selectionSort.join();
        bubbleSort.join();
        System.out.println("<Main closed>");
    }
}
