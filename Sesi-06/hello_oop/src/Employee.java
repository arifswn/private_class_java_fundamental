public class Employee {
    String firstName;
    String lastName;
    int age;

    Employee(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    void sayHello(String name) {
        System.out.println("Hello " + name + ", this is employee " + this.firstName); 
    }
}

class Programmer extends Employee {

    Programmer(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    void coding(String language){
        System.out.println("I can code in "+language+" programming language");
    }
    void sayHello(String name) {
        System.out.println("Hello " + name + ", this is programmer " + this.firstName); 
    }
}