import java.util.Arrays;

public class CreateArrayInt {
    public static void main(String[] args) {
        // inisisasi array
        int[] intArr;

        // output
        /*
         * akan menghasilkan error
         * karena kita belum mengisi array dengan nilai
         * jadi array tersebut masih kosong
         * kita tidak bisa mengakses array yang kosong
         * diberikan nilai default
         * agar kita bisa mengakses array tersebut
         * fungsion dibawah diberikan komentar
         * agar tidak mengganggu proses belajar
         */
        // System.out.println("Array : " + Arrays.toString(intArr));
        /*
         * jika kita menghapus komentar diatas
         * maka akan menghasilkan error
         * untuk mengatasi error tersebut, kita bisa mengisi array dengan nilai
         */

        // inisisasi array dengan nilai
        // assign nilai ke array
        // kenapa int array? karena kita mengisi array dengan int
        // kenapa 3? karena kita mengisi array dengan 3 nilai
        // dengan kata lain, kita mengisi array dengan 3 int
        // dengan index 0, 1, dan 2
        intArr = new int[] { 1, 2, 3 };
        // output
        System.out.println("Array : " + Arrays.toString(intArr));
        // kita akan mengganti indexing 0 = 1 menjadi 0 = 10
        intArr[0] = 10;
        // output
        System.out.println("Array : " + Arrays.toString(intArr));
        // assign nilai ke array
        // kenapa 3? karena kita mengisi array dengan 3 nilai
        // dengan kata lain, kita mengisi array dengan 3 int
        // dengan index 0, 1, dan 2
        intArr = new int[3];
        // output
        // kenapa nilai 0? karena kita blm memasukan nilai ke array
        // jadi array tersebut masih kosong
        // dan nilai default untuk int adalah 0
        System.out.println("Array : " + Arrays.toString(intArr));
        // assign nilai ke array
        intArr[0] = 1;
        intArr[1] = 2;
        intArr[2] = 3;
        // output
        System.out.println("Array : " + Arrays.toString(intArr));

    }
}
