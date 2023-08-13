import java.util.Arrays;

public class Lesson_19_2 {

    public static void main(String[] args) {
        /*
        int[]array = new int[2];
        int var = 10;
        array[0] = var;
        System.out.println(Arrays.toString(array));
        int var2 = 25;
        array[1] = 25;

        System.out.println(Arrays.toString(array));
    }

     */
    RubberArray rb = new RubberArray();

    rb.printArray();
        //System.out.println("Min " + rb.min());

    rb.add(10);
    rb.add(25);
    rb.add(-20);

    rb.printArray();

    int rbSize = rb.size();
        System.out.println("Сейчас в массиве " + rbSize + " элементов");

        System.out.println("Сумма значений элементов массива " + rb.sumOfValue());

        rb.add(7, 14, -21);

        rb.printArray();

        System.out.println("Min в массиве: " + rb.min());
        System.out.println("Max в массиве: " + rb.max());

        int[] newArray = rb.toArray();

        newArray[0] = 10_000;
        System.out.println(Arrays.toString(newArray));

        rb.printArray();

        rb.deleteByIndex(3);
        rb.printArray();

        System.out.println();
        System.out.println("++++++++++++++++++");
        RubberArray rubberArray = new RubberArray(newArray);
        rubberArray.printArray();

        System.out.println(rubberArray.searchValueByIndex(3));
        System.out.println(rubberArray.searchElementByValue(25));

        rb.deleteByValue(25);
        rb.printArray();



        rb.swapValueByIndex(2, 77);
        rb.printArray();

       // rb.swapValueToValue(10, 40);
        rb.printArray();



   }
}
