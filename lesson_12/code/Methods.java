import javax.crypto.spec.PSource;

public class Methods {
    public static void main(String[] args) {
        //powMethod(3);
       // powIntMethod(3);
        int resultFromMethod = powIntMethod(3);
        resultFromMethod = powMethod(3);
        int powPow = powPow(2);
        System.out.println(powPow);
        System.out.println(powPow(5));

        int[] array = {1,0, 5, 5, 8};
        int minInArray = foundMinInArray(array);
        System.out.println("min in array: " + minInArray);
        int [] arr = {1,2,3,4};
        int x= 0;
        System.out.println(isNumberInArray(arr, x ));

    }
       //Methods area

    public static int foundMinInArray(int[] arr) {
        if (arr != null) {
            int minIndex = 0;
            int min = arr[0]; // инициализация переменной значения, хранящийся в 0 ячейке массива/
            // нахождение min значения в массиве
            // for ( int value : arr ) {
            // if ( value < min) {
            // min = value;
            // }
            //}
            for (int i =0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    minIndex = i;
                }
            }
            return minIndex; // возврат результата работы метода
        } else {
            // пришел null
            // Что возвращать?
            return -1;
        }
    }

    public static boolean isNumberInArray(int [] arr, int x){
        if (arr == null) return false; // Проверка на null. В случае возвращается false.
        boolean result = false;
        for ( int value : arr) {
            if ( value == x){
                return true;
            }
        }
        return false;
    }

    public static int powMethod(int x) {
                if (x >= 0) {
                    int result = 1;
                    for (int i = 0; i < x; i++) {
                        result = result * 2;
                    }
                    System.out.println("2 в степени " + x + " равно: " + result);
                } else {
                    System.out.println("Не верные аргументы вызова метода");
                }
                return x;
            }


    public static int powIntMethod(int x) {
        int result = 1;
        if (x >= 0) {
            for (int i = 0; i < x; i++) {
                result *= 2;
            }
        } else {
            // x  < 0
        }
        System.out.println(result);
        return result; // возвращаем резултат наших вычислений.
        // Тип строго должен соответстовать указанному типу возвращаемого
        //значения метода.
    }
    public static int powPow ( int a) {
        int result;
        result = a*a;
        return result;
    }







 }
