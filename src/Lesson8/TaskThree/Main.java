package Lesson8.TaskThree;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Dog dog = new Dog("Mike");
        Person person1 = new Person("Albert", dog);

        Person person2 = (Person) person1.clone();

        System.out.println(person1);
        System.out.println(person2);
    }
}
