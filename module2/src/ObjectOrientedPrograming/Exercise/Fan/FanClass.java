package ObjectOrientedPrograming.Exercise.Fan;

public class FanClass {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (this.on) {
            return "Speed : " + speed + ", Color : " + color + ", Radius : " + radius + ". Fan is on.";
        } else {
            return "Color : " + color + ", Radius : " + radius + ". Fan is off.";
        }
    }
}
