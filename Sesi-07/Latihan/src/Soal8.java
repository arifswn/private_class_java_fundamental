public class Soal8 {
    public static void main(String[] args) {
        /*
         * Write a Java program to create a base class Shape with a method called
         * calculateArea().
         * Create threesubclasses: Circle, Rectangle, and Triangle.
         *
         * Override the calculateArea() method in each subclass tocalculate and return
         * the shape's area
         */

        // Create an object of Circle class & call calculateArea() method
        Shape.Circle circle = new Shape.Circle(2);
        System.out.println("Circle area: " + circle.calculateArea());

        // Create an object of Rectangle class & call calculateArea() method
        Shape.Rectangle rectangle = new Shape.Rectangle(2, 3);
        System.out.println("Rectangle area: " + rectangle.calculateArea());

        // Create an object of Triangle class & call calculateArea() method
        Shape.Triangle triangle = new Shape.Triangle(2, 3);
        System.out.println("Triangle area: " + triangle.calculateArea());


    }
}
