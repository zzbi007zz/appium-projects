package Java.lab9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalContest {

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        Animal tiger = new Tiger();
        Animal elephant = new Elephant();
        Animal dog = new Dog();
        animalList.add(tiger);
        animalList.add(elephant);
        animalList.add(dog);
        AnimalController controller = new AnimalController();
        controller.animalContest(Arrays.asList(dog,elephant,tiger));



    }

}
