package Lesson11.Task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int size = scanner.nextInt();
        boolean isPalindrome = false;

        input = input.replaceAll(" +", " ");
        String[] split = input.split(" ");

        if (size > split.length) {
            System.out.println("В строке нет столько слов!");
            return;
        }

        size = size - 1;
        StringBuilder sb = new StringBuilder(split[size])
                .reverse();

        if(split[size].contentEquals(sb)) {
            isPalindrome = true;
        }

        if(isPalindrome) {
            System.out.println("Слово " + sb + " является полиндромом.");
        } else {
            System.out.println("Слово " + sb + " не является полиндромом.");

        }

        scanner.close();
    }
}
