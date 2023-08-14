import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        /*
         * Buatlah sebuah method untuk menentukan nilai seorang siswa sesuai dengan
         * ketentuan berikut:
         * 
         * a.Jika absen kurang dari 75% maka siswa tidak lulus
         * b.Jika rata-rata nilai siswa di bawah 70 maka siswa tidak lulus
         * c.Selain keadaan tersebut, maka nilai akan ditentukan sebagai berikut
         * 
         * i. Jika rata-rata nilai di bawah 78 sampai rata-rata nilai di atas
         * sama dengan 70, maka nilai C
         * ii.Jika rata-rata nilai di bawah 90 sampai rata-rata nilai di atas sama
         * dengan 78, maka nilai B
         * iii.Jika rata-rata nilai di atas sama dengan 90, maka nilai
         * AMethod memiliki rangka sebagai berikut:
         * 
         * a.Method memiliki 3 parameter:
         * i.Nama siswa
         * ii.Absen
         * iii.Nilai siswa (nilai siswa harus berupa variable argument)
         * 
         * b.Value return berupa string (“Lulus”, “Tidak Lulus”, “A”, “B”, “C”)
         * 
         */

        // jawaban a

        // jawaban b

        // jawaban c

        // menggunakan input scanner
        Scanner input = new Scanner(System.in);

        // deklarasi variable
        String nama;
        int absen;
        int nilai;

        // input nama
        System.out.print("Masukkan nama: ");
        nama = input.nextLine();

        // input absen
        System.out.print("Masukkan absen: ");
        absen = input.nextInt();

        // input nilai
        System.out.print("Masukkan nilai: ");
        nilai = input.nextInt();

        // panggil method
        System.out.println("Hasil: " + nilaiSiswa(nama, absen, nilai));

        // tutup scanner
        input.close();
    }

    // method nilaiSiswa
    public static String nilaiSiswa(String nama, int absen, int... nilai) {
        // deklarasi variable
        int total = 0;
        int rataRata = 0;
        String hasil = "";

        // hitung total nilai
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }

        // hitung rata-rata
        rataRata = total / nilai.length;

        // cek apakah absen kurang dari 75%
        if (absen < 75) {
            hasil = "Tidak Lulus";
        } else {
            // cek apakah rata-rata nilai di bawah 70
            if (rataRata < 70) {
                hasil = "Tidak Lulus";
            } else {
                // cek apakah rata-rata nilai di bawah 78 sampai rata-rata nilai di atas sama
                // dengan 70
                if (rataRata >= 70 && rataRata < 78) {
                    hasil = "C";
                } else {
                    // cek apakah rata-rata nilai di bawah 90 sampai rata-rata nilai di atas sama
                    // dengan 78
                    if (rataRata >= 78 && rataRata < 90) {
                        hasil = "B";
                    } else {
                        // cek apakah rata-rata nilai di atas sama dengan 90
                        if (rataRata >= 90 && rataRata <= 100) {
                            hasil = "A";
                        }
                    }
                }
            }
        }

        // return hasil
        return "Nama siswa: " + nama +
                "\nAbsen: " + absen +
                "\nRata-rata nilai: " + rataRata +
                "\nHasil: " + hasil;
    }
}
