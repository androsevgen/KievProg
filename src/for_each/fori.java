package for_each;

import java.util.ArrayList;

/**
 * Created by admin on 05.10.2016.
 */
public class fori {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println();
        for (String x :
                list) {
            System.out.println(x);
        }
        String sum = "";
        System.out.println();
        for (String y :
                list) {
            sum = sum + y;
        }
        System.out.println(sum);
    }
}
