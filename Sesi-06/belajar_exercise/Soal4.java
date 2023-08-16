public class Soal4 {
    public static void main(String[] args) {
        /*
         * Soal 4
         * Write a Java program to create a class known as
         * "BankAccount" with methods called deposit() andwithdraw().
         * 
         * Create a subclass
         * called SavingsAccount that overrides the withdraw() method to
         * preventwithdrawals if the account balance falls below one hundred.
         */

        // Create object
        SavingsAccount savingsAccount = new SavingsAccount();

        // Deposit
        savingsAccount.deposit(1000);

        // Withdraw
        savingsAccount.withdraw(100);

        // output to console details
        System.out.println("Account Number: " + savingsAccount.getAccountNumber());
        System.out.println("Account Name: " + savingsAccount.getAccountName());

        // Check balance
        System.out.println("Balance: " + savingsAccount.getBalance());

        // detail deposit and withdraw
        System.out.println("Deposit: 1000");
        System.out.println("Withdraw: 100");
    }

    // create class BankAccount
    static class BankAccount {
        // declare variable
        private int accountNumber;
        private String accountName;
        private double balance;

        // create constructor
        public BankAccount() {
            this.accountNumber = 123456789;
            this.accountName = "John Doe";
            this.balance = 0;
        }

        // create method deposit
        public void deposit(double amount) {
            this.balance += amount;
        }

        // create method withdraw
        public void withdraw(double amount) {
            this.balance -= amount;
        }

        // create method getAccountNumber
        public int getAccountNumber() {
            return accountNumber;
        }

        // create method getAccountName
        public String getAccountName() {
            return accountName;
        }

        // create method getBalance
        public double getBalance() {
            return balance;
        }
    }

    // create class SavingsAccount
    static class SavingsAccount extends BankAccount {
        // create method withdraw
        @Override
        public void withdraw(double amount) {
            if (getBalance() - amount < 100) {
                System.out.println("Withdrawal failed. Balance cannot be less than 100");
            } else {
                super.withdraw(amount);
            }
        }
    }
}
