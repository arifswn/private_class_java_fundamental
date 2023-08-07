import java.util.Scanner;

public class cek_graduation {
    public static void main(String[] args) {
        // buat variabel dan scanner
        int nilai;
        String nama;
        try (Scanner scan = new Scanner(System.in)) {
            // mengambil input
            System.out.print("Nama: ");
            nama = scan.nextLine();
            System.out.print("Nilai: ");
            nilai = scan.nextInt();
        }

        // cek apakah dia lulus atau tidak
        // wajib nilai >= 70 untuk lulus
        if (nilai >= 70) {
            System.out.println("Selamat " + nama + ", anda lulus!");
        } else {
            System.out.println("Maaf " + nama + ", anda gagal!");
        }
    }
}
