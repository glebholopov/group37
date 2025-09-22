package Lesson10.TaskOne;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Arseni", "12345678");
        User user2 = new User("Arseni", "12345678");
        User user3 = user1;

        System.out.println("user1 == user2? Answer: " + (user1 == user2));
        System.out.println("user1.equals(user2)? Answer: " + user1.equals(user2));
        System.out.println("-------------");
        System.out.println("user1 == user3? Answer: " + (user1 == user3));
        System.out.println("user1.equals(user3)? Answer: " + user1.equals(user3));
        System.out.println("-------------");
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    }
}
