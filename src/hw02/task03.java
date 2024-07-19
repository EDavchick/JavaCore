package hw02;

// Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.

public class task03 {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 0, 0, 15, 35};
        System.out.println(twoZero(arr));
    }

    public static boolean twoZero(int[] arr) {
        boolean flag = true;
        int zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (zero == arr[i] && zero == arr[i + 1])
                return flag;
        }
        return false;
    }

}
