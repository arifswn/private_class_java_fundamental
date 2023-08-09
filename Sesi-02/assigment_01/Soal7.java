public class Soal7 {
    public static void main(String[] args) {
        /*
         * Berdasarkan array multidimensional di samping,
         * akseslah semua elemen yang
         * merupakan angka genap (sebutkan indeksnya saja)
         */

        // deklarasi variabel
        int[][] numbers = {
                { 1, 4, 10 },
                { 10, 8, 7, 11, 14 },
                { 3, 5, 7 },
                { 12, 90, 98, 7, 3, 5 },
                { 3, 9, 10, 5, 1 }
        };

        // print semua data
        System.out.println("Mengakses semua data");
        System.out.println("====================");
        // menggunakan for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index ke-" + i);
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println("Index ke-" + j + ": " + numbers[i][j]);
            }
            System.out.println();
        }

        // print semua data genap sebutkan indexnya saja
        System.out.println("\nMengakses semua data genap");
        System.out.println("==========================");
        // menggunakan for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index ke-" + i);
            for (int j = 0; j < numbers[i].length; j++) {
                // cek jika tidak ada genap
                if (numbers[i][j] % 2 == 0) {
                    System.out.println("Index ke-" + j + ": " + numbers[i][j]);
                } else {
                    System.out.println("Index ke-" + j + ": tidak ada bilangan genap");
                }
            }
            System.out.println();
        }
    }
}
