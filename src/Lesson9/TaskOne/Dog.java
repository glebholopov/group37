package Lesson9.TaskOne;

public class Dog extends Animal {

    @Override
    public void voice() {
        System.out.println("Dog say: woof-woof...");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Meat") || food.equals("meat")) {
            System.out.println("Я люблю есть мясо.");
        } else if (food.equals("Bone") || food.equals("bone")) {
            System.out.println("Я люблю грызть косточку.");
        } else {
            System.out.println("Фууу...");
        }
    }
}
