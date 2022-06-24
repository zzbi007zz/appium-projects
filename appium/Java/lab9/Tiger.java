package Java.lab9;

import java.security.SecureRandom;

public class Tiger extends Animal{
    private int tigerSpeed;
    private static int TIGER_MAX_SPEED = 100;

    public Tiger() {
        tigerSpeed = new SecureRandom().nextInt(TIGER_MAX_SPEED);
    }

    @Override
    public String getName() {
      return "Tiger";
    }

    @Override
    public int getSpeed() {
        return this.tigerSpeed;
    }
}
