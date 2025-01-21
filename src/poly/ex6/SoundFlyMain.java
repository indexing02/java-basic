package poly.ex6;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);

        flyAnimal(bird);
        flyAnimal(chicken);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("Animal Sound Test Start");
        animal.sound();
        System.out.println("Animal Sound Test End");
    }

    private static void flyAnimal(Fly fly) {
        System.out.println("Animal Fly Test Start");
        fly.fly();
        System.out.println("Animal Fly Test End");
    }
}
