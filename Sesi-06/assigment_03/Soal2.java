public class Soal2 {
    /*
     * Soal 2
     * Buatlah method untuk menentukan apakah sebuah string palindrom atau tidak.
     * Parameter
     * dari method tersebut adalah string dan return dari method tersebut adalah
     * boolean (true jika palindrom dan false jikabukan palindrom)
     * Contoh:
     * Input: Anna
     * Output: true
     */

    public static void main(String[] args) {
        // deklarasi variabel

        // input nilai
        String kata = "Anna";
        // proses
        boolean hasil = palindrom(kata);
        // output
        System.out.println(hasil);

    }

    public static boolean palindrom(String kata) {
        // deklarasi variabel
        boolean hasil = false;
        String kata2 = "";
        // proses
        for (int i = kata.length() - 1; i >= 0; i--) {
            kata2 += kata.charAt(i);
        }
        if (kata.equalsIgnoreCase(kata2)) {
            hasil = true;
        }
        // output
        return hasil;
    }
}
