package Java.lab8;

public class Animal {
    private String name;
    private int speed;
    private boolean flyable;
    public Animal (AnimalBuilder builder) {
        this.name = builder.animalName;
        this.speed = builder.speedAnimal;
        this.flyable= builder.withWings;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", flyable=" + flyable +
                '}';
    }
    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public boolean isFlyable() {
        return flyable;
    }
    public static class AnimalBuilder{
        private String animalName;
        private int speedAnimal;
        private boolean withWings;

        public AnimalBuilder setName(String name){
            this.animalName = name;
            return this;
        }
        public AnimalBuilder setSpeed(int speedAnimal){
            this.speedAnimal = speedAnimal;
            return this;
        }
        public AnimalBuilder setWings(boolean withWings){
            this.withWings = withWings;
            return this;
        }
        public Animal build() {
            return new Animal(this);
        }

    }

}


