import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        /*
         * Buatlah sebuah method untuk melakukan validasi sebuah password dengan
         * ketentuan password yang valid atau tidak
         * 
         * a.Password harus terdiri dari minimal 8 karakter (termasuk spasi)
         * b.Password harus memiliki huruf, angka, dan karakter
         * 
         * Ketentuan method adalah sebagai berikut:
         * a.Argumen berupa string
         * b.Output adalah boolean (true jika password valid dan false jika
         * password tidak valid)
         * 
         * Contoh:Input: 12345SDF%%
         * Output: true
         * 
         * Input: ABC1$$
         * Output: false
         * 
         */

        // input scan
        try (Scanner input = new Scanner(System.in)) {
            // deklarasi variable
            String password;

            // input password
            System.out.print("Masukkan password: ");
            password = input.nextLine();

            // panggil method
            System.out.println(validasiPassword(password));
        }
    }

    // validasiPassword
    private static boolean validasiPassword(String password) {
        // deklarasi variable
        boolean valid = false;
        int jumlahHuruf = 0;
        int jumlahAngka = 0;
        int jumlahKarakter = 0;

        // looping perulangan
        for (int i = 0; i < password.length(); i++) {
            // jika password.charAt(i) >= 'a' dan password.charAt(i) <= 'z'
            if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                // jumlahHuruf = jumlahHuruf + 1;
                jumlahHuruf++;
            }
            // jika password.charAt(i) >= '0' dan password.charAt(i) <= '9'
            if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                // jumlahAngka = jumlahAngka + 1;
                jumlahAngka++;
            }
            // jika password.charAt(i) >= '!' dan password.charAt(i) <= '/'
            // atau password.charAt(i) >= ':' dan password.charAt(i) <= '@'
            // atau password.charAt(i) >= '[' dan password.charAt(i) <= '`'
            // atau password.charAt(i) >= '{' dan password.charAt(i) <= '~'
            if (password.charAt(i) >= '!' && password.charAt(i) <= '/'
                    || password.charAt(i) >= ':' && password.charAt(i) <= '@'
                    || password.charAt(i) >= '[' && password.charAt(i) <= '`'
                    || password.charAt(i) >= '{' && password.charAt(i) <= '~') {
                // jumlahKarakter = jumlahKarakter + 1;
                jumlahKarakter++;
            }
        }

        // jika password.length() >= 8 dan jumlahHuruf > 0 dan jumlahAngka > 0 dan
        // jumlahKarakter > 0
        if (password.length() >= 8 && jumlahHuruf > 0 && jumlahAngka > 0 && jumlahKarakter > 0) {
            // valid = true;
            valid = true;
        }

        // return valid
        return valid;
    }
}
