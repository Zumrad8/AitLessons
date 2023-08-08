import java.util.Random;
import java.util.Arrays;

public class Homework_10 {

    public static void main(String[] args) {

       //  Task 0
        // Заполните массив 20 случайными целыми числами. \
        // Программа должна вывести на экран массив, количество четных
        // чисел в массиве и сумму всех четных чисел.

        Random random = new Random();

        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);

        }
        System.out.println(Arrays.toString(array));

        int countEven = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[i]%2 == 0) {
                countEven++;
                sum = sum + array[i];
            }
        }
        System.out.println("Kolichestvo chetnih: " + countEven);
        System.out.println("Summa chetnih: " + sum);


    }
}
