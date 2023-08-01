public class NumberDataType {
    public static void main(String[] args) {
        // tambah-tambahan
        System.out.println(1 + 3);

        // pengurangan
        System.out.println(3 - 1);

        // perkalian
        System.out.println(2 * 7);

        // pembagian
        System.out.println(9 / 3);

        // penjelasan konversi tipe data

        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 100000;
        long iniLong = 1000000000;

        System.out.println("Ini Byte : " + iniByte);
        System.out.println("Ini Short : " + iniShort);
        System.out.println("Ini Int : " + iniInt);
        System.out.println("Ini Long : " + iniLong);

        /*
         * short bisa menampung hingga 32767, sehingga kita bisa menyimpan nilai 100
         * dengan tipe data short
         */
        short iniShort2 = 100;
        System.out.println("Ini Short 2 : " + iniShort2);

        /*
         * Akan error karena variabel iniShort3 tidak memiliki cukup ruang
         * untuk menampung nilai 1000000
         * diberikan komentar untuk menghindari error
         * karena variabel iniShort3 tidak digunakan
         * dan akan error jika tidak diberikan komentar
         */
        // short iniShort3 = 1000000;
        // System.out.println("Ini Short 3 : " + iniShort3);
    }
}
