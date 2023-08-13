import java.util.Random;

public class LessonDog_17 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] newBarriers = new int[10];

        for(int i =0; i < newBarriers.length; i++) {
            newBarriers[i] = random.nextInt(400);
        }

        Dog2 dog = new Dog2("Rex", 100);



       // System.out.println(dog.jumpHeight);
       // System.out.println(dog.maxJumpHeight);

        // Dog2 dog1 = new Dog2("Barbos ", 50);


        /*


        dog.whoAmI();
        dog.training();
        dog.jump();
     /*

         */
    }

}
