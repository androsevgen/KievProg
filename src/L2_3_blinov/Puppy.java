package L2_3_blinov;

import L2_3_blinov.pak.Animal;


public class Puppy {

    void metod() {
        Animal animal = new Animal("tom ", "Gav ", "run ", "Kysat");
        System.out.println(animal.getName() + animal.getVoice() + animal.getRun() + animal.getBite());

    }


}
