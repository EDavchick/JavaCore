package lection02;

/* Написать метод, принимающий на вход массив чисел и параметр n.
   Метод должен осуществить циклический (последний элемент при сдвиге
   становится первым) сдвиг всех элементов массива на n позиций;
 */

import java.util.Arrays;

public class CyclicShift {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 7, 9, 4, 1, 8, 5};
        int n = 2;

        myShifter(arr, 2);
        // метод  учителя
        shifter(arr, 2);
        }

        public static void myShifter(int[] arr, int n) {
            int[] newArr = new int[arr.length];
            for (int i = 0; i < arr.length - n; i++) {
                newArr[i + n] = arr[i];
            }
            for (int i = 0; i < n; i++) {
                newArr[i] = arr[arr.length - n + i];
            }
            System.out.println(Arrays.toString(newArr));
        }

    private static void shifter(int[] a, int n) {
        n %= a.length;
        int shift = a.length + n;
        shift %= a.length;

        for (int i = 0; i < shift; i++) {
            int temp = a[a.length - 1];
            System.arraycopy(a, 0, a, 1, a.length - 1);
            a[0] = temp;
            }
        System.out.println(Arrays.toString(a));
        }
    }
