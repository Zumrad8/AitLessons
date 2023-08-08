import java.lang.module.FindException;
import java.util.Arrays;

public class Homework_14 {

    public static void main(String[] args) {
        String str22 = "zumrad";
        System.out.println(convertToUpperCase(str22));

        swapValues(new int[]{7, 12, 45, 3, 0}, 0, 2);

        String[] str = {"One", "Two", "Three", "Four"};
        swapValues(str, 0,3);

    }
    /*
    Task 0
    Написать метод переводящие все маленькие буквы латинского алфавита
    в строке в верхний регистр.
    toUpperCase() использовать низзя.
     */

    public static String convertToUpperCase(String str) {

        String result = "";
        int currentChar;
        if(str == null){
            return null;
        }

        for (int i = 0; i < str.length(); i++) {
            currentChar = str.charAt(i);

            if (currentChar >= 97 & currentChar <= 122) {
                currentChar = currentChar - 32;
            }

            result = result + (char)currentChar;
        }

        return result;

    }
    /*
    Task 1
    Написать метод swap, принимающий на вход массив целых чисел,
    и два индекса. Метод должен поменять местами значения, хранящихся в этих индексах
    {0, 1, 2, 3, 4, 5, 6} -> swap(arr, 1, 5} -> {0, 5, 2, 3, 4, 1, 6}
    Если индексы за пределами массива?

    Перегрузка метода для работы с массивами строк
     */

    public static void swapValues (int[] array, int index1, int index2) {
        if (array == null) {
            return;
        }

        if (index1 > array.length - 1 || index2 > array.length - 1) {
            System.out.println("Вы вышли за пределы массива ");
            return;
        }
        if (index1 < 0 || index2 < 0) {
            System.out.println("Отрицательного индекса быть не может ");
            return;
        }

        int a = array[index1];
        int b = array[index2];
        array[index1] = b;
        array[index2] = a;

        System.out.println(Arrays.toString(array));
    }

    public static void swapValues (String[] str, int index1, int index2) {
        if (str == null) {
            return;
        }

        if (index1 > str.length - 1 || index2 > str.length - 1) {
            System.out.println("Вы вышли за пределы массива ");
            return;
        }
        if (index1 < 0 || index2 < 0) {
            System.out.println("Отрицательного индекса быть не может ");
            return;
        }

        String a = str[index1];
        String b = str[index2];
        str[index1] = b;
        str[index2] = a;

        System.out.println(Arrays.toString(str));


    }
    /*
    Task 2
    Написать метод, принимающий строку и один или два индекса (перегрузка).
    Метод должен возвращать подстроку начиная с первого индекса (включительно)
    и заканчивая вторым индексом (не включительно) Если индекс 1 - начиная с индекса и до конца строки.
    Функционал повторяет метод String.substring(), так что этот метод
    использовать не нужно. Оригинальный метод ломает программу, если введены
    не корректные индексы. Наш метод аварийно завершать программу не должен.
     */
/*
    public static String returnSubstring(String str, int index1, int index2) {
        int a;
        int b;
        for (int i = 0; i < str.length(); i++) {

        }
        return ;


    }
    
 */


}



