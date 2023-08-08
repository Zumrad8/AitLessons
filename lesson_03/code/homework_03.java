import java.sql.SQLOutput;

public class homework_03 {
    public static void main(String[] args) {
        System.out.println("homework_03");

        // задача 1

        int a = 0, b = 1, c = 2, d = 3, e = 4, f = 5, g = 6, h = 7, i = 8, j = 9;
        int k = (a + b + c + d + e + f + g + h + i + j)/10;
        // в дробной части отбросила 0,5
        System.out.println( " k = " + k  );

        // задача 2

        int productA = 1000;
        int productB = 500;
        int discount = 100;
        int priceOfPurchase = productA + productB - discount;

        System.out.println("сумма покупки ="  + priceOfPurchase);

        System.out.println("сумма скидки =" + discount);

        int day1 = 26, day2 = 22, day3 = 22, day4 = 24, day5 = 25, day6 = 23, day7 = 24;
        double averageTemperature = (day1 + day2 + day3 + day4 + day5 + day6 + day7) / 7d;

        System.out.printf("средняя температура за неделю: %.2f" , averageTemperature );

        System.out.println();
        int remainder1 = 4 % 2;
        System.out.println( " 4 % 2 =" + remainder1);

        int remainder2 = 5 % 2;
        System.out.println(" 5 % 2 =" +remainder2);

        int remainder3 = 6 % 3;
        System.out.println( "6 % 3 =" + remainder3);

        int remainder4 = 7 % 3;
        System.out.println( "7 % 3 =" + remainder4);

        int remainder5 = 11 % 3;
        System.out.println( "11 % 3 =" + remainder5);


        int x = 3;

        System.out.println( x+= x++); // будет равно 6
    }
}
