public class Soal2 {
    public static void main(String[] args) {
        /*
         * Soal 2
         * 1. Buatlah variabel-variabel dengan ketentuan sebagai berikut,
         * tentukan tipe data yang sesuai:
         * a.Variabel nama depan: untuk menyimpan nama depan (nama variabel dibebaskan)
         * b.Variabel nama tengah (optional): untuk menyimpan nama tengah (nama variabel
         * dibebaskan)
         * c.Variabel nama belakang: untuk menyimpan nama belakang (nama variabel
         * dibebaskan)
         * d.Variabel umur: untuk menyimpan data umur (nama variabel dibebaskan)
         * e.Variabel domisili: untuk menyimpan data kota domisili (nama variabel
         * dibebaskan)
         * 
         * 2.Print ke dalam terminal sebuah kalimat dengan format:
         * “Halo, nama saya [nama depan] [nama tengah] [nama belakang], umur saya [umur]
         * tahun.
         * Saya berdomisili di kota [domisili].”
         */

        // soal 1
        // jawaban a
        String namaDepan = "Arif";
        // jawaban b
        String namaTengah = " "; // optional
        // jawaban c
        String namaBelakang = "Setiawan";
        // jawaban d
        byte umur = 20;
        // jawaban e
        String domisili = "Indonesia";

        // soal 2
        System.out.println("Halo, nama saya " + namaDepan + namaTengah + namaBelakang + ", umur saya " + umur
                + " tahun. Saya berdomisili di kota " + domisili + ".");
    }
}
