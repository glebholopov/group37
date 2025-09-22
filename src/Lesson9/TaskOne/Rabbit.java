package Lesson9.TaskOne;

public class Rabbit extends Animal {

    @Override
    public void voice() {
        System.out.println("Rabbit says: click-click...");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Grass") || food.equals("grass")) {
            System.out.println("Я люблю есть травку.");
        } else {
            System.out.println("Фууу...");
        }
    }
}
