package poly.ex4;

public class AbstractMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);

        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(caw);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("Animal Sound Test Start");
        animal.sound();
        System.out.println("Animal Sound Test End");
    }

    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("Animal Move Test Start");
        animal.move();
        System.out.println("Animal Move Test End");
    }
}
