package Java.lab7_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AnimalController {
    public static void animalContest(List<Animal> animalLst) {
        int maxSpeed =0;
        String animalName=null;
        for (Animal animalz : animalLst) {
            System.out.println(animalz.getName());
            System.out.println("Running "+ animalz.getSpeed());
            if (maxSpeed < animalz.getSpeed()) {
               maxSpeed = animalz.getSpeed();
               animalName = animalz.getName();
           }
        }
        System.out.printf("Winner is %s with speed %d km/h",animalName,maxSpeed);
    }

}