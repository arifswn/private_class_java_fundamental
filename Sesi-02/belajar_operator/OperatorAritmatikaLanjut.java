
public class OperatorAritmatikaLanjut {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        // penjumlahan
        System.out.println("Penjumlahan");
        System.out.println("x + y = " + (x + y));
        // pengurangan
        System.out.println("Pengurangan");
        System.out.println("x - y = " + (x - y));
        // perkalian
        System.out.println("Perkalian");
        System.out.println("x * y = " + (x * y));
        // pembagian
        System.out.println("Pembagian");
        System.out.println("x / y = " + (x / y));
        // modulus
        System.out.println("Modulus");
        System.out.println("x % y = " + (x % y));
        // increment
        System.out.println("Increment");
        System.out.println("x++ = " + (x++));
        System.out.println("x = " + x);
        // decrement
        System.out.println("Decrement");
        System.out.println("x-- = " + (x--));
        System.out.println("x = " + x);
        // unary minus
        System.out.println("Unary Minus");
        System.out.println("-x = " + (-x));
        // unary plus
        System.out.println("Unary Plus");
        System.out.println("+x = " + (+x));
        // unary increment
        System.out.println("Unary Increment");
        System.out.println("++x = " + (++x));
        // unary decrement
        System.out.println("Unary Decrement");
        System.out.println("--x = " + (--x));

        // perbedeaan x++ dan ++x
        // x++ = x + 1
        // ++x = x + 1
        // x++ = x + 1
        // ++x = x + 1

        // x = 10
        // x++ = 10 + 1 = 11

        // x = 10
        // ++x = 10 + 1 = 11

        // x = 10
        // x-- = 10 - 1 = 9

        // x = 10
        // --x = 10 - 1 = 9

        System.out.println("====================================");
        System.out.println("Perbedaan x++ dan ++x");
        System.out.println("====================================");

        // x = 10
        System.out.println("x = " + x);
        System.out.println("x++ = " + (x++));

        // x = 11
        // ++x = 11 + 1 = 12
        System.out.println("x = " + x);
        System.out.println("++x = " + (++x));

        // x = 12

        // x-- = 12 - 1 = 11
        System.out.println("x = " + x);
        x--;
        System.out.println("x-- = " + (x--));

        // x = 11
        // --x = 11 - 1 = 10
        System.out.println("x = " + x);
        System.out.println("--x = " + (--x));

    }
}
