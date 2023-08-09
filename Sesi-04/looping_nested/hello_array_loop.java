public class hello_array_loop {
    public static void main(String[] args) {
        // deklarasi variabel angka
        int[] angka = { 2, 4, 6, 8 };
        // mempunyai index 0,1,2,3 > berjumlah 4

        int i;
        for (i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }

        System.out.println();
        // deklarasi variabel karakter multi dimensi
        String[][] names = {
                { "Ana", "Ani" },
                { "Lala", "Lili" },
                { "Rara", "Riri" }
        };

        int y;
        int j;

        for (y = 0; y < names.length; y++) {
            for (j = 0; j < names[y].length; j++) {
                System.out.print(names[y][j] + " ");
            }
            System.out.println();
        }

    }
}
