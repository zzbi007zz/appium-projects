package Java.lab9;

import java.security.SecureRandom;

public class Dog extends Animal{
    private int dogSpeed;
    private static int DOG_MAX_SPEED = 60;

    public Dog() {
        dogSpeed = new SecureRandom().nextInt(DOG_MAX_SPEED);
    }

    @Override
    public String getName() {
        return "Dog";
    }

    @Override
    public int getSpeed() {
        return this.dogSpeed;
    }
}
