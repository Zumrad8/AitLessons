public class Homework_11 {
    public static void main(String[] args) {
        int[] array = {55, 13, 1, -23, 42, 77, 99};

        printArray(array);
        System.out.println();
        printArray(array, 3);
        System.out.println();
        printArray(array, true);
        System.out.println();
        printArray(array, false);
        System.out.println();
        print2PowN(8);
        print2PowN(0);
    }

    public static void printArray(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) { //условия для обратной последовательности
            if (i < array.length - 1) {
                System.out.print(", ");
            }

            System.out.print(array[i]);
        }

    }

    public static void printArray(int[] array, int index) {
        for (int i = 0; i < index; i++) {
            System.out.print(array[i]);
            System.out.print(", ");
        }
        for (int i = array.length - 1; i >= index; i--) {
            System.out.print(array[i]);
            if (i != index) {
                System.out.print(", ");
            }
        }
    }

    public static void printArray(int[] array, boolean isReversePrint) {
        if (isReversePrint == false) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
        if (isReversePrint == true) {
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
        }
    }
    //task 1

    public static void print2PowN(int n) {
        // 2 * 2 * 2 * 2
        int result = 2;
        for (int i = 2; i <= n; i++) {
            result = result * 2;
        }

        if (n == 0) {
            result = 1;
        }

        System.out.println(result);
    }
}

