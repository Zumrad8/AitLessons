public class Cat2 { // класс

    String name;
    double weight;

    public Cat2(String catName, double weight) {
        this.name = catName;
        this.weight = weight;

    }
    void startTraining(int laps ) { //метод

        System.out.println("Старт тренировки с " + laps + "кругами");

        for (int i = 0; i < 10; i++) {
            System.out.println("Круг номер " + (i+1));
            run();
            System.out.println("end lap \n");

        }

    }

    void eat() { // метод
        System.out.println("Я кушаю!");
        weight++;
    }

    void whoAmI() { // метод
        System.out.println("Я котик " + name + " и я вешу " + weight + " кг ");
    }

    void run() { // метод
        while (weight <= 2) {
            System.out.println("Я слишком голоден и слишком худой! Бегать не могу!!! Мой вес " + weight);
            eat();
            System.out.println("Мой вес " + weight);

        }
            System.out.println("Я бегу! Ох, как тяжело ...( ");
            weight -= 2;

    }
}
