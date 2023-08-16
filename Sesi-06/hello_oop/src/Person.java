public class Person {
    String firstName;
    String lastName;

    final String country = "Indonesia";

    // deklarasi constract terdapat 2 parameter
    // Person(String paramFirstName, String paramLastName) {
    // oembuatan variabel shadowing
    Person(String firstName, String lastName) {
//         firstName = paramFirstName;
//         lastName = paramLastName;

        this.firstName = firstName;
        this.lastName = lastName;

    }

    // terdapat 1 parameter
    Person(String paramFirstName) {
        // firstName = paramFirstName;
        // constructor overloading (pemanggilan constractor)
        this(paramFirstName, null);
    }

    // tidak menggunakan param
    Person() {
        // constructor overloading (pemanggilan constractor)
        // menggunakan this
        this(null);
    }

    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", my name is " + firstName);
    }
}
