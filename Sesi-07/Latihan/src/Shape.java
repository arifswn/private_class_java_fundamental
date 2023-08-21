public class Shape {

    static class Circle {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    static class Rectangle {
        double length;
        double width;

        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        double calculateArea() {
            return length * width;
        }
    }

    static class Triangle {
        double base;
        double height;

        Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        double calculateArea() {
            return 0.5 * base * height;
        }
    }

}
