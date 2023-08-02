import java.util.Scanner;

public class OperatorAritmatika {
    public static void main(String[] args) {
        // inisialisasi angka
        // tanpa mengisi angka dengan nilai
        // kita akan mengakses angka tersebut
        int angka1;
        int angka2;
        int hasil;

        // akses
        // akan menghasilkan error
        // karena kita belum mengisi angka dengan nilai
        // jadi angka tersebut masih kosong
        // kita tidak bisa mengakses angka yang kosong
        // diberikan nilai default
        // agar kita bisa mengakses angka tersebut

        // scanner digunakan untuk mengambil input dari user
        // untuk mengambil input dari user, kita harus mengimport library scanner
        // import java.util.Scanner; (lihat diatas)
        // untuk mengambil input dari user, kita harus membuat object scanner
        // Scanner input = new Scanner(System.in); (lihat dibawah)

        // try with resources
        // try with resources digunakan untuk menghandle error
        // try with resources digunakan untuk menghandle error pada saat mengambil input
        // dari user
        try (Scanner input = new Scanner(System.in)) {
            // output
            System.out.println("Program Operator Aritmatika");
            System.out.println("====================================");
            System.out.println("Penjumlahan");
            System.out.print("Masukkan angka pertama: ");
            // mengambil input dari user
            angka1 = input.nextInt();
            System.out.print("Masukkan angka kedua: ");
            // mengambil input dari user
            angka2 = input.nextInt();

            // penjumlahan
            hasil = angka1 + angka2;
            System.out.println("====================================");
            System.out.println("Hasil penjumlahan: " + (angka1 + angka2));

            // input dari user
            System.out.println("Penguangan");
            System.out.print("Masukkan angka pertama: ");
            angka1 = input.nextInt();
            System.out.print("Masukkan angka kedua: ");
            angka2 = input.nextInt();

            // pengurangan
            hasil = angka1 - angka2;
            System.out.println("====================================");
            System.out.println("Hasil pengurangan: " + hasil);

            // input dari user
            System.out.println("Perkalian");
            System.out.print("Masukkan angka pertama: ");
            angka1 = input.nextInt();
            System.out.print("Masukkan angka kedua: ");
            angka2 = input.nextInt();

            // perkalian
            hasil = angka1 * angka2;
            System.out.println("====================================");
            System.out.println("Hasil perkalian: " + hasil);

            // input dari user
            System.out.println("Pembagian");
            System.out.print("Masukkan angka pertama: ");
            angka1 = input.nextInt();
            System.out.print("Masukkan angka kedua: ");
            angka2 = input.nextInt();

            // pembagian
            hasil = angka1 / angka2;
            System.out.println("====================================");
            System.out.println("Hasil pembagian: " + hasil);

            // input dari user
            System.out.println("Modulus");
            System.out.print("Masukkan angka pertama: ");
            angka1 = input.nextInt();
            System.out.print("Masukkan angka kedua: ");
            angka2 = input.nextInt();

            // modulus
            hasil = angka1 % angka2;
            System.out.println("====================================");
            System.out.println("Hasil modulus: " + hasil);

            // input dari user
            System.out.println("Increment dan Decrement");
            System.out.print("Masukkan angka pertama: ");
            angka1 = input.nextInt();
            System.out.print("Masukkan angka kedua: ");
            angka2 = input.nextInt();

            // increment
            angka1++;
            System.out.println("====================================");
            System.out.println("Hasil increment: " + angka1);
            // decrement
            angka2--;
            System.out.println("====================================");
            System.out.println("Hasil decrement: " + angka2);

        }

    }
}
