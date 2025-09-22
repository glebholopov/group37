package Lesson10.TaskTwo;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class User {

    private int id;

    private String  login;

    private String password;

    private Pet pet;

    private static int count = 0;

    private static final Map<Integer, User> userMap = new HashMap<>();

    public User(String login, String password, Pet pet) {
        this.login = login;
        this.password = password;
        this.pet = pet;
        id = ++count;
        userMap.put(id, this);
    }

    public User() {
        id = ++count;
    }

    public static void userClone(User user, int id) {
        user.setLogin(userMap.get(id).getLogin());
        user.setPassword(userMap.get(id).getPassword());
        user.setPet(userMap.get(id).getPet());
    }

    public static void deepUserClone(User user, int id) {
        user.setLogin(userMap.get(id).getLogin());
        user.setPassword(userMap.get(id).getPassword());
        Pet newPet = new Pet(userMap.get(id).getPet().getName());
        user.setPet(newPet);
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(login, user.login) && Objects.equals(password, user.password) && Objects.equals(pet, user.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, password, pet);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", pet=" + pet +
                '}';
    }
}
