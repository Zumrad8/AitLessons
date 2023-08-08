public class LoopFor {
    public static void main(String[] args) {

        // вывести на экран все числа от 5 до 20;

        for (int i = 5; i <= 20; i++) {
            System.out.println(i);
        }

        int[] array = {5, 10,43, 545, -10, -23, 0, 15};
        int forSearch = 545;
        //vivesti na ekran index elementa po zadannomu znacheniu
        int index = -1;

        for (int k = 0; k < array.length; k++) {
            if (array[k] == forSearch) {
                index = k;
                System.out.println("Sovpadenie naydeno");
                if (index == 3) {
                    continue;
                }
                System.out.println("Hura!");
                break;


            } else {
                System.out.println("Chislo " + array[k] + " ne ravno " + forSearch);
            }

        }
        System.out.println(index);
    }
}
