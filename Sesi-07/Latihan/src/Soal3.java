public class Soal3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,5);
        System.out.println("Length : "+rectangle.getLength());
        System.out.println("Width : "+rectangle.getWidth());

        rectangle.setLength(15);
        rectangle.setWidth(10);
        System.out.println("Length : "+rectangle.getLength());
        System.out.println("Width : "+rectangle.getWidth());
    }
}
