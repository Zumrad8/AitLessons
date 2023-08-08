import java.util.Random;
import java.util.Scanner;

public class homework_06 {
    public static void main(String[] args) {

        // task 0

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите цифру 1, 2 или 3");
        int userInputInt = scanner.nextInt();

        System.out.println(userInputInt);
        if (userInputInt == 1) {
            System.out.println(" Вы ввели цифру 1 ");
        } else if (userInputInt == 2) {
            System.out.println(" Вы ввели цифру 2 ");
        } else if (userInputInt == 3) {
            System.out.println(" Вы ввели цифру 3 ");
        } else {
            System.out.println("  Вы ввели что то не то!");
        }


        // task 1

        Random random = new Random();
        int var1 = random.nextInt(100);
        int var2 = random.nextInt(100);
        int var3 = random.nextInt(100);
        int var4 = random.nextInt(100);

        System.out.println(" случайное число 1 = " + var1);
        System.out.println(" случайное число 2 = " + var2);
        System.out.println(" случайное число 3 = " + var3);
        System.out.println(" случайное число 4 = " + var4);

        int max;
        max = Math.max(var1, Math.max(var2, Math.max(var3, var4)));
        System.out.println("Максимальное число = " + max);


        // task 2

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите четырезначное число ");
        String str1 = scan.nextLine();

        if (str1.length() != 4) {
            System.out.println("Введено неверное число ");
        } else {
            int number = Integer.parseInt(str1);
            System.out.println("number start: " + number);

            int digit1 = number % 10;
            number = number / 10;
            System.out.println("number after cut " + number);

            int digit2 = number % 10;
            System.out.println("digit2 " + digit2);
            number /= 10;
            System.out.println("number after second cut " + number);

            int digit3 = number % 10;
            int digit4 = number / 10;

            if (digit1 + digit2 == digit3 + digit4 ) {
                System.out.println(" Ура! число счастливое!");
            } else {
                System.out.println("Число не является счастливым");
            }



        }
        System.out.println("Variant 2:  ==========");
        if(str1.length() == 4) {

        char ch0 = str1.charAt(0);
        char ch1 = str1.charAt(0);
        char ch2 = str1.charAt(0);
        char ch3 = str1.charAt(0);
        if ((int)ch0 + ch1 == (int) ch2 + ch2) {
            System.out.println("Число счастливое!");
        } else {
            System.out.println("Число не является счастливым");
        }
        }
    }
}

