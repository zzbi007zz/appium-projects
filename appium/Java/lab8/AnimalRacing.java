package Java.lab8;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

public class AnimalRacing {

    public static void main(String[] args) {
     Animal.AnimalBuilder animalBuilder = new Animal.AnimalBuilder();
     List<Animal> animalLst = new ArrayList<>();
     Animal cat = animalBuilder.setName("Cat").setSpeed(new SecureRandom().nextInt(50)).setWings(false).build();
     Animal tiger = animalBuilder.setName("Tiger").setSpeed(new SecureRandom().nextInt(100)).setWings(false).build();
     Animal eagle = animalBuilder.setName("Eagle").setSpeed(new SecureRandom().nextInt(200)).setWings(true).build();
     Animal falcon = animalBuilder.setName("Falcon").setSpeed(new SecureRandom().nextInt(120)).setWings(true).build();
     Animal snake = animalBuilder.setName("snake").setSpeed(new SecureRandom().nextInt(90)).setWings(false).build();
     Animal elephant = animalBuilder.setName("Elephant").setSpeed(new SecureRandom().nextInt(60)).setWings(false).build();
     animalLst.add(cat);
     animalLst.add(eagle);
     animalLst.add(falcon);
     animalLst.add(snake);
     animalLst.add(elephant);
     AnimalController controller = new AnimalController();
     controller.validateAnimal(animalLst);



    }
}
