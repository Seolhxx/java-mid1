package lang.object.test;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object obj1, Object obj2) {
        Rectangle rectangle1 = (Rectangle) obj1;
        Rectangle rectangle2 = (Rectangle) obj2;
        return obj1.equals(obj2);
    }
}
