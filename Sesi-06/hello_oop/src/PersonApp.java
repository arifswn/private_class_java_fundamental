public class PersonApp {
    public static void main(String[] args) {
        //class instantiate
        Person nana = new Person("Nana", "Nini");
        System.out.println("FirstName saat instantiate: "+nana.firstName);

        //memanipulasi field firstName dan lastName
        nana.firstName = "Lala";
        System.out.println("First name setelah diubah: "+nana.firstName);

        //menggunakan 1 parameter
        Person nina = new Person("Nina");
        System.out.println("FirstName nina: "+nina.firstName);
        System.out.println("LastName nina: "+nina.lastName);

        //tidak menggunakan parameter
        Person nini = new Person();
        System.out.println("FirstName nini: "+nini.firstName);
        System.out.println("LastName nini: "+nini.lastName);
    }
}
