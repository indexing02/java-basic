package poly.car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car K3Car = new K3Car();

        driver.setK3Car(K3Car);
        driver.drive();

        //Model3Car로 차량 변경
        Model3Car Model3Car = new Model3Car();
        driver.setK3Car(null);
        driver.setModel3Car(Model3Car);
        driver.drive();
    }
}
