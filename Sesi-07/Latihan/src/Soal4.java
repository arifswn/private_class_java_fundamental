public class Soal4 {
    public static void main(String[] args) {

        Employee employee = new Employee(1,"ABC",1000000);
        //contoh 1
        System.out.println("ID : "+employee.getEmployee_id());
        System.out.println("Nama : "+employee.getEmployee_name());
        System.out.println("Salary : "+employee.getEmployee_salary());

        //call void
        employee.toSallary();
        employee.setEmployee_id(2);
        employee.setEmployee_name("QWERTY");

        //contoh 2
        //assign variabel
        int id = employee.getEmployee_id();
        String name = employee.getEmployee_name();
        int salary = employee.getEmployee_salary();

        //return data
        returnData(id,name,salary);
    }

    static void returnData(int id, String name, int salary){
        //contoh 2 menggunakan method dan variabel
        System.out.println("ID : "+id);
        System.out.println("Nama : "+name);
        System.out.println("Salary : "+salary);
    }
}
