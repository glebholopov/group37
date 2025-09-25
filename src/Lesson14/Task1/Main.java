package Lesson14.Task1;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("\\romeo-and-juliet.txt");
        StringBuilder text = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                text.append(line).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String[] arrayText = text.toString()
                .replaceAll("[^A-Za-z]", " ")
                .replaceAll("\\s+", " ")
                .split(" ");

        int maxLength = 0;
        String maxString = "";
        for (String s : arrayText) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                maxString = s;
            }
        }

        try (FileWriter fileWriter = new FileWriter("src\\Lesson14\\Task1\\BigWord.txt")) {
            fileWriter.write(maxString);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(maxString);

    }
}
