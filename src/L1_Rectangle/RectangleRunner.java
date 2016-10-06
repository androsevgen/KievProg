package L1_Rectangle;

import java.util.ArrayList;

public class RectangleRunner {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(3, 2, 4);
        Rectangle rectangle2 = new Rectangle(23, 12, 34);
        Rectangle rectangle3 = new Rectangle(3, 21, 41);

        rectangle1.area();
        rectangle1.perimeter();

        ArrayList<Integer> ints = new ArrayList<Integer>();
        ints.add(rectangle1.getHeight1());
        ints.add(rectangle1.getHeight2());
        ints.add(rectangle1.getWidth());

        ints.add(rectangle2.getHeight1());
        ints.add(rectangle2.getHeight2());
        ints.add(rectangle2.getWidth());

        ints.add(rectangle3.getHeight1());
        ints.add(rectangle3.getHeight2());
        ints.add(rectangle3.getWidth());

        int sum = 0;
        for (Integer i :
                ints) {
            sum = sum + i;
        }
        System.out.println(sum);

        System.out.println(ints);
    }
}
