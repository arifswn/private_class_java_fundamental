import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        // Buatlah sebuah method untuk menghitung banyaknya huruf vokal dalam suatu
        // string.

        // Ketentuan dari method:
        // a.Argumen yang dimasukkan adalah string
        // b.Return value adalah integer (menunjukkan berapa huruf vokal dalam satu
        // string)

        // Misalkan:Input: “I love coding”
        // Output: 5

        // input scan
        try (Scanner input = new Scanner(System.in)) {
            // deklarasi variable
            String kalimat;

            // input kalimat
            System.out.print("Masukkan kalimat: ");
            kalimat = input.nextLine();

            // panggil method
            System.out.println("Jumlah huruf vokal dalam kalimat adalah " + jumlahVokal(kalimat));
        }

    }

    // jumlahVokal
    private static int jumlahVokal(String kalimat) {
        // deklarasi variable
        int jumlah = 0;

        // looping perulangan
        for (int i = 0; i < kalimat.length(); i++) {
            // jika kalimat.charAt(i) == 'a' atau 'i' atau 'u' atau 'e' atau 'o'
            if (kalimat.charAt(i) == 'a' || kalimat.charAt(i) == 'i' || kalimat.charAt(i) == 'u'
                    || kalimat.charAt(i) == 'e' || kalimat.charAt(i) == 'o') {
                // jumlah = jumlah + 1;
                jumlah++;
            }
        }

        // return jumlah
        return jumlah;
    }
}
