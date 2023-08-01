public class NumberConversion {
    public static void main(String[] args) {
        /*
         * Tipe data number bisa dikonversi antarjenisnya,
         * terdapat 2 jenis konversi dalam tipe data number
         * 
         * 1.Widening (otomatis):
         * byte -> short -> int -> long -> float -> double
         * 
         * 2.Narrowing (manual):
         * double -> float -> long -> int -> short -> byte
         * 
         * Kita harus berhati-hati ketika melakukan narrowing conversion,
         * karena jika variabel tujuan tidak bisa menampung value
         * yang akan dikonversi, maka program akan mengalami number overflow
         * 
         */

        // widening conversion
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        // output hasil konversi widening conversion
        System.out.println("Ini Byte : " + iniByte);
        System.out.println("Ini Short : " + iniShort);
        System.out.println("Ini Int : " + iniInt);
        System.out.println("Ini Long : " + iniLong);
        System.out.println("Ini Float : " + iniFloat);
        System.out.println("Ini Double : " + iniDouble);
        System.out.println();

        // narrowing conversion
        float iniFloat2 = (float) iniDouble;
        long iniLong2 = (long) iniFloat2;
        int iniInt2 = (int) iniLong2;
        short iniShort2 = (short) iniInt2;
        byte iniByte2 = (byte) iniShort2;
        System.out.println("Ini Float 2 : " + iniFloat2);
        System.out.println("Ini Long 2 : " + iniLong2);
        System.out.println("Ini Int 2 : " + iniInt2);
        System.out.println("Ini Short 2 : " + iniShort2);
        System.out.println("Ini Byte 2 : " + iniByte2);

    }
}
