package one;

/**
 * Created by admin on 01.10.2016.
 */
public class DogRuner {
    public static void main(String[] args) {
        String dd;
        dd = "www";
        Dog dog = new Dog("REx", "Jon");
        for (int i = 0; i < 5; i++) {
            dog.bark();
        }
        System.out.println(dd.toUpperCase());

        Dog dog1 = new Dog("Peta", "Doda");
        dog1.test();


    }


}
