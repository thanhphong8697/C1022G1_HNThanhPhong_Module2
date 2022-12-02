import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số USD bạn muốn chuyển đổi: ");
        double number = Double.parseDouble(scanner.nextLine());
        double change = rate * number;
        System.out.println("Với " + number + "USD bạn đổi được " + change + "VNĐ");
    }
}
