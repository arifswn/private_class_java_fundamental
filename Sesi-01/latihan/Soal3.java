
public class Soal3 {
    public static void main(String[] args) {
        /*
         * Soal 3
         * 1. Buatlah dua variabel dengan tipe data number, masukkan data sesuka Anda.
         * 2.Bandingkan apakah variabel satu lebih kecil daripada variabel dua.
         * 3.Print hasilnya ke dalam terminal (hasil print berupa boolean: true atau
         * false)
         */

        // ini jawaban soal no 1
        int iniInt1 = 10;
        int iniInt2 = 20;
        System.out.println("Ini Int 1 : " + iniInt1);
        System.out.println("Ini Int 2 : " + iniInt2);

        // ini jawaban soal no 2
        System.out.printf("Apakah %d lebih kecil dari %d ? %b", iniInt1, iniInt2, iniInt1 < iniInt2);

        // ini jawaban soal no 3
        System.out.println("\nHasilnya adalah : " + (iniInt1 < iniInt2));
    }
}
