import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args) {
        /*
         * Di sini Anda wajib membuat 3 kelas: BankAccount, BankSystem,
         * BankApplication.
         * 
         * 2.BankApplication adalah tempat aplikasi Anda yang memiliki method main.
         * 
         * 3.BankAccount adalah class yang berisi field akun bank, PIN,
         * balance, dan credit.
         * Semua data tersebut pre-defined (bisa Anda masukkan
         * nilainya saat pembuatan class), fieldakun bank dan PIN tidak boleh diubah
         * (final).
         * 
         * Di dalam class ini juga memiliki method verification untuk
         * verifikasi input dari user dan data akun bank dan PIN yang sudahAnda
         * definisikan. Class
         * ini wajib mengikuti konsep enkapsulasi.
         * 
         * 4.BankSystem adalah sebuah class yang
         * memiliki static method dan tidak memiliki field.
         * Method-method ini digunakan
         * untuk membuat servis-servis di dalam aplikasi (sehingga seharusnya minimal
         * ada 3 method, yaitu deposit, withdrawal, dan convert credit tocash).
         */

        // create object scanner
        try (Scanner scanner = new Scanner(System.in)) {
            // create object bankAccount
            BankAccount bankAccount = new BankAccount(100000, 50000);

            // create object bankSystem
            BankSystem bankSystem = new BankSystem();

            // input account number
            System.out.println("Welcome to Simple Banking");
            System.out.print("Input your account number: ");
            int accountNumber = scanner.nextInt();

            // input pin
            System.out.print("Input your PIN: ");
            int pin = scanner.nextInt();

            // verify account number and pin
            if (bankAccount.verification(accountNumber, pin)) {
                // choose your transaction
                System.out.println("Choose your transaction");
                System.out.println("1. Withdrawal");
                System.out.println("2. Deposit");
                System.out.println("3. Convert credit to cash");
                System.out.print("Your choice: ");
                int choice = scanner.nextInt();

                // choose your transaction
                switch (choice) {
                    case 1:
                        // input amount
                        System.out.print("Input your amount: ");
                        double amount = scanner.nextDouble();

                        // withdraw
                        bankSystem.withdrawal(bankAccount, amount);

                        // print result
                        System.out.println("Your balance is " + bankAccount.getBalance());
                        break;
                    case 2:
                        // input amount
                        System.out.print("Input your amount: ");
                        amount = scanner.nextDouble();

                        // deposit
                        bankSystem.deposit(bankAccount, amount);

                        // print result
                        System.out.println("Your balance is " + bankAccount.getBalance());
                        break;
                    case 3:
                        // convert credit to cash
                        bankSystem.convertCreditToCash(bankAccount);

                        // print result
                        System.out.println("Your balance is " + bankAccount.getBalance());
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            } else {
                System.out.println("Invalid account number or PIN");
            }
        }

    }

}

// create class BankAccount
class BankAccount {
    // create field
    private final int accountNumber = 123456;
    private final int pin = 123456;
    private double balance;
    private double credit;

    // create constructor
    public BankAccount(double balance, double credit) {
        this.balance = balance;
        this.credit = credit;
    }

    // create getter
    public int getAccountNumber() {
        return accountNumber;
    }

    public int getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public double getCredit() {
        return credit;
    }

    // create setter
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    // create method verification
    public boolean verification(int accountNumber, int pin) {
        if (this.accountNumber == accountNumber && this.pin == pin) {
            return true;
        } else {
            return false;
        }
    }
}

// create class BankSystem
class BankSystem {
    // create method deposit
    public void deposit(BankAccount bankAccount, double amount) {
        bankAccount.setBalance(bankAccount.getBalance() + amount);
    }

    // create method withdrawal
    public void withdrawal(BankAccount bankAccount, double amount) {
        bankAccount.setBalance(bankAccount.getBalance() - amount);
    }

    // create method convert credit to cash
    public void convertCreditToCash(BankAccount bankAccount) {
        bankAccount.setBalance(bankAccount.getBalance() + bankAccount.getCredit());
        bankAccount.setCredit(0);
    }
}
