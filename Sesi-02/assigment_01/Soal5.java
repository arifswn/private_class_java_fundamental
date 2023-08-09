public class Soal5 {
    public static void main(String[] args) {
        /*
         * Soal 5
         * 1.Buatlah sebuah variabel dengan nama minutes
         * dengan tipe data number.
         * 
         * 2.Buatlah program untuk mengkonversi menit ke detik
         * dan print-lah hasilnya ke dalam terminal
         * 
         */

        // nomor 1
        // deklarasi variabel
        int minutes = 30;
        int seconds = 20;

        // print variabel
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);

        // nomor 2
        // rumus konversi menit ke detik
        // 1 menit = 60 detik
        seconds = minutes * 60;

        // print hasil konversi
        System.out.println("Hasil konversi menit ke detik");
        System.out.printf("%d menit = %d detik\n", minutes, seconds);

    }
}
