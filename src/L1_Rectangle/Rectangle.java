package L1_Rectangle;


public class Rectangle {
    private int height1;
    private int height2;
    private int width;

    public Rectangle(int height1, int height2, int width) {
        this.height1 = height1;
        this.height2 = height2;
        this.width = width;
    }

    public int getHeight1() {
        return height1;
    }

    public void setHeight1(int height1) {
        this.height1 = height1;
    }

    public int getHeight2() {
        return height2;
    }

    public void setHeight2(int height2) {
        this.height2 = height2;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    void area() {
        int s;
        s = (height1 * height2 * width) / 2;
        System.out.println(s);
    }

    void perimeter() {
        int p;
        p = height1 + height2 + width;
        System.out.println(p);
    }
}
