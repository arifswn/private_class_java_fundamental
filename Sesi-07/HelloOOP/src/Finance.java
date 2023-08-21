public class Finance extends Employee{

    String subDivision;

    Finance(String name, int salary, String subDivision) {
        super(name, salary);
        this.subDivision = subDivision;
    }

    void sayHello(String name){
        System.out.println("Hello "+name+
                "! This is Finnace "+this.name);
    }
}
