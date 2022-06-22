package Java.lab8;

public class Animal {

    private String name;
    private int speed;
    private boolean flyable;

    protected Animal(Builder builder) {
        this.name = builder.name;
        this.speed = builder.speed;
        this.flyable = builder.flyable;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", flyable=" + flyable +
                '}';
    }

    public static class Builder {
        private String name;
        private int speed;
        private boolean flyable;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public boolean isFlyable() {
            return flyable;
        }

        public void setFlyable(boolean flyable) {
            this.flyable = flyable;
        }
    }



}
