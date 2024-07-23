package lection02;

//1. Написать метод «Шифр Цезаря», с булевым параметром зашифрования и расшифрования и числовым ключом

import java.util.Scanner;

public class Caesar {
    public static void main(String[] args) {

        Scanner InputStringIn = new Scanner(System.in);
        System.out.println("Put your text");
        String InputString = InputStringIn.nextLine();
        Scanner CipherKeyIn = new Scanner(System.in);
        System.out.println("Put your key");
        int CipherKey = CipherKeyIn.nextInt();
        getCipherEngText(InputString, CipherKey);

        Scanner InputStringInR = new Scanner(System.in);
        System.out.println("Введи свой текст");
        String InputStringR = InputStringIn.nextLine();
        Scanner CipherKeyInR = new Scanner(System.in);
        System.out.println("Введи свой ключ");
        int CipherKeyR = CipherKeyIn.nextInt();
        getCipherRusText(InputStringR, CipherKeyR);

        // метод  учителя
        caesar("Написать метод, принимающий на вход массив чисел и параметр n", 3, false);

//        getRussianAlphabet();
//        getEnglishAlphabet();
    }

    /**
     * Метод возвращает зашифрованный текст на английском
     *
     * @param str строка, которую пишет пользователь
     * @param k числовой ключ
     * @return зашифрованная строка, шифруются только буквы
     */
    public static void getCipherEngText(String str, int k) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)) && Character.isUpperCase(str.charAt(i)))
                chars[i] = (char) (((int) (str.charAt(i) - 65 + k) % 26) + 65);

            else if (Character.isLetter(str.charAt(i)) && Character.isLowerCase(str.charAt(i)))
                chars[i] = (char) (((int) (str.charAt(i) - 97 + k) % 26) + 97);

            else chars[i] = str.charAt(i);
        }
        System.out.println(chars);
    }

    /**
     * Метод возвращает зашифрованный текст на русском
     *
     * @param str строка, которую пишет пользователь
     * @param k числовой ключ
     * @return зашифрованная строка, шифруются только буквы
     */
    public static void getCipherRusText(String str, int k) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)) && Character.isUpperCase(str.charAt(i)))
               chars[i] = (char) (((int) (str.charAt(i) - 1040 + k) % 32) + 1040);

            else if (Character.isLetter(str.charAt(i)) && Character.isLowerCase(str.charAt(i)))
                chars[i] = (char) (((int) (str.charAt(i) - 1072 + k) % 32) + 1072);

            else chars[i] = str.charAt(i);
        }
        System.out.println(chars);
    }

    private static String caesar(String in, int key, boolean encrypt) {
        if (in == null || in.isEmpty())
            return null;
                final int len = in.length();
        char[] out = new char[len];
        for (int i = 0; i < len; ++i) {
            out[i] = (char) (in.charAt(i) + ((encrypt) ? key : -key));
            }
        return new String(out);
        }

    // ========================================================================================================
    /**
     * Метод возвращает RU алфавит
     *
     * @return алфавит
     */
    public static void getRussianAlphabet() {
        String str = "";
        for (char i = 1040; i <= 1071; i++) { // char i = '\u0410'; i <= '\u042f'; i++
            str = STR."\{str}\{i} ";
        }
        System.out.println();
        for (char i = 1072; i <= 1103; i++) { // char i = '\u0410'; i <= '\u042f'; i++
            str = STR."\{str}\{i} ";
        }
        System.out.println(str); // from '\u0430' to '\u044f' - абвгдежзийклмнопрстуфхцчшщъыьэюя

    }
    /**
     * Метод возвращает ENG алфавит
     *
     * @return алфавит
     */
    public static void getEnglishAlphabet() {
        String str = "";
        for (char i = 65; i <= 90; i++) { // char i = '\u0410'; i <= '\u042f'; i++
            str = STR."\{str}\{i} ";
        }
        for (char i = 97; i <= 122; i++) { // char i = '\u0410'; i <= '\u042f'; i++
            str = STR."\{str}\{i} ";
        }
        System.out.println(str); //
    }

    /**
     * Метод возвращает зашифрованный алфавит
     *
     * @param alphabet алфавит
     * @param k числовой ключ
     * @return зашифрованный алфавит
     */
    public static void getCipherRusAlphabet(String alphabet, int k) {
        String str = "";
        for (int i = 0; i < alphabet.length(); i++) {
            int start = alphabet.charAt(i) + k;
//            System.out.println(start); // 1040 - first letter
            int end = (start - 1040) % 32 + 1040;
            str += (char) end;
        }
        System.out.println(str);
    }

    public static void getCipherEngAlphabet(String alphabet, int k) {
        char[] chars = new char[alphabet.length()];
        for (int i = 0; i < alphabet.length(); i++) {
            if (Character.isLetter(alphabet.charAt(i)) && Character.isUpperCase(alphabet.charAt(i)))
                chars[i] = (char) (((int) (alphabet.charAt(i) - 65 + k) % 26) + 65);

            else if (Character.isLetter(alphabet.charAt(i)) && Character.isLowerCase(alphabet.charAt(i)))
                chars[i] = (char) (((int) (alphabet.charAt(i) - 97 + k) % 26) + 97);

            else chars[i] = alphabet.charAt(i);
        }
        System.out.println(chars);
    }
}
