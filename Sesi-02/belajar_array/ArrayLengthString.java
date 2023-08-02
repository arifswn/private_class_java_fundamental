import java.util.Arrays;

public class ArrayLengthString {
    public static void main(String[] args) {
        // inisisasi array
        // buat array dengan tipe data string
        // kenapa string array? karena kita mengisi array dengan string
        // kenapa 3? karena kita mengisi array dengan 3 nilai
        // dengan kata lain, kita mengisi array dengan 3 string
        // dengan index 0, 1, dan 2
        String[] stringArr;
        // tanpa mengisi array dengan nilai
        // kita akan mengakses array tersebut
        // akan menghasilkan error
        // karena kita belum mengisi array dengan nilai
        // jadi array tersebut masih kosong
        // kita tidak bisa mengakses array yang kosong
        // diberikan nilai default
        // agar kita bisa mengakses array tersebut
        // fungsion dibawah diberikan komentar

        // output
        // System.out.println("Array : " + Arrays.toString(stringArr));
        // jika kita menghapus komentar diatas
        // maka akan menghasilkan error

        // inisisasi array dengan nilai
        stringArr = new String[3];
        // assign nilai ke array
        stringArr[0] = "Lala";
        stringArr[1] = "Lili";
        stringArr[2] = "Lulu";

        // output
        System.out.println("Array : " + Arrays.toString(stringArr));
        // accessing index 0 of array (first element of the array)
        System.out.println("Array 1: " + stringArr[0]);
        // accessing index 1 of array (second element of the array)
        System.out.println("Array 2: " + stringArr[1]);
        // accessing index 2 of array (third element of the array)
        System.out.println("Array 3: " + stringArr[2]);

        // assign nilai ke array
        String[] arrString = new String[] { "Nana", "Nini", "Nunu" };
        // output
        System.out.println("Array String: " + Arrays.toString(arrString));
        // panjang array
        System.out.println("Panjang Array String: " + arrString.length);
        // menggunakan format
        System.out.printf("Panjang Array String: %d\n", arrString.length);
        // accessing index 0 of array (first element of the array)
    }
}
