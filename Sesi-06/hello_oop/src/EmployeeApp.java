public class EmployeeApp {
    public static void main(String[] args) {
//        Employee didi = new Employee();
        Employee didi = new Employee("Didi","Suhardi",50);
        didi.firstName = "Didi";
        didi.lastName = "Suhardi";
        didi.age = 50;
        didi.sayHello("Joko");

        Programmer joko = new Programmer("Joko", "Hartanto",50);
        joko.firstName = "Joko";
        joko.lastName = "Hartanto";
        joko.age = 50;
        joko.sayHello("Didi");
        joko.coding("Java");
    }
}
