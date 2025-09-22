package Lesson11.Task3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textOne = scanner.nextLine();
        String textTwo = scanner.nextLine();
        String textThree = scanner.nextLine();

        List<String> list = Arrays.asList(textOne, textTwo, textThree);

        double averageLength = 0;
        for (String s : list) {
            averageLength += s.length();
        }
        averageLength /= list.size();

        System.out.println("--------------------");

        System.out.printf("Средняя длина: %.2f.\n", averageLength);
        System.out.println("Строки меньше средней длинны: ");
        for (String s : list) {
            if (s.length() < averageLength) {
                System.out.println("String: " + s + ". Length: " + s.length());
            }
        }

        scanner.close();
    }
}
