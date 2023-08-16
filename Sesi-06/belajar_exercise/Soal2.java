public class Soal2 {
    public static void main(String[] args) {

        // Soal 2
        // Write a Java program to create a vehicle class hierarchy.

        // The base class should be Vehicle,
        // with sub classes Truck, Car and Motorcycle. Each subclass should have
        // properties such as make, model,year,and fuel type.

        // Implement methods for
        // calculating fuel efficiency, distance traveled, and maximumspeed.

        // deklerasi objek
        Vehicle truck = new Vehicle("Truck", "Hino", "2019", "Diesel");
        Vehicle car = new Vehicle("Car", "Toyota", "2019", "Pertamax");
        Vehicle motorcycle = new Vehicle("Motorcycle", "Honda", "2019", "Pertamax");

        // output
        System.out.println("Truck");
        truck.output();
        truck.fuelEfficiency(100, 2);
        System.out.println();

        System.out.println("Car");
        car.output();
        car.fuelEfficiency(100, 2);
        System.out.println();

        System.out.println("Motorcycle");
        motorcycle.output();
        motorcycle.fuelEfficiency(100, 2);
        System.out.println();

    }

    // class vehicle
    static class Vehicle {
        // deklarasi variabel
        String type;
        String make;
        String year;
        String fuelType;

        // constructor
        public Vehicle(String type, String make, String year, String fuelType) {
            this.type = type;
            this.make = make;
            this.year = year;
            this.fuelType = fuelType;
        }

        // insialisasi method distanceTraveled
        public void distanceTraveled(int speed, int time) {

            // hitung distance
            int distance = 0;
            distance = speed * time;

            System.out.println("Distance Traveled : " + distance);
        }

        // insialisasi method maximumSpeed
        public void maximumSpeed() {
            // hitung maximum speed
            int maximumSpeed = 0;
            if (type == "Truck") {
                maximumSpeed = 100;
            } else if (type == "Car") {
                maximumSpeed = 200;
            } else if (type == "Motorcycle") {
                maximumSpeed = 300;
            }

            System.out.println("Maximum Speed : " + maximumSpeed);
        }

        // hitung fuel efficiency, distance traveled, and maximumspeed. menggunakan
        // parameter
        public void fuelEfficiency(int speed, int time) {
            System.out.println("Fuel Efficiency");
            distanceTraveled(speed, time);
            maximumSpeed();
        }

        // output
        public void output() {
            System.out.println("Jenis Kendaraan : " + type);
            System.out.println("Make : " + make);
            System.out.println("Year : " + year);
            System.out.println("Fuel Type : " + fuelType);
        }
    }

}
