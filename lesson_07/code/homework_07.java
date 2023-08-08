import java.util.Random;
import java.util.Scanner;

public class homework_07 {
    public static void main(String[] args) {

        // Перепишите решение задачи с использованием switch вместо if-else:
        //Необходимо написать программу, где бы пользователю предлагалось ввести
        // число на выбор: 1, 2 или 3, а программа должна сказать, какое число ввёл
        // пользователь: 1, 2, или 3


        int x = 1;

        switch (x) {
            case 1: {
                System.out.println("x равен 1");
                break;
            }
            case 2: {
                System.out.println("x равен 2");
                break;
            }
            case 3: {
                System.out.println("x равен 3");
                break;
            }
            default: {
                System.out.println("Введено какое-то другое число");
            }
        }

        //Программа просит пользователя ввести число от 1 до 7 Если число равно 1,
        // выводим на консоль “Понедельник”,
        // 2 –”Вторник” и так далее. Если 6 или 7 – “Выходной”.


        Scanner scanner = new Scanner(System.in);
        int a = 4;


        switch (a) {
            case 1: {
                System.out.println(" Понедельник ");
                break;

            }
            case 2: {
                System.out.println(" Вторник ");
                break;
            }
            case 3: {
                System.out.println(" Среда ");
                break;
            }
            case 4: {
                System.out.println(" Четверг ");
                break;
            }
            case 5: {
                System.out.println(" Пятница ");
                break;
            }
            case 6, 7: {
                System.out.println(" Выходной ");
                break;
            }

            default: {
                System.out.println();
            }

        }



        // task 2

        Random random = new Random();
        int timeOfTV = 45;
        int note = random.nextInt(13);
        System.out.println( "Note " + note);


         switch( note ) {
             case 10, 11, 12: {
                 System.out.println("Я так рада");
                 timeOfTV += 60;
                 System.out.println(" Время на просмотр ТВ " + timeOfTV);
                 break;

             }
             case 7, 8, 9: {
                 System.out.println("Ты у меня молодец");
                 timeOfTV += 45;
                 System.out.println(" Время на просмотр ТВ " + timeOfTV);
                 break;
             }
             case 4, 5, 6: {
                 System.out.println("Вполне не плохо");
                 timeOfTV += 15;
                 System.out.println(" Время на просмотр ТВ " + timeOfTV);
                 break;
             }
             case 3: {
                 System.out.println("Ох, как плохо ");
                 timeOfTV -= 30;
                 System.out.println(" Время на просмотр ТВ " + timeOfTV);
                 break;
             }
             case 1, 2: {
                 System.out.println("Какой кошмар!!!");
                 timeOfTV = 0;
                 System.out.println(" Время на просмотр ТВ " + timeOfTV);
                 break;
             }
             default: {
                 System.out.println();
             }


         }
    }

}