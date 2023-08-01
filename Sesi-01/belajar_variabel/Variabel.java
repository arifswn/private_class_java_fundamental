public class Variabel {
    public static void main(String[] args) {
        // inisialisasi variabel menggunakan tipe data byte
        byte iniByte;

        // memberikan nilai ke variabel // assignment
        iniByte = 10;
        System.out.println("Ini Byte : " + iniByte);

        // re-assignment nilai variabel
        iniByte = 20;
        System.out.println("Ini Byte yang baru : " + iniByte);

        // inisialisasi variabel menggunakan tipe data var
        /*
         * Var adalah sebuah kata yang berfungsi untuk membuat variabel
         * tanpa harus menuliskan tipe datanya secara eksplisit.
         * 
         * Syarat untuk menggunakan var adalah
         * initialization dan assignment harus dilakukan secara bersamaan.
         */

        var iniVar = 10;
        System.out.println("Ini Var : " + iniVar);

        // re-assignment nilai variabel
        iniVar = 20;
        System.out.println("Ini Var yang baru : " + iniVar);

        /*
         * Pada saat initialization dan assignment variabel iniString
         * sudah dibuat menjadi variabel yang menampung data dengan tipe string,
         * namun pada saat re-assignment tipe datanya diubah menjadi number.
         * 
         * Hal tersebut akan menyebabkan error karena Java merupakan
         * bahasa pemrograman dengan tipe static type.
         */

        // inisialisasi variabel menggunakan tipe data string
        String iniString = "Hello World";
        System.out.println("Ini String : " + iniString);

        // re-assignment nilai variabel
        /*
         * karena tipe data string tidak bisa diubah menjadi number
         * maka akan terjadi error
         * yang dibolehkan hanya mengubah string menjadi string
         * tidak boleh mengubah string menjadi number.
         * 
         * diberikan komentar untuk menghindari error
         * karena variabel iniString tidak digunakan
         * dan akan error jika tidak diberikan komentar
         * 
         */

        // iniString = 20;
        // System.out.println("Ini String yang baru : " + iniString);

    }
}
