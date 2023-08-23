import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        /*
         * Kita akan membuat sebuah aplikasi terminal untuk mengkonversi mata uang dari
         * IDRmenjadiUSD/SGD/JPY.
         * 
         * Hasil yang diharapkan adalah sebagai berikut.Di sini
         * kita akan memasukkan rupiah yangakan kita konversi, kemudian di terminalakan
         * muncul 3 pilihan (USD, SGD, JPY)
         * 
         * Ketika kita memilih salah satu dari
         * ketiga pilihan tersebut, maka akan muncul hasilnya.
         * 
         */

        // deklarasi variabel scanner
        Scanner scanner = new Scanner(System.in);

        // deklarasi variabel
        int rupiah;
        double usd, sgd, jpy;

        // choose your conversion currency
        System.out.println("Choose your conversion currency");
        System.out.println("1. USD");
        System.out.println("2. SGD");
        System.out.println("3. JPY");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        // input rupiah
        System.out.print("Input your rupiah: ");
        rupiah = scanner.nextInt();

        // convert rupiah to usd, sgd, jpy
        usd = rupiah / 14200;
        sgd = rupiah / 10500;
        jpy = rupiah / 130;

        // print result
        switch (choice) {
            case 1:
                System.out.println("USD " + usd);
                break;
            case 2:
                System.out.println("SGD " + sgd);
                break;
            case 3:
                System.out.println("JPY " + jpy);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        // close scanner
        scanner.close();

    }
}
