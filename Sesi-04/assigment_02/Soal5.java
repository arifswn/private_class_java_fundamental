public class Soal5 {
    public static void main(String[] args) {
        // Tentukan angka terbesar dari sebuah array dan print hasilnya ke dalam
        // terminal.

        // Deklarasi variabel
        // contoh input
        int[] numbers = { 1, 3, 4, 2, 5 };
        int[] numbers2 = { 5, 3, 1, 2, 4 };

        // cetak angka terbesar numbers with method
        System.out.println("Angka terbesar dari array numbers adalah " + angkaTerbesar(numbers));
        // cetak angka terbesar numbers2 with method
        System.out.println("Angka terbesar dari array numbers2 adalah " + angkaTerbesar(numbers2));
    }

    // angka terbesar
    private static int angkaTerbesar(int[] numbers) {
        // deklarasi variabel
        int angkaTerbesar = 0;

        // looping perulangan
        for (int i = 0; i < numbers.length; i++) {
            // cek jika angkaTerbesar lebih kecil dari numbers[i]
            if (angkaTerbesar < numbers[i]) {
                // angkaTerbesar = numbers[i];
                angkaTerbesar = numbers[i];
            }
        }

        // return angkaTerbesar
        return angkaTerbesar;
    }
}
