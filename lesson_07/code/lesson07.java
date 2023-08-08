import java.util.Scanner;

public class lesson07 {

    public static void main(String[] args) {
/*
        int x = 5;
        switch (x) {
            case 5: {
                System.out.println("Х равен 5");
            }
        }
        if (x == 5) System.out.println("if x равен 5 ");

        int y = 1;
        switch (x) {
            case 1:
                ;
            {
                System.out.println("x raven 1");
                break;
            }
            case 2:
        }
        System.out.println("У меня есть зашадка:");
        System.out.println("Что это такое: желтый, большой, с рогами и полный зайцев?");
        System.out.println("Как думаешь?");

        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        answer = answer.trim();

        switch (answer) {
            case "троллейбус":
            case "троллейбус!":
            case "Троллейбус": {
                System.out.println("Richtig!");
                break;
            }
                case "сдаюсь":
            case " сдаюсь ": {
                System.out.println("Schade");
                break;
            }
            default: {
                System.out.println("а вот и неправильно");
            }
        }

 */
        String result = "";
        int myChoice = 1;
        int resInt;

        switch (myChoice) {
            case 1:
                result = "Vi vveli odin";{
                break;
        }
            case 2: result = "Vi vveli dva";{
            break;
            }
            case 3: result = "Vi vveli tri";
            {
                break;
            }
            case 4: result = "Vi vveli chetire"; {

            break;
            }

            case 5: result = "Vi vveli pyat"; {
                break;
            }
            default: result = "Stroka po umolchaniyu";
        }

        System.out.println("Result string " + result);
    }

}

