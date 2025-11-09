package Lesson20.Task2;

import java.util.Arrays;

public class InsertionSortRunnable implements Runnable {

    private final int[] array;

    public InsertionSortRunnable(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }

        System.out.println("Insertion sort: " + Arrays.toString(array));
    }
}
