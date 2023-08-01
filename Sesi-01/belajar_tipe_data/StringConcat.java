public class StringConcat {
    public static void main(String[] args) {
        /*
         * Kita bisa menggabungkan 2 string atau lebih
         * menggunakan tanda tambah(+) seperti pada contoh di samping.
         */

        String namaDepan = "Arif";
        String namaBelakang = "Setiawan";
        String fullName = namaDepan + " " + namaBelakang;

        // output / print hasil penggabungan string
        System.out.println(fullName);

        // lanjutan menggabungkan string
        // menggunakan String.format() dan tanda %s
        byte age = 20;
        String name = "Arif Setiawan";
        String address = "Indonesia";
        String message = String.format("Hello, my name is %s, I'm %d years old, I live in %s", name, age, address);
        System.out.println(message);

        /*
         * Kita juga bisa menggabungkan string dengan tipe data lain
         * %d untuk tipe data integer
         * %f untuk tipe data float
         * %c untuk tipe data char
         * %b untuk tipe data boolean
         * %s untuk tipe data string
         * %n untuk membuat baris baru
         */
    }
}