public class Dog2 {
    /*
    Написать класс собака
    Собака должна иметь имя, высоту прыжка
    Должна уметь прыгать и должна уметь тренироваться. За каждую тренировку высота прыжка увеличивается на 10 сантиметров
    Максимальная высота, которую может натренировать собака не может быть больше, чем 2раза высоту первоначального прыжка.
    Инкапсулировать class Dog из домашнего задания к уроку 17
    Повторить код класса Dog, написанного на уроке. Создать массив из 10 препятствий.
    Попросить объект класса собака перепрыгнуть все препятствия в массиве.
     */

    private String name; // поле
    private int jumpHeight;
    private int maxJumpHeight;
    private int increaseByTraining = 10;

    public Dog2(String dogName, int jumpHeight) { // конструктор
        this.name = dogName;
        this.jumpHeight = jumpHeight;
        this.maxJumpHeight = jumpHeight * 2;

    }

    public void setName(String string) {
        this.name = string;
    }

    public String getName() {
        return name;
    }

    public void setJumpHeight(int ints) {
        if (ints < 0) {
            this.jumpHeight = 0;
        } else {
            this.jumpHeight = ints;
        }

    }

    public int getJumpHeight() {
        return jumpHeight;
    }
    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }
    public int getIncreaseByTraining(){
    return increaseByTraining;
    }





    void whoAmI() {
        System.out.println("Я собака " + name + " и я умею прыгать в высоту " + jumpHeight + "см");

    }


    void jump(int height) {
        System.out.println("Я перепрыгиваю барьер " + height + " см");

    }

   void training() {
            System.out.println("Начал тренировку ");
            if (jumpHeight + increaseByTraining <= maxJumpHeight) {// 50 -> 100 -> x <=100 - 10(90)
            System.out.println("Я тренируюсь ");
            jumpHeight += increaseByTraining;

            System.out.println("Я натренировался, мой прыжок " + maxJumpHeight);
            whoAmI();
        } else if (maxJumpHeight - jumpHeight < increaseByTraining) {
            System.out.println("Small training start: jump = " + jumpHeight + "; max = " + maxJumpHeight);
        jumpHeight = maxJumpHeight;
    } else {
            System.out.println("Я больше не могу тренироваться ");
        }

        System.out.println("Закончил тренировку. Теперь прыгаю " + jumpHeight + " см");
       // jumpHeight += 10;
    }




            boolean getBarrier (int barrierHeight) {
                if (barrierHeight <= maxJumpHeight && jumpHeight < barrierHeight) {
                    while (jumpHeight < barrierHeight) {
                        training();

                    }
                }
                boolean result;
                if (jumpHeight >= barrierHeight) {
                    jump(barrierHeight);
                    result = true;
                } else {
                    System.out.println("Я не могу перепрыгнуть барьер высотой " + barrierHeight);
                    result = false;

                }
                System.out.println("End get barrier. Текущий прыжок " + jumpHeight);
                return result;
            }





}
