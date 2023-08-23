import java.util.Scanner;

public class SimpleBanking {
    public static void main(String[] args) {
        /*
         * Kita akan membuat aplikasi sederhana mengenai perbankan.
         * Aplikasi ini memiliki 3 fitur utama:
         * 
         * a.Withdrawal
         * b.Depositc.
         * 
         * Convert credit to cash
         * Sebelum kita bisa menggunakan aplikasi tersebut, kita harus melakukan
         * verifikasi akun
         * dan PIN terlebih dahulu
         */

        // deklarasi variabel scanner
        Scanner scanner = new Scanner(System.in);

        // deklarasi variabel
        int accountNumber, pin, choice;
        double balance, amount;

        // input account number
        System.out.println("Welcome to Simple Banking");
        System.out.print("Input your account number: ");
        accountNumber = scanner.nextInt();

        // input pin
        System.out.print("Input your PIN: ");
        pin = scanner.nextInt();

        // verify account number and pin
        if (accountNumber == 123456 && pin == 123456) {
            // input balance
            System.out.print("Input your balance: ");
            balance = scanner.nextDouble();

            // choose your transaction
            System.out.println("Choose your transaction");
            System.out.println("1. Withdrawal");
            System.out.println("2. Deposit");
            System.out.println("3. Convert credit to cash");
            System.out.print("Your choice: ");
            choice = scanner.nextInt();

            // choose your transaction
            switch (choice) {
                case 1:
                    // input amount
                    System.out.print("Input your amount: ");
                    amount = scanner.nextDouble();

                    // withdraw
                    balance -= amount;

                    // print result
                    System.out.println("Your balance is " + balance);
                    break;
                case 2:
                    // input amount
                    System.out.print("Input your amount: ");
                    amount = scanner.nextDouble();

                    // deposit
                    balance += amount;

                    // print result
                    System.out.println("Your balance is " + balance);
                    break;
                case 3:
                    // convert credit to cash
                    balance *= 0.8;

                    // print result
                    System.out.println("Your balance is " + balance);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } else {
            System.out.println("Invalid account number or PIN");
        }

        // close scanner
        scanner.close();
    }
}
