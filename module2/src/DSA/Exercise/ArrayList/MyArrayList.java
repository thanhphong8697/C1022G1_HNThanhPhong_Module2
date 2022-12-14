package DSA.Exercise.ArrayList;

public class MyArrayList {
    /**
     * Số lượng phần tử có trong MyArrayLisst.
     */
    private int size = 0;
    /**
     * Sức chứa của MyArrayList.
     */
    private static final int DEFAULT_CAPACITY = 10;
    /**
     * Mảng chứa các phần tử.
     */
    Object element[];
    /**
     * Sức chứa mặc định khi khởi tạo contructor không chứa tham số.
     */
    public MyArrayList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity >= 0){
            element = new  Object[capacity];
        }else {
            throw IllegalArgumentException("capacity: " + capacity);
        }
    }
}
