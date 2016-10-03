package one1;


/**
 * Created by admin on 02.10.2016.
 */
public class DogRun {
    public static void main(String[] args) {
        Dog dog = new Dog("Sobaka", 5);
        dog.bigL("ttt", 12);
        for (int i = 0; i < 4; i++) {
            dog.gav();
        }
        String ff = "123";
        String ff_1 = "456";
        System.out.println(dog.toString());

    }
}
