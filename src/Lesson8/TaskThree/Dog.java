package Lesson8.TaskThree;

public class Dog implements Cloneable {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void voice() {
        System.out.println("Gav gav...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // поверхностное клонирование
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
