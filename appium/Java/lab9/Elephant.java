package Java.lab9;

import java.security.SecureRandom;

public class Elephant extends Animal{
    private int elephantSpeed;
    private static int ELEPHANT_MAX_SPEED = 70;

    public Elephant() {
        elephantSpeed = new SecureRandom().nextInt(ELEPHANT_MAX_SPEED);
    }

    @Override
    public String getName() {
      return "Elephant";
    }

    @Override
    public int getSpeed() {
        return this.elephantSpeed;
    }
}
