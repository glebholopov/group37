package Lesson20.Task1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter " + i + "-element: ");
            array[i] = scanner.nextInt();
        }

        System.out.print("All array elements: ");
        System.out.println(Arrays.toString(array));

        SearchMaxThread searchMaxThread = new SearchMaxThread(array);
        Thread threadMax = new Thread(searchMaxThread);

        SearchMinThread searchMinThread = new SearchMinThread(array);
        Thread threadMin = new Thread(searchMinThread);

        threadMax.start();
        threadMin.start();

        threadMax.join();
        threadMin.join();
        System.out.println("<Main closed>");
    }
}
