public class Closet {

    String color;
    int length;
    int width;
    int height;
    int doorCount;

    public Closet(String color) {
        this.color = color;
    }

    public Closet(String color, int length, int width, int height, int doorCount) {
        this.color = color;
        this.length = length;
        this.width = width;
        this.height = height;
        this.doorCount = doorCount;
    }

    public int volume() {
        return length * width * height;
    }

    public void openDoors() {
        System.out.println(doorCount + " doors are opened now. Closet color is " + color);
    }
}