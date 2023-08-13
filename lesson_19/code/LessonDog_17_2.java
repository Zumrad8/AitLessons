import java.util.Random;

public class LessonDog_17_2 {
    public static void main(String[] args) {
        Dog2 dog2 = new Dog2("Barbos ", 150);
        Random random = new Random();
        //Dog2 dog2 = new Dog("Barbos ", random.nextInt(101) ) ;
        int[] newBarriers = {170, 100, 130, 150, 180, 200, 500, 250, 280, 300 };


        int count = 0;
        for(int i : newBarriers) {
            if (dog2.getBarrier(i)) {
                count++;
            }
        }
        System.out.println("Собака перепрыгнула " + count + " барьеров ");

        for(int i =0; i < newBarriers.length; i++) {
            newBarriers[i] = random.nextInt(400);
        }





         dog2.whoAmI();
        System.out.println("max Jump = " + dog2.getMaxJumpHeight());













    }

}
