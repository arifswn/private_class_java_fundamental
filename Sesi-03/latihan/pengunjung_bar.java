import java.util.Scanner;

public class pengunjung_bar {
    public static void main(String[] args) {

        /*
         * latihan
         * 1. Jika name dari si pengunjung kosong, tampilkan di terminal
         * "Anda tidak boleh masuk!" dan program selesai. Jika name tidak kosong, lanjut
         * ke step ke 2.
         * 
         * 2. Jika age dari si pengunjung dibawah 17 tahun, maka ia hanya
         * boleh memesan juice. Jika age 17 tahun keatas, ia hanya boleh memesan
         * anggur.
         * 
         * 3. Juice memiliki harga 50000, sedangkan anggur memiliki harga
         * 300000.
         * 
         * 4. Jika money/uang yang dimiliki tidak mencukupi, maka tampilkan di
         * console "Uang tidak cukup. Anda harus pulang.". Jika uang cukup, tampilkan
         * "Anda bisa pesan minum. Sisa uang anda: [...]", dan ganti [...] dengan sisa
         * uang yang telah dikurangi oleh harga minuman.
         */

        // buat variabel
        String name;
        int age;
        int money;

        try (// buat scanner
                Scanner scan = new Scanner(System.in)) {
            // jawaban no. 1
            System.out.print("Nama: ");
            name = scan.nextLine();

            if (name.isEmpty()) {
                System.out.println("Anda tidak boleh masuk!");
                System.exit(0);
            }

            // jawaban no. 2
            System.out.print("Umur: ");
            age = scan.nextInt();

            // set jenis minuman
            String minuman;
            // kondisi nomor 2
            if (age < 17) {
                minuman = "Juice";
                System.out.println("Anda hanya boleh memesan " + minuman);
            } else {
                minuman = "Anggur";
                System.out.println("Anda hanya boleh memesan " + minuman);
            }

            // jawaban no. 3
            switch (minuman) {
                case "Juice":
                    money = 50000;
                    break;
                case "Anggur":
                    money = 300000;
                    break;
                default:
                    money = 0;
                    break;
            }
            System.out.println("Harga " + minuman + " adalah: " + money);

            // jawaban no. 4
            System.out.print("Uang: ");
            int uang = scan.nextInt();

            // kondisi nomor 4
            if (uang < money) {
                System.out.println("Uang tidak cukup. Anda harus pulang.");
            } else {
                System.out.println("Anda bisa pesan minum. Sisa uang anda: " + (uang - money));
            }
        }

    }
}
