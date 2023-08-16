public class Soal5 {
    public static void main(String[] args) {

        /*
         * Soal 5
         * Write a Java program to create a class called Shape
         * with methods called getPerimeter() and getArea().
         * Create a subclass called
         * Circle that overrides the getPerimeter() and getArea() methods to calculate
         * thearea and perimeter of a circle.
         */

        // Create an object of Circle class
        Circle circle = new Circle(10);

        // Print the area of object.
        System.out.println(circle.getArea());

    }

    // Create a Shape class
    static class Shape {
        public int getPerimeter() {
            return 0;
        }

        public int getArea() {
            return 0;
        }
    }

    // Create a Circle class
    static class Circle extends Shape {
        private int radius;

        public Circle(int radius) {
            this.radius = radius;
        }

        // Override the getPerimeter() method
        @Override
        public int getPerimeter() {
            return (int) (2 * Math.PI * radius);
        }

        // Override the getArea() method
        @Override
        public int getArea() {
            return (int) (Math.PI * radius * radius);
        }
    }
}
