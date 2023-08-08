public class StringEquals {
    public static void main(String[] args) {


        String str1 = "Java 9";
        String str2 = "Java 9";
        String str3 = new String("Java 9");

        boolean b1 = str1 == str2;
        System.out.println(b1);
    }


}
