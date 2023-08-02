public class Soal3 {
    public static void main(String[] args) {
        /*
         * Buatlah sebuah array yang menampung data-data berikut: 1, 2, 10, 12
         * Hitunglah rata-rata dari angka-angka dalam array tersebut.
         * 
         * Akseslah angka-angka di dalam array tersebut
         * menggunakan indeks dan manfaatkan
         * function length untuk mengetahui panjang array
         */

        // deklarasi variabel
        int[] listAngka = new int[] { 1, 2, 10, 12 };
        int total = 0;
        double rataRata = 0;

        // print list angka
        System.out.println("List Angka");
        System.out.println("==========");
        System.out.println("a. " + listAngka[0]);
        System.out.println("b. " + listAngka[1]);
        System.out.println("c. " + listAngka[2]);
        System.out.println("d. " + listAngka[3]);

        // pemisah
        System.out.println("\n========================================\n");
        System.out.println("Mengakses data menggunakan for loop");
        // atau menggunakan for loop
        for (int i = 0; i < listAngka.length; i++) {
            System.out.println("Angka ke-" + (i + 1) + ": " + listAngka[i]);
            total += listAngka[i];
        }

        System.out.println("\n========================================\n");

        // hitung rata-rata
        rataRata = total / listAngka.length;
        System.out.println("Rata-rata: " + rataRata);

        // penjang array
        System.out.println("Panjang array: " + listAngka.length);

    }
}
