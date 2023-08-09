import java.util.Arrays;

public class Soal2 {
    public static void main(String[] args) {
        // Buatlah sebuah program untuk mencari jumlah semua angka yang ada di dalam
        // array 2 dimensi. Print hasilnya kedalam terminal.

        // Deklarasi variabel
        // contoh input
        int[][] numbers = {
                { 1, 3, 4 },
                { 2 },
                { 3, 7, 10 }
        };

        // contoh input
        int[][] numbers2 = {
                { 2, 9 },
                { 0, 3, 10 },
                { 1, 9 }
        };

        // cetak array numbers
        System.out.printf("Array numbers adalah %s%n", Arrays.deepToString(numbers));
        // cetak langkah menjumlahkan numbers
        System.out.println("Langkah menjumlahkan array numbers adalah");
        System.out.println("1 + 3 + 4 = 8");
        System.out.println("2 = 2");
        System.out.println("3 + 7 + 10 = 20");
        System.out.println("8 + 2 + 20 = 30");

        // cetak jumlah numbers with method
        System.out.println("Jumlah dari array numbers adalah " + jumlah(numbers));

        System.out.println();
        // cetak array numbers2
        System.out.printf("Array numbers2 adalah %s%n", Arrays.deepToString(numbers2));
        // cetak langkah menjumlahkan numbers2
        System.out.println("Langkah menjumlahkan array numbers2 adalah");
        System.out.println("2 + 9 = 11");
        System.out.println("0 + 3 + 10 = 13");
        System.out.println("1 + 9 = 10");
        System.out.println("11 + 13 + 10 = 34");
        // cetak jumlah numbers2 with method
        System.out.println("Jumlah dari array numbers2 adalah " + jumlah(numbers2));

    }

    // jumlah
    private static int jumlah(int[][] numbers) {
        // deklarasi variabel
        int jumlah = 0;

        // looping perulangan
        for (int i = 0; i < numbers.length; i++) {
            // looping nested
            for (int j = 0; j < numbers[i].length; j++) {
                // jumlah = jumlah + numbers[i][j];
                jumlah += numbers[i][j];
            }
        }

        // return jumlah
        return jumlah;
    }
}
