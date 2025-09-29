package Lesson15.Task2;

import java.util.LinkedList;
import java.util.List;

public class Animals {
    private List<String> animals = new LinkedList<>();

    public Animals() {
    }

    public Animals(List<String> animals) {
        this.animals = animals;
    }

    public List<String> getAnimals() {
        return animals;
    }

    public void setAnimals(LinkedList<String> animals) {
        this.animals = animals;
    }

    public void deleteAnimal() {
        animals.removeLast();
    }

    public void addAnimal(String animal) {
        animals.addFirst(animal);
    }

    public int printIndex(String animal) {
        return  animals.indexOf(animal);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "animals=" + animals +
                '}';
    }
}
