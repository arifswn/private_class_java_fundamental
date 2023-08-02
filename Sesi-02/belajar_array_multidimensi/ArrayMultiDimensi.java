import java.util.Arrays;

public class ArrayMultiDimensi {
    public static void main(String[] args) {
        // membuat array multidimensi
        // array multidimensi adalah array yang memiliki array di dalamnya
        // array multidimensi bisa juga disebut array bersarang
        // array multidimensi bisa juga disebut array bertingkat
        // array multidimensi bisa juga disebut array berlapis
        // array multidimensi bisa juga disebut array bertumpuk
        // array multidimensi

        // String[][] arrString = new String[3][3];
        // penjelasan [][]: adalah array multidimensi
        // penjelasan []: adalah array biasa
        // penjelasan String: adalah tipe data dari array
        // penjelasan arrString: adalah nama dari array
        // penjelasan = new String[3][3]: adalah inisialisasi array
        // penjelasan [3][3]: adalah panjang array
        // penjelasan [3]: adalah panjang array pertama
        // penjelasan [3]: adalah panjang array kedua

        // new String[][] { { "Lala", "Lili", "Lulu" }, { "Nana", "Nini", "Nunu" }, {
        // "Rara", "Riri", "Ruru" } };
        // { "Lala", "Lili", "Lulu" }: adalah nilai dari array pertama
        // { "Nana", "Nini", "Nunu" }: adalah nilai dari array kedua
        // { "Rara", "Riri", "Ruru" }: adalah nilai dari array ketiga
        // kenapa 3? karena kita mengisi array dengan 3 nilai
        // dengan kata lain, kita mengisi array dengan 3 string

        String[][] arrString = new String[][] {
                { "Lala", "Lili", "Lulu" },
                { "Nana", "Nini", "Nunu" },
                { "Rara", "Riri", "Ruru" }
        };

        // output
        // deepToString untuk array multidimensi
        // toString untuk array biasa
        System.out.println("Array String: " + Arrays.deepToString(arrString));

        // accessing index 0 of array (first element of the array)
        System.out.println("Array 1: " + arrString[0][0]);
        // accessing index 1 of array (second element of the array)
        System.out.println("Array 2: " + arrString[1][1]);
        // accessing index 2 of array (third element of the array)
        System.out.println("Array 3: " + arrString[2][2]);

    }
}
