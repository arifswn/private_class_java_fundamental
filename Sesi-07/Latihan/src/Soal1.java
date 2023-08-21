public class Soal1 {
    public static void main(String[] args) {

        //deklarasi variabel
        Person person = new Person("Arif",30,"Indonesia");
        System.out.println("Nama : "+person.getName());
        System.out.println("Age : "+person.getAge());
        System.out.println("Country : "+person.getCountry());

        person.setName("Raynard");
        System.out.println("Nama Baru : "+person.getName());
    }
}
