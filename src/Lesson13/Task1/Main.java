package Lesson13.Task1;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        System.out.println(User.authorize("Login", "Pa55word", "Pa55word"));
    }
}
