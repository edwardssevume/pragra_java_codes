public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car("Harrier", "Toyota", "Petrol Engine", "Black", 250.0);

        car1.name = "LandCruiser";
        car1.display();
    }
}
