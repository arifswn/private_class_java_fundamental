public class Soal2 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(12345,100000);
        System.out.println("Account Number : "+bankAccount.getAccountNumber());
        System.out.println("Ballance : "+bankAccount.getBallance());

        bankAccount.setAccountNumber(654321);
        bankAccount.setBallance(2000000);
        System.out.println("Account Number : "+bankAccount.getAccountNumber());
        System.out.println("Ballance : "+bankAccount.getBallance());
    }
}
