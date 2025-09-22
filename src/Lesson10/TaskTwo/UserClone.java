package Lesson10.TaskTwo;

import java.util.Scanner;

public class UserClone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pet pet1 = new Pet("Albert");
        Pet pet2 = new Pet("Moks");
        User user1 = new User("Golub", "12345678", pet1);
        User user2 = new User("Golub", "12345678", pet2);
        User user3 = new User();

        System.out.print("глубокое или поверхностное клонирование(1/2)");
        int operation = scanner.nextInt();
        System.out.print("Введите id: ");
        int id = scanner.nextInt();


        switch (operation) {
            case 1 -> User.deepUserClone(user3, id);
            case 2 -> User.userClone(user3, id);
        }

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println("---------------");
        System.out.println("user1 == user3? " + (user1 == user3));
        System.out.println("user2 == user3? " + (user2 == user3));
        System.out.println("---------------");
        System.out.println("user1.pet == user3.pet? " + (user1.getPet() == user3.getPet()));
        System.out.println("user2.pet == user3.pet? " + (user2.getPet() == user3.getPet()));


        scanner.close();
    }
}
