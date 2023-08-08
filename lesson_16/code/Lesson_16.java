import org.w3c.dom.ls.LSOutput;

public class Lesson_16 {
    /*
    Task 0
    Посмотрите вокруг себя. Напишите три класса, описывающие какие-то
    сущности вокруг Вас. Не забудьте использовать абстракцию.
    Например, опишите студента, преподавателя и, допустим, врача.
    Вы можете выбрать свои сущности для описания.
     */
    public static void main(String[] args) {
        Bed redBed = new Bed("red");
        Bed blueBed = new Bed("blue", 180, 200, 40);

        System.out.println("Volume of red bed: " + redBed.volume());
        System.out.println("Volume of blue bed: " + blueBed.volume());

        Closet bigCloset = new Closet("white");
        Closet smallCloset = new Closet("brown", 200, 300, 200, 4);

        System.out.println("Volume of big closet: " + bigCloset.volume());
        bigCloset.openDoors();
        System.out.println("Volume of small closet: " + smallCloset.volume());
        smallCloset.openDoors();

        Table workTable = new Table("black", 150, 70,100);
        Table kichenTable = new Table("white ", 200, 70,100);

        System.out.println("Volume of work table " + workTable.volume());
        System.out.println("Volume of kitchen table " + kichenTable.volume());
    }
}