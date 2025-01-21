package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {

        //인터페이스 인스턴스 생성 불가
        //InterfaceAnimal animal = new Animal();

        Dog dog = new Dog();
        Caw caw = new Caw();
        Cat cat = new Cat();

        soundAnimal(dog);
        soundAnimal(caw);
        soundAnimal(cat);

    }

    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("Animal Sound Test Start");
        animal.sound();
        System.out.println("Animal Sound Test End");
    }
}
