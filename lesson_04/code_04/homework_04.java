public class homework_04 {
    public static void main(String[] args) {

        // задание 01

        String myName = "Zumrad";
        System.out.println(myName);

        System.out.println("Length of Name = " + myName.length());

        char firstChar, lastChar;
        firstChar = myName.charAt(0);
        lastChar = myName.charAt(6-1);

        System.out.println("First letter of my name = " + firstChar);
        System.out.println("Last letter of my name = " + lastChar);

        int codeDecimal =(int) firstChar;
        System.out.println(codeDecimal);

        int codeDecimal2 = (int) lastChar;
        System.out.println(codeDecimal2);
        System.out.println(myName.codePointAt(0));


        // задание 02

        String a1 = "Java";
        String b1 = "is";
        String c = "a";
        String d = "powerful";
        String e = "language";
        String sentence = a1 + " " + b1  + " " + c + " " + d + " " + e;
        String sentence2 = String.join( " ", a1, b1, c, d, e);

        System.out.println(sentence);
        System.out.println("Length of sentence " + sentence.length());
        System.out.println(sentence2);

        System.out.println(sentence.replace(d,"super"));

        boolean f = sentence.contains("age");
        System.out.println(f);

        //задание 03

        String g = "string";
        System.out.println(g.substring(2,4));


        String h = "code";
        System.out.println(h.substring(1,3));

        String i = "Practice";
        System.out.println(i.substring(3,5));
    }
}
