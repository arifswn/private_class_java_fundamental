public class Soal4 {
    public static void main(String[] args) {
        /*
         * Soal 4
         * Write a Java program
         * to create a class called Shape with a method called getArea().
         * Create a
         * subclasscalled Rectangle that overrides the getArea() method to calculate the
         * area of a rectangle.
         */

        // Create an object of Rectangle class
        Rectangle rectangle = new Rectangle(10, 20);

        // Print the area of object.
        System.out.println(rectangle.getArea());

    }

    // Create a Shape class
    static class Shape {
        public int getArea() {
            return 0;
        }
    }

    // Create a Rectangle class
    static class Rectangle extends Shape {
        private int length;
        private int width;

        public Rectangle(int length, int width) {
            this.length = length;
            this.width = width;
        }

        // Override the getArea() method
        @Override
        public int getArea() {
            return length * width;
        }
    }
}
