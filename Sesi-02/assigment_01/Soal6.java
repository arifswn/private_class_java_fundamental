public class Soal6 {
    public static void main(String[] args) {
        /*
         * No. 1
         * Buatlah variabel dengan ketentuan sebagai berikut:
         * a.Distance (in meter): memiliki tipe data number.
         * Misalkan data yang dimasukkan adalah 5, maka data
         * jaraknya berarti 5 meter.
         * 
         * b.Duration (in minutes): memiliki tipe data number.
         * Misalkan data yang dimasukkan adalah 10, maka data durasinya adalah 10
         * menit2.
         * 
         * No. 2
         * Print lah ke dalam terminal
         * Kecepatan kendaraan adalah [kecepatan] km/jam
         * 
         * Perhatikan satuannya dan buatlah program untuk mengkonversi distance
         * ke km dan duration ke jam dan hitung kecepatannya.
         */

        // print kecepatan kendaraan
        System.out.println("Soal nomor 1");
        System.out.println("============");
        System.out.println("Jawaban nomor 1 soal a");
        // soal nomor 1
        // jawban nomor 1. a
        // deklarasi variabel
        double distance = 0;
        // inisialisasi variabel km
        // rumus konversi km ke m
        // 1 km = 1000 m
        distance = 1000;
        // print jarak
        System.out.printf("Distance: %.0f meter\n", distance);

        // jawaban nomor 1. b
        // deklarasi variabel
        double duration = 0;
        // inisialisasi variabel
        duration = 1000;
        // print durasi
        System.out.printf("Duration: %.0f minutes\n", duration);

        // soal nomor 2
        // jawaban nomor 2
        // deklarasi variabel
        double kecepatan = 0;
        // inisialisasi variabel
        // rumus kecepatan
        // kecepatan = jarak / waktu
        // kecepatan = distance / duration
        kecepatan = distance / duration;
        // print kecepatan kendaraan
        System.out.println("\nSoal nomor 2");
        System.out.println("============");
        // distance konversi ke km
        // 1 km = 1000 m
        distance = distance / 1000;
        // duration konversi ke jam
        // 1 jam = 60 menit
        duration = duration / 60;
        // print jarak
        System.out.println("Mengkonversi distance ke km dan duration ke jam dan hitung kecepatannya");
        System.out.println("====================================================================");
        // distance
        System.out.printf("Distance: %.0f km\n", distance);
        // convert ke meter
        System.out.printf("Distance: %.0f meter\n", distance * 1000);
        // duration
        System.out.printf("Duration: %.0f minutes\n", duration);
        // kecepatan
        System.out.printf("Kecepatan kendaraan adalah %.0f km/jam\n", kecepatan);

        // print semua
        System.out.println("\nMengkonversi distance ke km dan duration ke jam dan hitung kecepatannya");
        System.out.println("====================================================================");
        System.out.printf(
                "Jarak tempuh dalam meter: %.0f meter\ndi konversi km: %.0f km \ndengan durasi %.0f menit \njarak tempuh waktu %.0f jam %.0f menit \ndengan kecepatan %.0f km/jam\n",
                distance * 1000, distance, duration, duration / 60, duration % 60, kecepatan);

        // kecepatan kendaraan nya adalah
        System.out.printf("Kecepatan kendaraan adalah %.0f km/jam\n", kecepatan);
        // rumus
        // 1 km = 1000 m
        // 1 menit = 60 detik
        // 1 jam = 60 menit
        // 1 jam = 3600 detik
    }
}
