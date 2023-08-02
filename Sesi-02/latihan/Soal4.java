import java.util.Arrays;

public class Soal4 {
    public static void main(String[] args) {
        /*
         * Dalam suatu kelas yang terdiri dari 10 siswa,
         * mereka dibagi menjadi 5
         * kelompok dengan pembagian sebagai berikut
         * a.Rudi, Budi, Lila
         * b.Erika, Nina
         * c.Lisa, Anna
         * d.Didit, Resti, Hana
         * e.Lina, Rina, Dina, Tina, Sari
         * 
         * Jadikan pembagian kelompok tersebut
         * menjadi array multidimensional
         * 
         */

        // deklarasi variabel
        String[][] kelompok = new String[5][];
        // inisialisasi variabel
        kelompok[0] = new String[] { "Rudi", "Budi", "Lila" };
        kelompok[1] = new String[] { "Erika", "Nina" };
        kelompok[2] = new String[] { "Lisa", "Anna" };
        kelompok[3] = new String[] { "Didit", "Resti", "Hana" };
        kelompok[4] = new String[] { "Lina", "Rina", "Dina", "Tina", "Sari" };

        // atau bisa juga seperti ini
        // String[][] kelompok = {
        // { "Rudi", "Budi", "Lila" },
        // { "Erika", "Nina" },
        // { "Lisa", "Anna" },
        // { "Didit", "Resti", "Hana" }
        // { "Lina", "Rina", "Dina", "Tina", "Sari" }
        // };

        // print kelompok
        System.out.println("Kelompok");
        System.out.println("========");
        System.out.println("a. " + kelompok[0][0] + ", " + kelompok[0][1] + ", " + kelompok[0][2]);
        System.out.println("b. " + kelompok[1][0] + ", " + kelompok[1][1]);
        System.out.println("c. " + kelompok[2][0] + ", " + kelompok[2][1]);
        System.out.println("d. " + kelompok[3][0] + ", " + kelompok[3][1] + ", " + kelompok[3][2]);
        System.out.println("e. " + kelompok[4][0] + ", " + kelompok[4][1] + ", " + kelompok[4][2] + ", "
                + kelompok[4][3] + ", " + kelompok[4][4]);

        // pemisah
        System.out.println("\n========================================\n");
        // atau print semua data
        System.out.println("Mengakses data menggunakan for loop");
        // atau menggunakan for loop
        for (int i = 0; i < kelompok.length; i++) {
            System.out.println("Kelompok ke-" + (i + 1));
            for (int j = 0; j < kelompok[i].length; j++) {
                System.out.println("Anggota ke-" + (j + 1) + ": " + kelompok[i][j]);
            }
            System.out.println();
        }

        // atau bisa juga dengan Arrays.toString
        // menggunakan for loop untuk menampilkan semua data
        // menampilakn semua data menggunakan format dan Arrays.toString
        System.out.println("\n========================================\n");
        System.out.println("Mengakses data menggunakan format dan Arrays.toString");
        for (int i = 0; i < kelompok.length; i++) {
            System.out.println("Kelompok ke-" + (i + 1));
            System.out.printf(String.format("%s\n", Arrays.toString(kelompok[i])));
            System.out.println();
        }

    }
}
