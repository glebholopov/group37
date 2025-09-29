package Lesson14.Task2;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите путь до файла(.txt): ");
        String filepath = scanner.nextLine();
        File file = new File(filepath);
        String regex = "^(docnum[A-Za-z0-9]{9}|contract[A-Za-z0-9]{7})$";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
             FileWriter valid = new FileWriter("src\\Lesson14\\Task2\\Valid.txt");
             FileWriter nonValid = new FileWriter("src\\Lesson14\\Task2\\nonValid.txt")) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.matches(regex)) {
                    valid.write(line + "\n");
                } else {
                    if (line.length() < 15) {
                        nonValid.write(line + " (меньше 15 символов)\n");
                    } else if (line.length() > 15) {
                        nonValid.write(line + " (больше 15 символов)\n");
                    } else if (!line.startsWith("docnum") && !line.startsWith("contract")) {
                        nonValid.write(line + " (начинается не с docnum/contract)\n");
                    } else if (line.contains(" ")) {
                        nonValid.write(line + " (строка содержит пробел)\n");
                    } else if (Pattern.compile("[^A-Za-z0-9]").matcher(line).find()) {
                        nonValid.write(line + " (запрещенные символы)\n");
                    } else {
                        nonValid.write(line + "\n");
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        scanner.close();
    }
}
