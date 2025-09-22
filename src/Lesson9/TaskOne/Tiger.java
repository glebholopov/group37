package Lesson9.TaskOne;

public class Tiger extends Animal {

    @Override
    public void voice() {
        System.out.println("Tiger says: arrr-arrr...");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Meat") || food.equals("meat")) {
            System.out.println("Я люблю есть мясо.");
        } else {
            System.out.println("Фууу...");
        }
    }
}
