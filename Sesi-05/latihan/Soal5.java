import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        /*
         * Buatlah method changeVocals, reverseWord, setLowerUpperCase, removeSpaces,
         * dan passwordGenerator
         * Pada method passwordGenerator implementasikan
         * requirement dibawah ini untuk membuat password (harus berurutan):
         * 
         * ●Ganti semua huruf vokal menggunakan method changeVocals dengan aturan huruf
         * vokal yang
         * diganti akan menjadi huruf setelah huruf vokal itu (ex: a -> b, i -> j, u ->
         * v, e -> f, o -> p, A -> B, I -> J, U -> V, E -> F, O -> P)
         * 
         * ●Balikkan/reverse kata yang sudah kita ganti huruf vokalnya menggunakan
         * reverseWord
         * ●Gunakan method setLowerUpperCase untuk mengganti huruf besar menjadi kecil
         * dan sebaliknya
         * ●Gunakan method removeSpaces untuk menghilangkan semua spasi di dalam string
         * yang sudah kita manipulasi
         */

        // inputan scan
        try (Scanner input = new Scanner(System.in)) {
            // deklarasi variable
            String password;

            // input password
            System.out.print("Masukkan password: ");
            password = input.nextLine();

            // panggil method
            System.out.println(passwordGenerator(password));
        }
    }

    // passwordGenerator
    private static String passwordGenerator(String password) {
        // deklarasi variable
        String passwordBaru = "";

        // ganti huruf vokal
        passwordBaru = changeVocals(password);

        // balik kata
        passwordBaru = reverseWord(passwordBaru);

        // set lower upper case
        passwordBaru = setLowerUpperCase(passwordBaru);

        // remove spaces
        passwordBaru = removeSpaces(passwordBaru);

        // return passwordBaru
        return passwordBaru;
    }

    // changeVocals
    private static String changeVocals(String password) {
        // deklarasi variable
        String passwordBaru = "";

        // looping perulangan
        for (int i = 0; i < password.length(); i++) {
            // jika password.charAt(i) == 'a' atau 'i' atau 'u' atau 'e' atau 'o'
            if (password.charAt(i) == 'a' || password.charAt(i) == 'i' || password.charAt(i) == 'u'
                    || password.charAt(i) == 'e' || password.charAt(i) == 'o') {
                // passwordBaru = passwordBaru + (char) (password.charAt(i) + 1);
                passwordBaru += (char) (password.charAt(i) + 1);
            } else if (password.charAt(i) == 'A' || password.charAt(i) == 'I' || password.charAt(i) == 'U'
                    || password.charAt(i) == 'E' || password.charAt(i) == 'O') {
                // passwordBaru = passwordBaru + (char) (password.charAt(i) + 1);
                passwordBaru += (char) (password.charAt(i) + 1);
            } else {
                // passwordBaru = passwordBaru + password.charAt(i);
                passwordBaru += password.charAt(i);
            }
        }

        // return passwordBaru
        return passwordBaru;
    }

    // reverseWord
    private static String reverseWord(String password) {
        // deklarasi variable
        String passwordBaru = "";

        // looping perulangan
        for (int i = password.length() - 1; i >= 0; i--) {
            // passwordBaru = passwordBaru + password.charAt(i);
            passwordBaru += password.charAt(i);
        }

        // return passwordBaru
        return passwordBaru;
    }

    // setLowerUpperCase
    private static String setLowerUpperCase(String password) {
        // deklarasi variable
        String passwordBaru = "";

        // looping perulangan
        for (int i = 0; i < password.length(); i++) {
            // jika password.charAt(i) >= 'a' dan password.charAt(i) <= 'z'
            if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
                // passwordBaru = passwordBaru + (char) (password.charAt(i) - 32);
                passwordBaru += (char) (password.charAt(i) - 32);
            } else if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                // passwordBaru = passwordBaru + (char) (password.charAt(i) + 32);
                passwordBaru += (char) (password.charAt(i) + 32);
            } else {
                // passwordBaru = passwordBaru + password.charAt(i);
                passwordBaru += password.charAt(i);
            }
        }

        // return passwordBaru
        return passwordBaru;
    }

    // removeSpaces
    private static String removeSpaces(String password) {
        // deklarasi variable
        String passwordBaru = "";

        // looping perulangan
        for (int i = 0; i < password.length(); i++) {
            // jika password.charAt(i) != ' '
            if (password.charAt(i) != ' ') {
                // passwordBaru = passwordBaru + password.charAt(i);
                passwordBaru += password.charAt(i);
            }
        }

        // return passwordBaru
        return passwordBaru;
    }
}
