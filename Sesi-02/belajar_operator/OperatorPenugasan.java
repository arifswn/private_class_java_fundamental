
public class OperatorPenugasan {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int c = 2;
        int d = 1;
        int e = 1;

        if (a == 2) {
            a = 10; // a = 10
            b += 1; // a = a + 1 = 10 + 1 = 11
            c -= 1; // a = a - 1 = 11 - 1 = 10
            d *= 2; // a = a * 2 = 10 * 2 = 20
            e /= 2; // a = a / 2 = 20 / 2 = 10
            System.out.println("Variabel a: " + a + " mempunyai nilai 10, dengan operator penugasan a = 10");
            System.out.println("Variabel b: " + b + " mempunyai nilai 11, dengan operator penugasan b += 1");
            System.out.println("Variabel c: " + c + " mempunyai nilai 10, dengan operator penugasan c -= 1");
            System.out.println("Variabel d: " + d + " mempunyai nilai 20, dengan operator penugasan d *= 2");
            System.out.println("Variabel e: " + e + " mempunyai nilai 10, dengan operator penugasan e /= 2");

        } else {
            System.out.println("Hasil tidak ditemukan");
        }

        // tahap ke 2
        // assign nilai
        a = 5;
        b = 10;

        // penambahan
        b += a; // b = b + a = 10 + 5 = 15
        System.out.println("Variabel b: " + b + " mempunyai nilai 15, dengan operator penugasan b += a");
        // output
        System.out.println("Hasil penambahan: " + b);

        // pengurangan
        b -= a; // b = b - a = 15 - 5 = 10
        System.out.println("Variabel b: " + b + " mempunyai nilai 10, dengan operator penugasan b -= a");
        // output
        System.out.println("Hasil pengurangan: " + b);

        // perkalian
        b *= a; // b = b * a = 10 * 5 = 50
        System.out.println("Variabel b: " + b + " mempunyai nilai 50, dengan operator penugasan b *= a");
        // output
        System.out.println("Hasil perkalian: " + b);

        // pembagian
        b /= a; // b = b / a = 50 / 5 = 10
        System.out.println("Variabel b: " + b + " mempunyai nilai 10, dengan operator penugasan b /= a");
        // output
        System.out.println("Hasil pembagian: " + b);

        // modulus
        b %= a; // b = b % a = 10 % 5 = 0
        System.out.println("Variabel b: " + b + " mempunyai nilai 0, dengan operator penugasan b %= a");
        // output
        System.out.println("Hasil modulus: " + b);

    }
}
