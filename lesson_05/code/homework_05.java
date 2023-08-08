import java.util.Random;


public class homework_05 {
    public static void main(String[] args) {

        // task 00


        int a = 2, b = 4, c = 5, d = 7, e = 8, f = 10, g = 12, h = 13, i = 15, j = 18;
        System.out.println("число: " + a + " четное: " + (a % 2 == 0) + " кратно 3: " + (a % 3 == 0) + " четное и кратное 3: " + ( a % 2 == 0 & a % 3 == 0) );
        System.out.println("число: " + b + " четное: " + (b % 2 == 0) + " кратно 3: " + (b % 3 == 0) + " четное и кратное 3: " + ( b % 2 == 0 & b % 3 == 0) );
        System.out.println("число: " + c+ " четное: " + (c % 2 == 0) + " кратно 3: " + (c % 3 == 0) + " четное и кратное 3: " + ( c % 2 == 0 & c % 3 == 0) );
        System.out.println("число: " + d+ " четное: " + (d % 2 == 0) + " кратно 3: " + (d % 3 == 0) + " четное и кратное 3: " + ( d % 2 == 0 & d % 3 == 0) );
        System.out.println("число: " + e+ " четное: " + (e % 2 == 0) + " кратно 3: " + (e % 3 == 0) + " четное и кратное 3: " + ( e % 2 == 0 & e % 3 == 0) );
        System.out.println("число: " + f+ " четное: " + (f % 2 == 0) + " кратно 3: " + (f % 3 == 0) + " четное и кратное 3: " + ( f % 2 == 0 & f % 3 == 0) );
        System.out.println("число: " + g+ " четное: " + (g % 2 == 0) + " кратно 3: " + (g % 3 == 0) + " четное и кратное 3: " + ( g % 2 == 0 & g % 3 == 0) );
        System.out.println("число: " + h+ " четное: " + (h % 2 == 0) + " кратно 3: " + (h % 3 == 0) + " четное и кратное 3: " + ( h % 2 == 0 & h % 3 == 0) );
        System.out.println("число: " + i+ " четное: " + (i % 2 == 0) + " кратно 3: " + (i % 3 == 0) + " четное и кратное 3: " + ( i % 2 == 0 & i % 3 == 0) );
        System.out.println("число: " + j+ " четное: " + (j % 2 == 0) + " кратно 3: " + (j % 3 == 0) + " четное и кратное 3: " + ( j % 2 == 0 & j % 3 == 0) );


        // task 01

        System.out.println((true | false) | (45 < 70) & !(true) ^ (6 == 5));
        System.out.println((true | false) | (45 < 70) & false ^ (6 == 5));
        System.out.println((true | false) | true & false ^ false);
        System.out.println(true | true & false ^ false);
        System.out.println(true | false ^ false);
        System.out.println(true | false);
        System.out.println(true );
    }
}
