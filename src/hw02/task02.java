package hw02;

// Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.

public class task02 {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 8, 100, 15, 35};
        System.out.println(differenceBetweenMaxAndMin(arr));

    }
    public static int differenceBetweenMaxAndMin(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        int max = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max - min;
    }
}
