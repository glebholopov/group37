package Lesson8.TaskThree;

public class Person implements Cloneable {

    private String name;

    private Dog dog;

    public Person(String name, Dog dog) {
        this.name = name;
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    // глубокое клонирование
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        Dog dog = (Dog) this.getDog().clone();
        person.setDog(dog);
        return person;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dog=" + dog +
                '}';
    }
}
