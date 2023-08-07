import java.util.Scanner;

public class hello_belanja {
    public static void main(String[] args) {
        // buat variabel belanja dan scanner (input)
        int belanja = 0; // isi belanjaan 0
        try (Scanner scan = new Scanner(System.in)) {
            // mengambil input
            System.out.print("Total belanjaan: Rp ");
            belanja = scan.nextInt();
        }

        // cek apakah dia belanja di atas 100000
        if (belanja > 100000) {
            System.out.println("Selamat anda mendapatkan hadiah!");
        } else {
            System.out.println(" Total belanjaan anda tidak mencukupi untuk mendapatkan hadiah");
        }

        System.out.println("Terima kasih sudah berbelanja");
    }
}
