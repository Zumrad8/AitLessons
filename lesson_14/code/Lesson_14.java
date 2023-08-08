import java.util.Arrays;
import java.util.Random;

public class Lesson_14 {

    public static void main(String[] args) {
        System.out.println("=========Task 0==========");

        /*
        Написать метод, возвращающий массив целых чисел, заданной длины.
        Массив должен быть заполнен случайными числами.
        Перегрузка. Диапазон случайных чисел, может быть задан вторым параметром вызова метода
         */

        int[]array = createRandomArray(8, 100);
        System.out.println(Arrays.toString(array));


    } // end main

    // Methods area


    public static int [] createRandomArray (int size, int bound) {

        if (size < 0 || bound <= 0) return new int[0];
       // Random random = new Random();
        int [] result = new int [size]; // объявление и инициализация массива длинной ышяу
        Random random = new Random();
        for (int i = 0; i < result.length; i++) { // Заполнение массива случайными числами
            result [i] = random.nextInt(bound);

        }
         return result;

    }

}
