package Sort;

import java.util.Scanner;

public class InsertionSort {
    public void sort(int[] array){
        for (int i = 1; i < array.length; i++){
            int currentElement = array[i];
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng");
        int length = Integer.parseInt(scanner.nextLine());
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++){
            System.out.println("Nhập phần tử vào mảng");
            array[i] = Integer.parseInt(scanner.nextLine());
        }
    }
}
