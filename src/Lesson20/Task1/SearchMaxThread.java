package Lesson20.Task1;

import java.util.Arrays;
import java.util.OptionalInt;

public class SearchMaxThread implements Runnable {

    private final int[] array;

    public SearchMaxThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        OptionalInt maxElement = Arrays.stream(array).max();
        System.out.println("Maximum array element = " + maxElement.orElseThrow(RuntimeException::new));

        System.out.println("<SearchMaxThread closed>");
    }
}
