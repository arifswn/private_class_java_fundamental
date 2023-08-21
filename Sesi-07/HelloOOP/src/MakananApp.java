public class MakananApp {
    public static void main(String[] args) {
        Restoran restoran = new Restoran();

        //buat data variabel (set)
        restoran.setMenu("Ayam Bakar");
        restoran.setHarga(Double.parseDouble("17.000"));
        restoran.setSpesial(true);

        //panggil method get
        System.out.println("Menu Makanan : "+restoran.getMenu());
        System.out.println("Harga Makanan : "+restoran.getHarga());
        System.out.println("Menu Spesial : "+restoran.isSpesial());
    }
}
