import java.util.Arrays;

public class ArrayCopyOfReference {
    public static void main(String[] args) {
        String[] arrString = new String[] { "Lala", "Lili", "Lulu" };
        // create new array
        String[] arrString2 = arrString;

        // output menggunakan format array to string
        System.out.printf("Array String 1: %s\n", Arrays.toString(arrString));
        System.out.printf("Array String 2: %s\n", Arrays.toString(arrString2));

        // output format
        System.out.printf("Hasil Array String 1: %s\n", Arrays.toString(arrString));
        System.out.printf("Hasil Array String 2: %s\n", Arrays.toString(arrString2));

        // re-assign nilai ke array index 0
        arrString[0] = "Nana";
        // output menggunakan format array to string
        System.out.printf("Array String 1: %s\n", Arrays.toString(arrString));

        // change array ke 2
        arrString2[1] = "Nini";
        // output menggunakan format array to string
        System.out.printf("Array String 2: %s\n", Arrays.toString(arrString2));

        // output format
        System.out.printf("================== Hasil Perubahan Array ==================\n");
        // hasil perubahan array 1
        System.out.printf("Hasil Array String 1: %s\n", Arrays.toString(arrString));
        // hasil perubahan array 2
        System.out.printf("Hasil Array String 2: %s\n", Arrays.toString(arrString2));
    }
}
