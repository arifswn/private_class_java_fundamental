import java.util.Scanner;

public class belajar_switch_case {
    public static void main(String[] args) {
        // buat variabel dan scanner
        String nilai;
        try (Scanner scan = new Scanner(System.in)) {
            // mengambil input
            System.out.print("Nilai: ");
            nilai = scan.nextLine();
        }

        // cek apakah dia lulus atau tidak
        // hitung grade
        switch (nilai) {
            case "A":
                System.out.println("Nilai anda sempurna!");
                break;
            case "B":
                System.out.println("Nilai anda bagus!");
                break;
            case "C":
                System.out.println("Nilai anda cukup!");
                break;
            case "D":
                System.out.println("Nilai anda kurang!");
                break;
            case "E":
                System.out.println("Nilai anda sangat kurang!");
                break;
            default:
                System.out.println("Nilai tidak valid!");
                break;
        }

        // tampilkan grade
        System.out.println("Grade: " + nilai);
    }
}
