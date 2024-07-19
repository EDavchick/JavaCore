package hw02;

/* Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0*/

public class task01 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5}; // 6, 6, 6, 1, 5
        System.out.println(countEvens(arr));
    }

    public static int countEvens(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count += 1;
            }
        }
        return count;
    }
}
