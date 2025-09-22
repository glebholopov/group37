package Lesson11.Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());

        for (int i = 0; i < input.length(); i += 2) {
            input.insert(i + 1, input.charAt(i));
        }

        System.out.println(input);
        scanner.close();
    }
}
