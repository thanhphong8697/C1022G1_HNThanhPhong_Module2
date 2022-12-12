package AbtractClassAndInterface.Exercise.ColorableInterface;

import AbtractClassAndInterface.Exercise.ResizeableInterface.Resizeable;
import AbtractClassAndInterface.Exercise.ResizeableInterface.Shape;

public class Square extends Shape implements Colorable {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return (this.side * this.side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Diện tích hình vuông là: " + this.getArea());
        System.out.println("Color all four sides");
    }
}
