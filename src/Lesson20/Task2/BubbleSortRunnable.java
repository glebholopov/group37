package Lesson20.Task2;

import java.util.Arrays;

public class BubbleSortRunnable implements Runnable {

    private final int[] array;

    public BubbleSortRunnable(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        System.out.println("Bubble sort: " + Arrays.toString(array));
    }
}
