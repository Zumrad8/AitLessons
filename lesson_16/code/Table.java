public class Table {

    String color;
    int length;
    int width;
    int height;

    public Table(String color) {
        this.color = color;
    }

    public Table(String color, int length, int width, int height) {
        this.color = color;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int volume() {
        return length * width * height;
    }
}
