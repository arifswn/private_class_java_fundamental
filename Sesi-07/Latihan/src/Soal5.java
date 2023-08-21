public class Soal5 {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        System.out.println("Circle Radius : "+circle.getRadius());

        //modify value
        circle.setRadius(7);
        //print area
        System.out.println("Area : "+circle.calculateArea());
        //print perimeter
        System.out.println("Perimeter : "+circle.calculatePerimeter());
    }
}
