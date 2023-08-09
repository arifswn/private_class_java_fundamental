public class Soal1 {
    public static void main(String[] args) {
        // Buatlah sebuah program untuk mencari median dari sebuah array satu dimensi.
        // Print hasilnya ke dalam terminal.

        // Deklarasi variabel
        // contoh input
        double[] numbers = { 2, 3, 5, 7, 9 };
        double[] numbers2 = { 1, 2, 3, 4 };

        // cetak median numbers with method
        System.out.println("Median dari array numbers adalah " + cariMedian(numbers));
        // cetak median numbers2 with method
        System.out.println("Median dari array numbers2 adalah " + cariMedian(numbers2));
    }

    // cari median
    private static double cariMedian(double[] numbers) {
        // rumus median
        // jika jumlah data ganjil
        // median = (n + 1) / 2
        // jika jumlah data genap
        // median = (n / 2) + ((n / 2) + 1) / 2

        // deklarasi variabel
        double median = 0;
        int n = numbers.length;

        // jika jumlah data ganjil
        if (n % 2 != 0) {
            median = numbers[n / 2];
        } else {
            // jika jumlah data genap
            median = (numbers[n / 2] + numbers[(n / 2) - 1]) / 2;
        }

        // return median
        return median;
    }

}
