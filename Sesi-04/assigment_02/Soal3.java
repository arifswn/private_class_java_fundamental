public class Soal3 {
    public static void main(String[] args) {
        // Buatlah sebuah program untuk menentukan apakahsuatu array adalah deret
        // geometri atau bukan. Printhasilnya ke dalam terminal.

        // apa itu deret geometri?
        // deret geometri adalah deret yang memiliki beda yang sama
        // contoh deret geometri
        // 1, 3, 9, 27, 81
        // 2, 4, 8, 16, 32

        // pengertian
        // beda 1 > ke 3 = 3 / 1 = 3
        // beda 3 > ke 9 = 9 / 3 = 3
        // beda 9 > ke 27 = 27 / 9 = 3
        // beda 27 > ke 81 = 81 / 27 = 3

        // beda 2 > ke 4 = 4 / 2 = 2
        // beda 4 > ke 8 = 8 / 4 = 2
        // beda 8 > ke 16 = 16 / 8 = 2
        // beda 16 > ke 32 = 32 / 16 = 2

        // contoh input
        int[] numbers1 = { 1, 3, 9, 27, 81 };

        // contoh input
        int[] numbers2 = { 2, 4, 8, 16, 32 };

        // contoh input
        int[] numbers3 = { 2, 4, 6, 8 };

        // contoh input
        int[] numbers4 = { 2, 6, 18, 54 };

        // contoh input
        int[] numbers5 = { 1, 2, 3, 4, 7, 9 };

        // cetak numbers1
        System.out.println("Array numbers1 adalah " + isGeometri(numbers1));

        // cetak numbers2
        System.out.println("Array numbers2 adalah " + isGeometri(numbers2));

        // cetak numbers3
        System.out.println("Array numbers3 adalah " + isGeometri(numbers3));

        // cetak numbers4
        System.out.println("Array numbers4 adalah " + isGeometri(numbers4));

        // cetak numbers5
        System.out.println("Array numbers5 adalah " + isGeometri(numbers5));
    }

    // isGeometri
    private static boolean isGeometri(int[] numbers) {
        // deklarasi variabel
        boolean geometri = true;
        int n = numbers.length;
        int beda = numbers[1] / numbers[0];

        // looping perulangan
        for (int i = 0; i < n - 1; i++) {
            // jika beda tidak sama dengan numbers[i + 1] / numbers[i]
            if (beda != numbers[i + 1] / numbers[i]) {
                geometri = false;
            }
        }

        // return geometri
        return geometri;
    }
}
