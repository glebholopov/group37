package Lesson9.TaskOne;

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.eat("Grass");
        rabbit.eat("Meat");
        rabbit.voice();

        System.out.println("----------------");

        Dog dog = new Dog();
        dog.eat("Bone");
        dog.eat("Meat");
        dog.voice();

        System.out.println("----------------");

        Tiger tiger = new Tiger();
        tiger.eat("Meat");
        tiger.eat("Grass");
        tiger.voice();
    }
}
