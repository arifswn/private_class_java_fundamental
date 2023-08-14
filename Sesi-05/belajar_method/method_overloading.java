public class method_overloading {
    public static void main(String[] args) {
        //tidak menggunakan parameter
        sayHello();
        //menggunakan 1 parameter
        sayHello("Arif");
        //menggunakan 2 parameter
        sayHello("Arif", "Setiawan");
    }

    //tidak menggunakan parameter / no parameter
    static void sayHello(){
        System.out.println("Hello World");
    }

    //menggunakan 1 parameter
    static void sayHello(String nama){
        System.out.println("Hello " + nama);
    }

    //menggunakan 2 parameter
    static void sayHello(String namaDepan, String namaBelakang){
        System.out.println("Hello " + namaDepan + " " + namaBelakang);
    }
    
}
