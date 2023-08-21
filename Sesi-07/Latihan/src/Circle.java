public class Circle {

    //variabel private
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //calculate area
    public double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    //calculate perimeter
    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
}
