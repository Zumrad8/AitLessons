import java.util.Random;
import java.util.Scanner;

public class Lesson_08 {
    public static void main(String[] args) {
        int i = 0;
        while (i<=10) {
            //telo cikla
            System.out.println( "Hello! " + i++);

        }
        System.out.println("Cikl zavershen!");

        System.out.println("rest");

        System.out.println("========");
        i = 100;
         while ( i > 90) {
             // celo cikla
             System.out.println("Hello! " + i--);
         }
        System.out.println("Cikl2 zavershen! ");

         int y = 0;
        Random random = new Random();
        int randomNUmber, count12 = 0, count13 =0;

        while (y< 1_000_000) {
            randomNUmber = random.nextInt(13);
            if(randomNUmber == 12) count12++;
            if (randomNUmber == 13) count13++;
            y++;

        }
        System.out.println("count12 " + count12 + " count13 " + count13);

        int var1 =0;

        while ( var1 != 0) {
            System.out.println("While, var ne raven 10");
        }
        do {
            System.out.println("Do-while var ne raven 0");
        } while ( var1 != 0);

        System.out.println();
        System.out.println("Do-while =======");

        Scanner scanner = new Scanner(System.in);
        int answerInt;

        do {
            System.out.println("Vvedite chislo menshe ili ravno 10");
            answerInt = scanner.nextInt();
            System.out.println("Vi vveli chislo: " + answerInt);
        } while (answerInt > 10);
        System.out.println("Ura! Vashe chislo podhodit! " + answerInt);

         int counter = 1;
         while ( counter <= 20) {
             if (counter %2 == 0)
             System.out.println(counter);
             counter++;
         }
         



    }

}
