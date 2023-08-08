import java.util.Arrays;


public class Homework_12 {
    public static void main(String[] args) {
        System.out.println(isSimple(5));

        int[] array = new int[]{4, 7, 13, 17, 6, 1};
        System.out.println(printArray(array));

        String [] arr = { "Java", "is", "a", "great", "languages"};
        System.out.println(Arrays.toString(printArray2(arr)));
        System.out.println(Arrays.toString(printArray2(null)));
        System.out.println(Arrays.toString(printArray2(new String[]{})));
    }

    /*Task 0
     Написать метод принимающий целое число и проверяющий является ли число простым.
     Если является, метод должен вернуть true, не является - false.
     Простое число это то число, которое делится только на 1 и на саму себя.
     Например 7, 13, 17 и т.д.
     Надо в цикле начиная с 2 перебрать все числа до того числа, который мы проверяем
     и проверить: Если хоть раз остаток от деления будет 0, то число не простое.
     */

    public static boolean isSimple(int a) {
        //boolean result = true;
        if (a <= 1) return false;

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false; // число не простое
            }
        }

        return true;
    }


    /*
    Task 1
     Написать метод, принимающий массив целых чисел.
     Метод должен вернуть количество простых чисел в массиве.
     Для проверки на "простоту" числа рекомендуется использовать метод из Task 0
     */

    public static int printArray(int[] array) {
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            if (isSimple(array[i])) {
                number++;
            }
        }
        return number;
    }

    /*
    Task 3
    Написать метод, принимающий на вход массив строк.
    Метод должен вернуть массив, состоящий из самой короткой и самой длинной строки
    изначального массива.
     */
    public static String[] printArray2(String[] arr) {
        if (arr == null) {
            return new String[]{}; // возвращаем пустой массив
        }
        if (arr.length == 0) {
            return new String[]{};
        }

        String smallestWord = arr[0];
        String largestWord = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (smallestWord.length() > arr[i].length()) {
                smallestWord = arr[i];
            }
            if (largestWord.length() < arr[i].length()) {
                largestWord = arr[i];
            }
        }

        return new String[]{smallestWord, largestWord};
    }

}


