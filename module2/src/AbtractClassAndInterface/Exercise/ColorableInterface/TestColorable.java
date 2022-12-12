package AbtractClassAndInterface.Exercise.ColorableInterface;
import java.util.Scanner;

public class TestColorable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape[] shapes = new Shape[3];
        System.out.println("Nhập bán kính của hình tròn");
        double radius = Integer.parseInt(scanner.nextLine());
        shapes[0] = new Shape(radius);
        System.out.println("Nhập chiều rộng của hình chữ nhật");
        double width = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chiều dài của hình chữ nhật");
        double length = Integer.parseInt(scanner.nextLine());
        shapes[1] = new Shape(width, length);
        System.out.println("Nhập độ dài cạnh của hình vông");
        double side = Integer.parseInt(scanner.nextLine());
        shapes[2] = new Shape(side);
        System.out.println(shapes[0].toString());
//        shapes[1].toString();
//        shapes[2].howToColor();
    }
}
