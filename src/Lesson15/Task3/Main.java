/*Задача 3:
Создать класс Student, содержащий следующие характеристики - имя, группа, курс, оценки по предметам.
Создать коллекцию, содержащую объекты класса Student.
Написать метод, который удаляет студентов со средним баллом <3. Если средний балл>=3, студент переводится на следующий курс.
Дополнительно написать метод printStudents(List<Student> students, int course), который получает список студентов и номер курса.
А также печатает на консоль имена тех студентов из списка, которые обучаются на данном курсе.*/

package Lesson15.Task3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Oleg", "4432", 3, Arrays.asList(5, 7, 8, 4));
        Student student2 = new Student("Aleksei", "4134", 4, Arrays.asList(2, 2, 2, 3));
        Student student3 = new Student("Artem", "2345", 3, Arrays.asList(3, 4, 5, 4));
        Student student4 = new Student("Nikolay", "2323", 3, Arrays.asList(7, 7, 8, 9));
        Student student5 = new Student("John", "2313", 1, Arrays.asList(2, 5, 6, 3));

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        for (Student student : students) {
            System.out.println(student);
        }

        Student.printStudents(students, 3);

        //Student.checkAverageGrade(students);
        Student.checkAverageGradeTest(students);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
