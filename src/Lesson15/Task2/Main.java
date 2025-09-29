/*Задача 2:
Создать класс, который будет хранить в себе коллекцию с названиями животных.
Реализовать методы удаления и добавления животных по следующим правилам: добавляется всегда в начало коллекции, а удаляется всегда из конца.
Показать работу объекта этого класса в main методе другого класса.*/

package Lesson15.Task2;

public class Main {
    public static void main(String[] args) {
        Animals animals = new Animals();
        animals.addAnimal("Dog");
        animals.addAnimal("Cat");
        System.out.println(animals);
        animals.addAnimal("Jaguar");
        animals.addAnimal("Pig");
        System.out.println(animals);
        animals.deleteAnimal();
        System.out.println(animals);

        System.out.println(animals.printIndex("Pig"));

    }
}
