public class Bed {

    String color;
    int length;
    int width;
    int height;

    public Bed() {

    }

    public Bed(String color) {
        this.color = color;
    }

    public Bed(String color, int length, int width, int height) {
        this.color = color;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int volume() {
        return length * width * height;
    }

}