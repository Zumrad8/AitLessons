import java.util.Arrays;

public class Lesson_09 {
    public static void main(String[] args) {
         int[] array;
         array = new int[5];
       //  int array2[]; option 2, not recommend

        int a;
        a = 10;
      //  int a = 10;
        int [] array2 = new int[10];
        int[] array3 = new int[a];

        char[] chars = new char[5]; // 0- default

        String[] strings = new String [7]; // null
        String str = null;
        boolean[] booleans = new boolean[100]; //false
        String[] string1 = {"one", "two", "regert"};

        int[] numbers = new int[] {1, 5, -16, 25, 0};
        int[] numbers2 = {1, 5, -16, 25, 0};

        int[] myArray ={1, 5, -16, 25, 15845};
        int digitIndex1 = myArray[1];
        System.out.println("digitIndex1 = " + digitIndex1);
        myArray[1] = 10;
        int digitIndexNew = myArray[1];
        System.out.println("new value: " + digitIndexNew);

        int lengthArray = myArray.length;
        System.out.println("Array length: " + lengthArray);

        int counter = 0;
        while (counter < myArray.length) {
            System.out.println(myArray[counter]);// myArray [0] -> myArray[1] -> ...myArray[length -1]
            counter++;
        }
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(string1));
        String string = "Abcdef";

        System.out.println("++++++++Arrays++++++++++");

        int[] myArray2 = {55, -15, 543, 10, 17, 56, 101, 0, 145};
        int[] arraySubarray =Arrays.copyOf(myArray2, 4);
        int[] copyOfArray = Arrays.copyOf(myArray2, myArray2.length);
        System.out.println(Arrays.toString(arraySubarray));

        int[] arraySubarray2 = Arrays.copyOfRange(myArray2,4,7);
        int[] arraySubarray3 = Arrays.copyOfRange(myArray2,4,7);
        int[] arraySubarray4 = Arrays.copyOfRange(myArray2,4,100);
        System.out.println("arraySubarray2 " + Arrays.toString(arraySubarray2) );
        System.out.println("arraySubarray3 " + Arrays.toString(arraySubarray3) );
        System.out.println(arraySubarray4.length);
        System.out.println(arraySubarray2 == arraySubarray3);
        Arrays.sort (myArray2, 2, 6);

        System.out.println("myArray2 " + Arrays.toString(myArray2));
        System.out.println("copyOfArray " + Arrays.toString(copyOfArray));
















    }
}
