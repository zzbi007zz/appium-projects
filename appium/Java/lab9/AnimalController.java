package Java.lab9;


import Java.lab9.Animal;
import java.util.List;

public class AnimalController {

    public static void animalContest(List<Animal> animalLst) {
        int maxSpeed =0;
        String animalName=null;
        for (Animal animalz : animalLst) {
            System.out.println(animalz.getName());
            System.out.println(animalz.getSpeed());
            if (maxSpeed < animalz.getSpeed()) {
                animalName = animalz.getName();
                maxSpeed = animalz.getSpeed();
            }
        }
        System.out.printf("Winner is %s with speed %d km/h",animalName,maxSpeed);
    }

}
