package Lesson13.Task1;

public class WrongLoginException extends Exception {

    public WrongLoginException(String message) {
        super(message);
    }

    public WrongLoginException() {
        super("Логин должен быть меньше 20 символов и не должен содержать пробелы.");
    }
}
