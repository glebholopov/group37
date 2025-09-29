package Lesson15.Task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private List<Integer> grades;
    private double averageGrade = 0;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
        calculateAverageGrade(grades);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    // Напечатать студентов из списка, которые на курсе {course}
    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    // Подсчет среднего балла
    private void calculateAverageGrade(List<Integer> grades) {
        for (Integer grade : grades) {
            averageGrade += grade;
        }
        averageGrade = averageGrade / grades.size();
    }

    // 1 Способ
    public static void checkAverageGrade(List<Student> students) {
        //students.removeIf(student -> student.getAverageGrade() < 3);  // Способ для удаления через лямбда-выражение
        List<Student> toDelete = new ArrayList<>();
        for (Student student : students) {
            if (student.getAverageGrade() < 3) {
                toDelete.add(student);
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }
        students.removeAll(toDelete);
    }

    // 2 Способ
    public static void checkAverageGradeTest(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if(student.getAverageGrade() < 3) {
                iterator.remove();
            }  else {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grades=" + grades +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
