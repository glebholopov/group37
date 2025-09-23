package Lesson13.Task1;

public class WrongPasswordException extends Exception {

    public WrongPasswordException(String message) {
        super(message);
    }

    public WrongPasswordException() {
        super("Пароль должен быть меньше 20 символов и не должен содержать пробелы, и должен содержать как минимум одну цифру.");
    }
}
