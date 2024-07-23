package lection02;

import java.util.Arrays;

/* Написать метод, которому можно передать в качестве аргумента массив,
состоящий строго из единиц и нулей (целые числа типа int). Метод должен заменить
единицы в массиве на нули, а нули на единицы и не содержать ветвлений.*/

public class ReplaceZeroOne {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 0, 1, 1, 0, 0};

        replace(arr);
        // метод  учителя
        change(arr);
    }

    public static void replace(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                arr[i] = 1;
            else arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void change(int[] a) {
        for (int i = 0; i < a.length; i++) {
//            a[i] = 1 - a[i];
//            a[i] = (a[i] - 1) * -1;
            a[i] = (a[i] + 1) % 2;
            }
        System.out.println(Arrays.toString(a));
    }
}
