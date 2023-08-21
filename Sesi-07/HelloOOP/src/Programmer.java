public class Programmer extends Employee{
    String programmingLang;

    Programmer(String name, int salary, String programmingLang) {
        super(name, salary);
        this.programmingLang = programmingLang;
    }

    void sayHello(String name){
        System.out.println("Hello "+name+
                "! This is Staff "+this.name);
    }
}
