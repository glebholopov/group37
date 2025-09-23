package Lesson13.Task1;

public class User {

    public static boolean authorize(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        checkLogin(login);
        checkPassword(password);

        if(!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }

        return true;
    }

    private  static void checkLogin(String login) throws WrongLoginException {
        String regexLogin = "[A-Za-z0-9]{1,19}";
        if(login == null) {
            throw new WrongLoginException("Логин не может быть null");
        }
        if (!login.matches(regexLogin)) {
            throw new WrongLoginException();
        }
    }

    private  static void checkPassword(String password) throws WrongPasswordException {
        String regexPassword = "([A-Za-z0-9]*[0-9][A-Za-z0-9]*){1,19}";
        if(password == null) {
            throw new WrongPasswordException("Пароль не может быть null");
        }
        if(!password.matches(regexPassword)) {
            throw new WrongPasswordException();
        }
    }
}
