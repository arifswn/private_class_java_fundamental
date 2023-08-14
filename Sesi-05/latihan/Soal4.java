import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        /*
         * Buatlah sebuah method untuk menghitung banyaknya kata dalam suatu kalimat
         * dengan ketentuan method sebagai berikut:
         * 
         * a.Method memiliki argumen berupa string
         * b.Method tidak memiliki return, cukup di print di dalam method
         * 
         */

        // input scan
        try (Scanner input = new Scanner(System.in)) {
            // deklarasi variable
            String kalimat;

            // input kalimat
            System.out.print("Masukkan kalimat: ");
            kalimat = input.nextLine();

            // panggil method
            hitungKata(kalimat);
        }
    }

    // hitungKata
    private static void hitungKata(String kalimat) {
        // deklarasi variable
        int jumlahKata = 0;

        // looping perulangan
        for (int i = 0; i < kalimat.length(); i++) {
            // jika kalimat.charAt(i) == ' '
            if (kalimat.charAt(i) == ' ') {
                // jumlahKata = jumlahKata + 1;
                jumlahKata++;
            }
        }

        // jumlahKata = jumlahKata + 1;
        jumlahKata++;

        // print jumlahKata
        System.out.println("Jumlah kata: " + jumlahKata);
    }

}
