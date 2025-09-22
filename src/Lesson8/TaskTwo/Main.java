package Lesson8.TaskTwo;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(50, 60, 10.4);
        figures[1] = new Triangle(10, 30.4, 30.5);
        figures[2] = new Rectangle(3.4,2);
        figures[3] = new Circle(2);
        figures[4] = new Circle(3);

        double sumOfPerimeters = 0;
        double sumOfSquares = 0;
        for (Figure figure : figures) {
            sumOfPerimeters += figure.perimeter();
            sumOfSquares += figure.square();
        }

        System.out.println(sumOfPerimeters);
        System.out.println(sumOfSquares);
    }
}
