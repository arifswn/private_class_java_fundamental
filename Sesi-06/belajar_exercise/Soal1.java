public class Soal1 {
    public static void main(String[] args) {
        /*
         * Soal 1
         * Write a Java program to create a class known as Person with methods
         * called getFirstName() andgetLastName().
         * 
         * Create a subclass called Employee
         * that adds a new method named getEmployeeId() and overrides the getLastName()
         * method to include the employee's job title.
         */

        // Soal 1
        Person person = new Person("John", "Doe");
        System.out.println(person.getFirstName());

        Employee employee = new Employee("John", "Doe", "123456");
        System.out.println(employee.getFirstName());

    }

    public static class Person {
        private String firstName;
        private String lastName;

        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }
    }

    public static class Employee extends Person {
        private String employeeId;

        public Employee(String firstName, String lastName, String employeeId) {
            super(firstName, lastName);
            this.employeeId = employeeId;
        }

        public String getEmployeeId() {
            return this.employeeId;
        }

        @Override
        public String getLastName() {
            return super.getLastName() + " " + this.employeeId;
        }
    }
}
