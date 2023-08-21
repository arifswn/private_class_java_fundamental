public class Soal9 {
    public static void main(String[] args) {
        /*
         * Write a Java program to create a class Employee with a method called
         * calculateSalary().
         * Create two subclassesManager and Programmer.
         * 
         * In each subclass, override the calculateSalary() method to calculate and
         * return the salary based on their specific roles
         */

        Employee[] employees = new Employee[2];
        employees[0] = new Manager("John");
        employees[1] = new Programmer("Jane");

        for (Employee employee : employees) {
            System.out.println(employee.name + " is a " + employee.role);
        }

        System.out.println();

        for (Employee employee : employees) {
            System.out.println(employee.name + "'s salary is " + employee.calculateSalary());
        }

        /*
         * Expected output:
         * 
         * John is a Manager
         * Jane is a Programmer
         * 
         * John's salary is 0.0
         * Jane's salary is 0.0
         */

    }

    static class Employee {
        String name;
        String role;

        Employee(String name, String role) {
            this.name = name;
            this.role = role;
        }

        double calculateSalary() {
            return 0;
        }
    }

    static class Manager extends Employee {
        Manager(String name) {
            super(name, "Manager");
        }

        @Override
        double calculateSalary() {
            return 0;
        }
    }

    static class Programmer extends Employee {
        Programmer(String name) {
            super(name, "Programmer");
        }

        @Override
        double calculateSalary() {
            return 0;
        }
    }

}
