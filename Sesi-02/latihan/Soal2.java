import java.util.Arrays;

public class Soal2 {
    public static void main(String[] args) {
        /*
         * Buatlah sebuah array untuk menampung list berikut
         * dengan urutan yang sama:
         * a.Harry Potter
         * b.Lord of the Rings
         * c.The Hobbit
         * d.Pirates of the Caribbean
         * 
         * Bagaimana Anda bisa mengakses data Pirates of the Caribbean?
         */

        // deklarasi variabel
        String[] listFilm = new String[4];
        // inisialisasi variabel
        listFilm[0] = "Harry Potter";
        listFilm[1] = "Lord of the Rings";
        listFilm[2] = "The Hobbit";
        listFilm[3] = "Pirates of the Caribbean";

        // print list film
        System.out.println("List Film");
        System.out.println("=========");
        System.out.println("a. " + listFilm[0]);
        System.out.println("b. " + listFilm[1]);
        System.out.println("c. " + listFilm[2]);
        System.out.println("d. " + listFilm[3]);

        // untuk mengakses data Pirates of the Caribbean
        // kita bisa menggunakan index ke 3
        // outpu
        System.out.println("\nMengakses data Pirates of the Caribbean");
        System.out.println("Pirates of the Caribbean: " + listFilm[3]);
        // print menggunakan format semua data
        System.out.printf("\nOutput dengan format semua data\n");
        System.out.printf(String.format("%s\n", Arrays.toString(listFilm)));

        // pemisah
        System.out.println("========================================");

        // tahap ke 2
        // deklarasi variabel
        String[] listFilm2 = {
                "Harry Potter",
                "Lord of the Rings",
                "The Hobbit",
                "Pirates of the Caribbean"
        };

        // print list film
        System.out.println("\nList Film");
        System.out.println("=========");
        // print menggunakan format semua data
        System.out.printf("Output dengan format semua data\n");
        System.out.printf(String.format("%s\n", Arrays.toString(listFilm2)));

        // pemisah
        // mengakses data Pirates of the Caribbean
        System.out.println("\nMengakses data Pirates of the Caribbean");
        // untuk mengakses data Pirates of the Caribbean
        // kita bisa menggunakan index ke 3
        System.out.println("Pirates of the Caribbean: " + listFilm2[3]);
        // atau
        System.out.println("Pirates of the Caribbean: " + listFilm2[listFilm2.length - 1]);
    }
}
