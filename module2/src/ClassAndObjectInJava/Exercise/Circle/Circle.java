package ClassAndObjectInJava.Exercise.Circle;

public class Circle {
    private double radius = 1;
    private String color = "Red";

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public double area = Math.pow(radius, 2) * Math.PI;

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", area=" + area +
                '}';
    }
}
