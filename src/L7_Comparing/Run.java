package L7_Comparing;


import L2_1.Line;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Comparing comp = new Comparing(list);

        list.add("Petr");
        list.add("Kolin");
        list.add("Martin");
        list.add("Limon");
        list.add("Devid");
        list.add("John");
        list.add("Liza");

        comp.sortAlfavit();
        comp.sortAlfavitREVERS();
        comp.sort3();
        comp.sort4();

    }
}
