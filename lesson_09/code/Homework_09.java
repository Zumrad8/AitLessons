import java.util.Arrays;
import java.util.Random;

public class Homework_09 {
    public static void main(String[] args) {

        // Task 0
        int[] myArray = new int[5];
        int a = 0;

        Random random = new Random();
        while (a < myArray.length) {
            myArray[a] = random.nextInt(0, 10);
            a++;
        }
        System.out.println(Arrays.toString(myArray));

        int b = 0;
        int min = myArray[b];
        int max = myArray[b];
        int minIndex;
        int maxIndex;
        minIndex= 0;
        maxIndex= 0;
        while (b < myArray.length) {
            if (min > myArray[b]) {
                min = myArray[b];
                minIndex = b;
            }
            if (max < myArray[b]) {
                max = myArray[b];
                maxIndex = b;
            }
            b++;
        }

        System.out.println("Минимальное значение =" + min + " Index = " + minIndex);
        System.out.println("Максимальное значение =" + max + " Index = " +  maxIndex);

        int sum = 0;
        int c = 0;
        while (c < myArray.length) {
            sum = sum + myArray[c];
            c++;
        }
        System.out.println("Среднее арифметическое =" + sum / (float) myArray.length);
    }
}

        // Task 1
        //int minIndex = 0;
          //int maxIndex = 0;

        //int temp = myArray[minIndex];
       // myArray[minIndex]= myArray[maxIndex];
       // myArray[maxIndex] = temp;
       // System.out.println( Arrays.toString(myArray))

        // razobratsya s indexom


        // Task 2
      //







