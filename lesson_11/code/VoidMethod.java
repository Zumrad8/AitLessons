import javax.swing.*;
import java.util.Arrays;

public class VoidMethod {

    public static void main(String[] args) {
        sayHello();

        char chSymbol = 'A';
        printDecimalCodeOfChar(chSymbol);

        int[] arrays = {44, 55, 77, 86, 34, 99};
        System.out.println("Arrays print: ");

        printIsDigitSimple(11);

        int n = 8;
        printNumber(n);
        int x = 3;
        int y = 8;
        printNumber(x, y);

        int[] array ={13, 43, 55, 19, 22, 65, -2, -13, 0, 4, 5};
        printArray(array);

    }

    public static void sayHello() {
        System.out.println("HELLO");

    }

    public static void printDecimalCodeOfChar(char charName) {
        System.out.println((int) charName);

    }

    public static void printArray(int[] array) {
        if (array != null) {
            System.out.print("[");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + ((i == array.length -1) ? "" : " , "));

            }
            System.out.print("]");
            System.out.println();
        }
    }

    public static void printIsDigitSimple(int number) {
        boolean isPrime = true;

        if (number == 1) {
            isPrime = false;
            System.out.println("Chislo 1 ne yavlyaetsya prostim");

        }

        for (int j = 2; j < number; j++) {
            if (number % 1 == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + "yavlyetsya prostim! ");
        } else {
            System.out.println(number + "ne yavlyaetsya prostim! ");
        }

    }

    public static void printNumber(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static void printNumber(int x, int y) {
        for (int i = x; i <= y; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
