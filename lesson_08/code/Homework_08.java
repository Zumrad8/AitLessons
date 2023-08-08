import java.net.Socket;
import java.util.Scanner;

public class Homework_08 {
    public static void main(String[] args) {

// Task 0 Распечатать 10 строк: “Task1”. “Task2”. … “Task10”. Используем цикл while

        int task = 1;

        while (task != 11) {
            System.out.println("Task" + task++);

        }

// Task 1 Распечатать все числа от 1 до 100,
// которые делятся на 5 без остатка. Используем цикл do-while


        int b = 1;
        do {
            if (b % 5 == 0) {
                System.out.println("b = " + b);
            }
            b++;
        } while (b <= 100);


        // Task 2 Распечатать только 7 чисел от 1 до 100,
        // которые делятся на 5 без остатка. Используем цикл while

        int a = 1;
        int c = 1;
        while (a <= 100) {
            if (a % 5 == 0) {
                if (c <= 7) {
                    System.out.println(c + " . " + a);
                    c++;
                }
            }
            a++;
        }

        // Task 3 Программа просит пользователя слово "hello"
        // Если пользователь вводит правильное слово - программа распечатывает
        // на экран благодарность и завершает работу Если вводится не верное слово
        // - программа просит ввести слово снова.
        // До тех пор, пока не будет введено запрашиваемое слово

        Scanner scanner = new Scanner(System.in);

        int kolichestvoPopitok = 1;

        System.out.println("Vvedite slovo Hello");
        String userInputInt = scanner.nextLine();

        System.out.println(userInputInt);

        while (!userInputInt.equals("Hello")) {
            kolichestvoPopitok++;
            System.out.println("Poprobuy snova");
            userInputInt = scanner.nextLine();
        }

        System.out.println("Ti molodec!");
        System.out.println(kolichestvoPopitok);

        // Task 4 Программа просит пользователя ввести произвольное
        // число Вывести сумму цифр этого числа

        int userNumber;
        System.out.println("vvedite chislo: ");
        userNumber = scanner.nextInt();

        System.out.println("number: " + userNumber);

        int sumDigit = 0;
        //12345

        while (userNumber > 0) {
            int digit = userNumber % 10;
            System.out.println( digit + (userNumber > 10 ? " + " : " = "));
            sumDigit =  sumDigit + digit;
            userNumber = userNumber / 10;

        }

        System.out.println( sumDigit);


        System.out.println("Option 2 =========");

//        String strNumber = String.valueOf(digitForChar);
//        System.out.println( "String: " + strNumber);
//        // "12345"
//        int y = 0;
//        int sum1 = 0;
//        while ( y < strNumber.length()) {
//            int digit = Integer.parseInt( String.valueOf(strNumber.charAt(y++)));
//            System.out.println(digit + );
 //       }
    }
}
