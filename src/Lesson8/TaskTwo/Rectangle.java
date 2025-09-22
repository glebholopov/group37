package Lesson8.TaskTwo;

public class Rectangle extends Figure {

    private double length;

    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double square() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return (length + width) * 2;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
