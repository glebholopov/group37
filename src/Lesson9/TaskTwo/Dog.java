package Lesson9.TaskTwo;

public class Dog {

    private static Dog dog;

    private Dog() {
    }

    public static Dog dog() {
        if(dog == null) {
            return new Dog();
        }
        return dog;
    }

    public static void eat() {
        System.out.println("Dog is eating...");
    }

    public void voice() {
        System.out.println("Woof-woof");
    }
}
