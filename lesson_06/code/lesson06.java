import java.util.Random;
import java.util.Scanner;

public class lesson06 {

    public static void main(String[] args) {

        int x = 8;

        //  if (x <= 10) System.out.println("х больше 10");
        System.out.println(" x before if: " + x);

        if (x == 10) {
            x = x - 1;
            System.out.println("x: " + x);
        }
        System.out.println("x after if: " + x);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        int userInputInt = scanner.nextInt();

        System.out.println(userInputInt);
        if (userInputInt == 1) {
            System.out.println("Вы ввели число 1");

        } else if (userInputInt == 3) {
            System.out.println("Вы же ввели 3, а не 1 ");
        } else if (userInputInt == 5) {
            System.out.println("Вы ввели число 5");
        } else {
            System.out.println("Вы ввели что то непонятное");
        }
        System.out.println("Вы вышли из оператора if ");


        {
            /*
               Ребенок получил оценку в школе от 1 до 5
               у ребенка есть карманные деньги
               за хорошие оценки получает деньги, за плохие отбирают
               5 -> + 20
               4 -> 10
               3 ->  0
               2 - > -20
               1 -> all
             */
            Random random = new Random();
            int money = 100;
            int note = random.nextInt(5);
            System.out.println(note);

            if (note == 5) {
                money += 20;
            } else if (note == 4) {
                money += 10;
            } else if (note == 2) {
                money -= 20; // money = money - 20;
            } else if (note == 1) {
                money = 0;
                System.out.println("Получена некорректная оценка! ");
            }
            System.out.println("У ребенка осталось: " + money + " монет");

        }

        int var1 = 10;
        int var2 = (var1 == 10) ? 20 : var1 - 4;
        System.out.println((var1 == 0) ? "равно 0" : "не равно 0");
    }
}






