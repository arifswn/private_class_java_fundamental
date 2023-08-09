public class hello_foreach {
    public static void main(String[] args) {

        // looping angka
        // buat array
        int angka[] = { 3, 1, 42, 24, 12 };

        // gunakan perulangan for each
        for (int x : angka) {
            // x untuk output
            // angka untuk variabel array
            System.out.print(x + " ");
        }

        System.out.println();
        // looping karakter
        // buat array
        char kar[] = { 'a', 'b', 'c', 'd', 'e' };

        // gunakan perulangan for each
        for (char x : kar) {
            // x untuk output
            // kar untuk variabel array
            System.out.print(x + " ");
        }
    }
}
