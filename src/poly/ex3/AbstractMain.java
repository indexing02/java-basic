package poly.ex3;

public class AbstractMain {
    public static void main(String[] args) {
        //추상 클래스 생성불가
        //AbstractAnimal animal = new Animal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        cat.move();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("Animal Sound Test Start");
        animal.sound();
        System.out.println("Animal Sound Test End");
    }
}
