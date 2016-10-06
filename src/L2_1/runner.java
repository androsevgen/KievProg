package L2_1;

import java.util.ArrayList;


public class runner {


    public static void main(String[] args) {
        Point point1 = new Point(2, 5);
        Point point2 = new Point(6, 1);
        Point point3 = new Point(62, 11);

        Line line1 = new Line(point1, point2);
        Line line2 = new Line(point2, point1);
        Line line3 = new Line(point3, point3);


        ArrayList<Line> list = new ArrayList<>();
        list.add(line1);
        list.add(line2);
        list.add(line3);

    }
}


