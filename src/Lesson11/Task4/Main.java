package Lesson11.Task4;

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

        boolean isDifferance = true;
        for (String s : list) {
            isDifferance = true;
            for (int i = 0; i < s.length() - 1; i++) {
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j) || s.charAt(i) == (s.charAt(j) + 32) || s.charAt(i) == (s.charAt(j) - 32)) {
                        isDifferance = false;
                        break;
                    }
                }

                if (!isDifferance) {
                    break;
                }
            }

            if (isDifferance) {
                System.out.println(s);
                break;
            }
        }

        if(!isDifferance) {
            System.out.println("Таких слов нет.");
        }


        scanner.close();
    }
}
