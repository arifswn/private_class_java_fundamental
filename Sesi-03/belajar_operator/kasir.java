import java.util.Scanner;

public class kasir {
    public static void main(String[] args) {
        // dekralasi variabel dan scanner
        int belanjaan, diskon, bayar;
        String kartu;
        try (Scanner scan = new Scanner(System.in)) {
            // mengambil input
            System.out.print("Apakah ada kartu member: ");
            kartu = scan.nextLine();
            System.out.print("Total belanjaan: ");
            belanjaan = scan.nextInt();

            // cek apakah ada kartu member
            if (kartu.equalsIgnoreCase("ya")) {
                if (belanjaan > 500000) {
                    diskon = 50000;
                } else if (belanjaan > 100000) {
                    diskon = 15000;
                } else {
                    diskon = 0;
                }
            } else {
                if (belanjaan > 100000) {
                    diskon = 5000;
                } else {
                    diskon = 0;
                }
            }

            // tampilkan total bayar
            bayar = belanjaan - diskon;
            System.out.println("Total yang harus dibayar: " + bayar);

            // tampilkan sisa uang dan kondisi
            System.out.print("Uang yang dibayar: ");
            int uang = scan.nextInt();

            if (uang < bayar) {
                System.out.println("Uang anda kurang");
            } else {
                int kembalian = uang - bayar;
                System.out.println("Kembalian: " + kembalian);
            }
        }

    }
}
