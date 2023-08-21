public class Employee {
    String name;
    int salary;

    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    void sayHello(String name){
        System.out.println("Hello "+name+
                "! This is Employee "+this.name);
    }
}
