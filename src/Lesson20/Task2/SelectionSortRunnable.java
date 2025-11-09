package Lesson20.Task2;

import java.util.Arrays;

public class SelectionSortRunnable implements Runnable {

    private final int[] array;

    public SelectionSortRunnable(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        System.out.println("Selection sort: " + Arrays.toString(array));
    }
}
