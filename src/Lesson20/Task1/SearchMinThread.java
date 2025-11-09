package Lesson20.Task1;

import java.util.Arrays;
import java.util.OptionalInt;

public class SearchMinThread implements Runnable {

    private final int[] array;

    public SearchMinThread(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        OptionalInt minElement = Arrays.stream(array).min();
        System.out.println("Minimum array element = " + minElement.orElseThrow(RuntimeException::new));

        System.out.println("<SearchMinThread closed>");
    }
}
