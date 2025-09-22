package Lesson11.Task2;

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

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).length() < list.get(j).length()) {
                    String temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        System.out.println("----------------");

        for(String s : list) {
            System.out.println(s);
        }

        scanner.close();
    }
}
