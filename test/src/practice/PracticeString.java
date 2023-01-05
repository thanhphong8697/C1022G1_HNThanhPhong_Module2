package practice;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi");
        String string = "a a b bb bb cc cc";
        String arr[] = string.split(" ");
        System.out.println(Arrays.toString(arr));
        int max = 0;
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() == arr[i-1].length() ) {
                count++;
//                System.out.println(count);
            }else {
                count = 1;
            }
            if (max < count) {
                max = count;
            }
        }
        System.out.println(max);
    }
}
