package get_set;

import java.util.Scanner;

/**
 * Created by admin on 03.10.2016.
 */
public class pookormRun {
    public static void main(String[] args) {
            popkorm pop = new popkorm("Status");
        pop.setName("Bora");
        pop.setAge(23);
        System.out.println(pop.getStatus());
        System.out.println(pop.getAge()+" " +pop.getName());

    }

}
