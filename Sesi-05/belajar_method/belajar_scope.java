public class belajar_scope {
    public static void main(String[] args) {
        // contoh pertama
        helloWorld(); // tidak bisa return
        // disaat di panggil method nya bisa nampilin output

        helloWorld("Belajar Java"); // bisa return
        // tidak bisa nampil di output
        // karena belum di assign ke variabel / belum di print ke output

        // dekalarasi variabel
        String result;
        // assign variabel
        result = helloWorld("Belajar Java");
        // print ke output
        System.out.println(result);

        // yang tidak menggunakan variabel
        System.out.println(helloWorld("Belajar Java"));

        // contoh kedua
        String name = "Lala";

        //inisialisasikan result2
        // boolean result2 = false;
        // berikan kondisi
        if (name.isBlank()) {
            //block code
            // akses result 2 di dalam kondisi
            boolean result2 = false;
            System.out.println(result2);
        }
        // jika ada kode di dalam kondisi
        // maka variabel yang di inisialisasikan
        // harus berada di dalam kondisi
        // tetapi tidak dapat di akses di luar kondisi
        // hanya bisa di akses di dalam kondisi

        //tidak bisa akses result2 karena di luar kondisi
        // System.out.println("Hasilnya adalah " + result2);
    }

    static void helloWorld() {
        // jika void gak bisa menggunakan return
        // return "Hello World";

        System.out.println("Hello World");
    }

    static String helloWorld(String teks) {
        return "Hello World " + teks;
    }
}
