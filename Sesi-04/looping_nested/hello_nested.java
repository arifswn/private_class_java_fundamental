public class hello_nested {
    public static void main(String[] args) {
        // deklarasi variabel
        int x, y;

        // looping perulangan sebanyak x dan y
        for (x = 0; x <= 5; x++) {
            for (y = 0; y <= 3; y++) {
                System.out.println("Perulangan ke-" + x + " " + y);
                // System.out.format("Perulangan [x=%d, y=%d] %n", x, y);
                // %d untuk integer/angka
                // %n untuk enter
            }
        }

        // index x = 0,1,2,3,4,5
        // index y = 0,1,2,3

        // looping pertama x = 0
        // looping nested y = 0,1,2,3

        // looping pertama x = 1
        // looping nested y = 0,1,2,3

        // sampai
        // looping pertama x = 5
        // looping nested y = 0,1,2,3
    }
}
