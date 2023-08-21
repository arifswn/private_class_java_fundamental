public class Soal7 {
    public static void main(String[] args) {
        /*
         * Write a Java program to create a class Vehicle with a method called
         * speedUp().
         * Create two subclasses Carand Bicycle.
         * Override the speedUp()
         * method in each subclass to increase the vehicle's speed differently
         */

        Vehicle.Car car = new Vehicle.Car();
        Vehicle.Bicycle bicycle = new Vehicle.Bicycle();

        car.speedUp();
        bicycle.speedUp();

        System.out.println("Car speed: " + car.speed);
        System.out.println("Bicycle speed: " + bicycle.speed);

    }
}
