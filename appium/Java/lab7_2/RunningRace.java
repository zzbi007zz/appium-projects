package Java.lab7_2;

import java.util.Arrays;
import java.util.List;

public class RunningRace {

    public static void main(String[] args) {
        Animal horse = new Horse();
        horse.setName("Horse");
        Animal dog = new Dog();
        dog.setName("Dog");
        Animal tiger = new Tiger();
        tiger.setName("Tiger");
        AnimalController controller = new AnimalController();
        controller.animalContest(Arrays.asList(tiger, dog, horse));
    }



}
