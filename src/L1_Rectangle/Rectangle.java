package L1_Rectangle;

/**
 * Created by admin on 03.10.2016.
 */
public class Rectangle {
    private int height1;
    private int height2;
    private int width;

    public Rectangle(int height1, int height2, int width) {
        this.height1 = height1;
        this.height2 = height2;
        this.width = width;
    }

    void area() {
        int s;
        s = (height1 * height2 *  width) / 2;
        System.out.println(s);
    }

    void perimeter() {
        int p;
        p = height1 + height2 + width;
        System.out.println(p);
    }
}
