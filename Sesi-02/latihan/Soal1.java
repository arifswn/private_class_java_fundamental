
public class Soal1 {
    public static void main(String[] args) {
        /*
         * Soal 1
         * Buatlah program untuk mengkonversi suhu dari Celcius ke Fahrenheit.
         * Buatlah variabel untuk menampung data suhu dan
         * silakan masukkan valuenya ke dalam variabel tersebut dan
         * print hasilnya ke terminal.
         * 
         */

        // deklarasi variabel
        double celcius = 0;
        double fahrenheit = 0;

        // inisialisasi variabel
        celcius = 30;
        // rumus konversi celcius ke fahrenheit
        // (0°C × 9/5) + 32 = 32°F
        fahrenheit = (celcius * 9 / 5) + 32;

        // print hasil conversi dan simbol celcius dan fahrenheit
        System.out.println("Hasil konversi suhu dari celcius ke fahrenheit");
        System.out.printf("Suhu Celcius: %.0f°C\n", celcius);
        System.out.printf("Suhu Fahrenheit: %.0f°F\n", fahrenheit);

    }
}
