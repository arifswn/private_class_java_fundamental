import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        // Seorang pengajar sedang memeriksa ujian mahasiswa dan akan memberikan desc
        // nilai dari A-E dengan ketentuan sebagai berikut:

        // - Nilai 80 - 100: A
        // - Nilai 65 - 79: B
        // - Nilai 50 - 64: C
        // - Nilai 35 - 49: D
        // - Nilai 0 - 34: E

        // Tampilkan desc
        // nilai dan nama siswa saat pengajar tersebut memasukkan nilai dan nama yang
        // dia inginkan.

        // Contoh 1:
        // String nama = “Andhika”
        // int nilai = 100
        // output yang diharapkan nama: Andhika; score: A

        // jawaban
        // input
        try (Scanner input = new Scanner(System.in)) {
            // input nama
            System.out.print("Masukkan nama: ");
            String nama = input.nextLine();

            // cek nama
            if (nama.isEmpty()) {
                System.out.println("Nama tidak boleh kosong");
                System.exit(0);
            }

            // cek jika nama mengandung angka
            if (nama.matches(".*\\d.*")) {
                System.out.println("Nama tidak boleh mengandung angka");
                System.exit(0);
            }

            // cek jika nama bukan Andhika
            if (!nama.equals("Andhika")) {
                System.out.println("Nama harus Andhika");
                System.exit(0);
            }

            System.out.print("Masukkan nilai: ");
            int nilai = input.nextInt();

            // percabangan
            if (nilai >= 80 && nilai <= 100) {
                System.out.println("Nama: " + nama + "; Score: A");
            } else if (nilai >= 65 && nilai <= 79) {
                System.out.println("Nama: " + nama + "; Score: B");
            } else if (nilai >= 50 && nilai <= 64) {
                System.out.println("Nama: " + nama + "; Score: C");
            } else if (nilai >= 35 && nilai <= 49) {
                System.out.println("Nama: " + nama + "; Score: D");
            } else if (nilai >= 0 && nilai <= 34) {
                System.out.println("Nama: " + nama + "; Score: E");
            } else {
                System.out.println("Nilai tidak valid");
            }
        }

    }
}
