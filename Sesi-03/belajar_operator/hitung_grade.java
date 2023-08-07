import java.util.Scanner;

public class hitung_grade {
    public static void main(String[] args) {

        // buat variabel dan scanner
        int nilai;
        String grade;
        try (Scanner scan = new Scanner(System.in)) {
            // mengambil input
            System.out.print("Nilai: ");
            nilai = scan.nextInt();
        }

        // cek apakah dia lulus atau tidak
        // hitung grade
        if (nilai >= 90) {
            grade = "A";
        } else if (nilai >= 80) {
            grade = "B+";
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 60) {
            grade = "C+";
        } else if (nilai >= 50) {
            grade = "C";
        } else if (nilai >= 40) {
            grade = "D";
        } else {
            grade = "E";
        }

        // tampilkan grade
        System.out.println("Grade: " + grade);
    }
}
