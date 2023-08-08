import java.util.Arrays;

public class Homework_13 {
    public static void main(String[] args) {
        String[] array = {"I", "am", "very", "good", "student"};
        int[] array2 = {2, 4, 6, 7, 10, 1};

        System.out.println(isInArray(array,"good"));
        System.out.println(isInArray(null,"good"));
        System.out.println(isInArray(new String[]{},"good"));
        System.out.println(returnNewString("Hallo"));
        System.out.println(sumOfArray(array2));
        System.out.println(sumOfArray(null));

        int[] ints1 = copyOfArray(array2);
        System.out.println(Arrays.toString(array2));

        int[] ints2 = copyOfArray(ints1, 11);
        System.out.println(Arrays.toString(ints2));

    }
    /*
    Task 0
    Написать метод по поиску строки в массиве строк.
    На вход метод принимает массив строк, и строку для поиска.
     */

    public static boolean isInArray(String[] array, String search) {
        boolean result = false;
        if (array == null || search == null ) {
            return false;
        }
        /*
        for (String currentString : array) {
            if (currentString != null && currentString.equals(search)) {
                return false;
            }
        }


         */
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                result = true;
            }
        }

        return result;
    }

    /*
    Task 1
    Написать метод, принимающий строку и возвращающий новую строку,
    состоящую из 2го и 3го символа входящей строки, переведенных в верхний
    регистр. Распечатать полученный результат в методе main
     */
    public static String returnNewString(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() <= 1) {
            return null;
        }
        char second = str.charAt(1);
        char third;
        if (str.length() < 3) {
            return String.valueOf(second).toUpperCase();
        }
        third = str.charAt(2);
        return (second+""+third).toUpperCase();
    }
    /*
    Task 3
    Реализуйте метод sumOfArray (сумма элементов массива),
    который получает на вход массив и определяет сумму его элементов.
     */
    public static int sumOfArray (int[] array2){
        if(array2 == null){
            return 0;
        }
        int sum =0;
        for(int i = 0; i < array2.length; i++) {
            sum = sum + array2[i];


        }
        return sum;
    }

    /*
    Task 3 опционально
    Написать метод copyOfArray, возвращающий массив:
    Метод принимает массив целых чисел и возвращает копию этого массива.
    Перегрузка: метод принимает массив строк и возвращает копию массива
    Перегрузка: Метод принимает массив целых чисел и число (newSize) -
    длину нового массива.
    Новый массив заполняется значениями из входящего массива.
    Сколько поместится. Если чисел не хватило -> остаток массива
    заполняется 0.
     */

    public static int[] copyOfArray(int[]array){
        if(array == null)return new int[0];
        int[] copyOfArray = new int [array.length];
        for(int i = 0; i < array.length; i++) {
            copyOfArray[i] = array[i];
        }
        return copyOfArray;
    }
    public static int[] copyOfArray(int[] array, int newSize) {
        if(array == null) return null;

        int[] result = new int[newSize];

        for (int i =0; i < result.length && i < array.length; i++) {
            result[i] = array[i];

        }

        return  result;
    }
}
