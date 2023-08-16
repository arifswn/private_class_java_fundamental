public class Soal1 {
    public static void main(String[] args) {
        /*
         * Soal 1
         * Buatlah method yang membedakan angka genap dan ganjil.
         * 
         * Parameter dari method tersebut adalah sebuahangka (integer) dan output dari
         * method tersebut adalah
         * string (“ganjil” dan “genap”)
         * 
         * Contoh:
         * Input: 3
         * Output: “ganjil”
         * 
         * 
         */

        // Jawaban
        int angka = 3;
        if (angka % 2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }

    }
}
