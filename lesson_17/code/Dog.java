import org.w3c.dom.ls.LSOutput;

public class Dog {
    /*
    Написать класс собака
    Собака должна иметь имя, высоту прыжка
    Должна уметь прыгать и должна уметь тренироваться. За каждую тренировку высота прыжка увеличивается на 10 сантиметров
    Максимальная высота, которую может натренировать собака не может быть больше, чем 2раза высоту первоначального прыжка.
     */

    String name; // поле
    int jumpHeight;
    int maxJumpHeight;

    public Dog(String dogName, int jumpHeight) { // конструктор
        this.name = dogName;
        this.jumpHeight = jumpHeight;
        maxJumpHeight = jumpHeight * 2;

    }

    void jump() {
        System.out.println("Я прыгаю!!!");
       /* while (jumpHeight < 200) {
            System.out.println("Я еще недостаточно высоко прыгаю, еще только " + jumpHeight + "см");
            training();
            System.out.println("Мой прыжок уже " + jumpHeight + "см");
       /* }

        */
    }
    void getBarrier(int barrierHeight) {
        if( jumpHeight >= barrierHeight) {
            jump();
        }else{
            System.out.println("Я не могу ");
        }
    }

    void training() {
        if(jumpHeight + 10 <= maxJumpHeight) { // 50 -> 100 -> x <=100 - 10(90)
            jumpHeight += 10;
            System.out.println("Я натренировался, мой прыжок " + maxJumpHeight);
            whoAmI();
        } else {
            System.out.println("Больше не могу ");
        }


        System.out.println("Я тренируюсь!!!");
        jumpHeight += 10;
    }

    void whoAmI() {
        System.out.println("Я собака " + name + " и я умею прыгать в высоту " + jumpHeight + "см");

    }


}
