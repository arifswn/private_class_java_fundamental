public class EmployeeApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Lala",5000000);
        employee.sayHello("Nana");

        employee = new Finance("Lili", 7000000, "IT");
        employee.sayHello("Nini");

        employee = new Programmer("Lulu",100000000, "Teknisi");
        employee.sayHello("Lala");

        //cek tipe class
        if (employee instanceof Finance){
            //ubah tipe class dari Employee ke Finance
            Finance finance = (Finance) employee;
            finance.sayHello("Anggi");

        }
    }
}
