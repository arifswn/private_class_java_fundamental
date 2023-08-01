public class BooleanDataType {
    public static void main(String[] args) {
        /*
         * Boolean adalah tipe data yang hanya memiliki dua value,
         * yaitu benar atau salah.
         * Benar direpresentasikan sebagai true dan
         * salah direpresentasikan sebagai false.
         * 
         * Tipe data ini biasanya akan banyak muncul
         * ketika sudah mulai bermain dengan operator perbandingan matematika
         * dan logika pemrograman.
         */

        boolean benar = true;
        boolean salah = false;
        boolean isSmall = 15 < 20;
        boolean hasil = benar && salah;

        // penjelasan
        System.out.println("Benar : " + benar);
        System.out.println("Salah : " + salah);
        System.out.println("Is Small : " + isSmall);
        System.out.println("Hasil : " + hasil);
    }
}
