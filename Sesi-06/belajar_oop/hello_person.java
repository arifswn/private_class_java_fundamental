class hello_person {
    public static void main(String[] args) {

        // membuat firstName dan lastName
        String firstName;
        String lastName;

        // assign data
        firstName = "Nana";
        lastName = "Nini";
        System.out.println("Hello " + firstName + " " + lastName);

        // assign data
        firstName = "Nini";
        lastName = "Nana";
        System.out.println("Hello " + firstName + " " + lastName);

        // assign data
        firstName = "Lala";
        lastName = "Lili";
        System.out.println("Hello " + firstName + " " + lastName);

        /* batasan yang menggunakan function */
        // memanggil sayHello dengan parameter
        sayHello("Nana", "Nini");
        sayHello("Nini", "Nana");
        sayHello("Lala", "Lili");

        /* batasan yang menggunakan class */

        // call person class
        Person person = new Person();

        // manipulasi field class langsung di assign ke variable
        String namaDepan = person.firstName = "Nana";
        String namaBelakang = person.lastName = "Nini";
        // person.country = "Singapore";

        // output untuk person
        System.out.println("Hello " + namaDepan + " " + namaBelakang + " from " + person.country);
        // kombinasi output dengan function
        sayHello(namaDepan, namaBelakang);
        // output sayhello dari class person
        person.sayHello("Nana");
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}

class Person {
    String firstName;
    String lastName;

    // berikan scope menggunakan final
    final String country = "Indonesia";

    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", my name is " + firstName);
    }
}