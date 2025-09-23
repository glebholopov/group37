package Lesson13.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        // После вызова System.exit(0) программа принудительно закрывается со статусом '0'. И весь последующий код не будет выполнен
        try {
            System.out.println(10 / number);
            System.exit(0);
        } catch (ArithmeticException e) {
            System.out.println("Нельзя делить на 0.");
            System.exit(0);
        } finally {
            System.out.println("Блок finally");
        }


        scanner.close();
    }
}
