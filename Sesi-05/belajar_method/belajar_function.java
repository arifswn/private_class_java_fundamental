public class belajar_function {

    public static void main(String[] args) {
        System.out.println("Belajar Method di Java");
        //menggunakan parameter
        cetak("Arif");
        //tidak menggunakan parameter
        helloWorld();
        //menggunakan parameter tipe data integer
        sum(1, 3);
    }

    static void cetak(String teks) {
        if (teks.equalsIgnoreCase("Arif")) {
            System.out.println("Hei : " + teks);
        } else {
            System.out.println("Anda Bukan Arif");
        }

        System.out.println("Hello " + teks + " Belajar Method di Java");
    }

    static void helloWorld(){
        System.out.println("Hello World");
    }

    static void sum(int a, int b){
        int hasil = a + b;
        System.out.println("Hasil penjumlahan adalah : " + hasil);
    }
}
