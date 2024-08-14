package hw05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/* Предположить, что числа в исходном массиве из 9 элементов имеют диапазон [0,
3], и представляют собой, например, состояния ячеек поля для игры в крестики-нолики,
 где 0 – это пустое поле, 1 – это поле с крестиком, 2 – это поле с ноликом, 3
– резервное значение. Такое предположение позволит хранить в одном числе типа
int всё поле 3х3. Записать в файл 9 значений так, чтобы они заняли три байта.*/

public class Task02 {
    public static void main(String[] args) throws IOException {
        // Массив значений [0, 3], представляющих состояния ячеек
        int[] arr = {0, 1, 2, 3, 0, 1, 2, 3, 0};

        // Переменная для хранения упакованного значения
        int packed = 0;

        // Упаковываем значения в одну переменную
        for (int i = 0; i < arr.length; i++) {
            packed |= (arr[i] << (2 * (8 - i))); // Сдвигаем и добавляем к packed
        }

        // Записываем результат в файл как три байта
        try (FileOutputStream fos = new FileOutputStream("src/hw05/output.txt")) {
            fos.write((packed >> 16) & 0xFF); // Записываем старший байт
            fos.write((packed >> 8) & 0xFF);  // Записываем средний байт
            fos.write(packed & 0xFF);         // Записываем младший байт
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("src/hw05/output.txt")) {
            int newpacked = 0;

            // Чтение трёх байтов и сборка их в одну переменную
            newpacked |= (fis.read() << 16);
            newpacked |= (fis.read() << 8);
            newpacked |= fis.read();

            // Распаковка значений
            int[] newarr = new int[9];
            for (int i = 0; i < newarr.length; i++) {
                newarr[i] = (newpacked >> (2 * (8 - i))) & 0b11;
                System.out.print(newarr[i] + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
//        int[] arr = {0, 1, 2, 3, 0, 1, 2, 3, 0};
//
//        recordInFile(arr);
//        FileOutputStream fos = new FileOutputStream("src/hw05/task02.txt");
//        for (int b = 0; b < 3; b++) { // write to 3 bytes
//            byte wr = 0;
//            for (int v = 0; v < 3; v++) { // write by 3 values in each
//                wr += (byte) (arr[3 * b + v] << (v * 2));
//            }
//            fos.write(wr);
//        }
//        fos.flush();
//        fos.close();
         */
    }

    private static void recordInFile(int[] array){
        try (FileWriter fw = new FileWriter("src/hw05/task02.txt")) {
            fw.write(Arrays.toString(array));
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
