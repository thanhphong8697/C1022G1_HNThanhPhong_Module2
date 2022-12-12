package AbtractClassAndInterface.Exercise.ColorableInterface;


public class Shape implements Colorable {
    private String color = "green";
//    private boolean filled = true;


    public Shape(String color, boolean filled) {
        this.color = color;
//        this.filled = filled;
    }

    public Shape(double radius) {
    }

    public Shape(double width, double length) {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//    public boolean isFilled() {
//        return filled;
//    }
//
//    public void setFilled(boolean filled) {
//        this.filled = filled;
//    }


    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public void howToColor() {

    }
}
