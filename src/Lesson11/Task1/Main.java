package Lesson11.Task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textOne = scanner.nextLine();
        String textTwo = scanner.nextLine();
        String textThree = scanner.nextLine();

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(textOne);
        arrayList.add(textTwo);
        arrayList.add(textThree);

        int maxLength = arrayList.get(0).length();
        String maxLengthText = arrayList.get(0);
        int minLength = arrayList.get(0).length();
        String  minLengthText = arrayList.get(0);

        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() > maxLength) {
                maxLength = arrayList.get(i).length();
                maxLengthText = arrayList.get(i);
            }
            if (arrayList.get(i).length() < minLength) {
                minLength = arrayList.get(i).length();
                minLengthText = arrayList.get(i);
            }
        }

        System.out.println("Max string: " + maxLengthText + " (" + maxLength + " symbols)");
        System.out.println("Min string: " + minLengthText + " (" + minLength + " symbols)");

        scanner.close();
    }
}
