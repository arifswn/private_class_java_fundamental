import java.util.Arrays;

public class HelloArray {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // inisisasi array
        String[] stringArr;

        // inisisasi array dengan nilai
        // assign nilai ke array
        // kenapa string array? karena kita mengisi array dengan string
        // kenapa 3? karena kita mengisi array dengan 3 nilai
        // dengan kata lain, kita mengisi array dengan 3 string
        // dengan index 0, 1, dan 2
        stringArr = new String[3];
        stringArr[0] = "Lala";
        stringArr[1] = "Lili";
        stringArr[2] = "Lulu";

        // print array
        System.out.printf("Array 1: %s\n", stringArr[0]);
        /*
         * Untuk print semua array ke dalam terminal, kita membutuhkan package Arrays
         * yang akan kita import(kita akan membahas package di sesi-sesi selanjutnya).
         * Kemudian kita akan memakai function toString yang disediakan oleh package
         * tersebut.
         */
        System.out.println(String.format("Array 2: %s", Arrays.toString(stringArr)));

        // accessing index 0 of array (first element of the array)
        System.out.println("Array 1: " + stringArr[0]);
        // accessing index 1 of array (second element of the array)
        System.out.println("Array 2: " + stringArr[1]);
        // accessing index 2 of array (third element of the array)
        System.out.println("Array 3: " + stringArr[2]);

        // re-assign nilai ke array
        stringArr[0] = "Nana";
        stringArr[1] = "Nini";
        stringArr[2] = "Nunu";

        // print array
        System.out.println("Array String: " + Arrays.toString(stringArr));

        // accessing index 0 of array (first element of the array)
        System.out.println("Array 1: " + stringArr[0]);
        // accessing index 1 of array (second element of the array)
        System.out.println("Array 2: " + stringArr[1]);
        // accessing index 2 of array (third element of the array)
        System.out.println("Array 3: " + stringArr[2]);

    }
}
