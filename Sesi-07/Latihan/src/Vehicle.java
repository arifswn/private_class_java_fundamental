public class Vehicle {

    static class Car extends Vehicle {
        int speed = 0;

        void speedUp() {
            speed += 10;
        }
    }

    static class Bicycle extends Vehicle {
        int speed = 0;

        void speedUp() {
            speed += 5;
        }
    }
}
