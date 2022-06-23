package Java.lab8;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.*;

public class AnimalController {
    public static void validateAnimal(List<Animal> animalList) {
        List<Animal> animalFiltered = new ArrayList<>();
        List<Animal> candidateList = new ArrayList<>();
        for (Animal animal: animalList) {
            if (animal.isFlyable()) {
                animalFiltered.add(animal);
                System.out.println(animal.getName() + " not allowed to join contest");
            } else {
                candidateList.add(animal);
            }
        }
        Animal winner = null;
        for(Animal candidate : candidateList) {
            winner = candidateList.get(0);
            System.out.println("Runner name: " + candidate.getName());
            System.out.printf("Running with speed: %d kmh \n",candidate.getSpeed());
            for (int i = 1; i < candidateList.size(); i++) {
                if (candidateList.get(i).getSpeed() > winner.getSpeed()) {
                    winner = candidateList.get(i);
                }
            }
        }
        System.out.println("Winner is " +winner.getName());
    }

}
