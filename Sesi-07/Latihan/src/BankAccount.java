public class BankAccount {
    private int accountNumber;
    private int ballance;

    public BankAccount(int accountNumber, int ballance) {
        this.accountNumber = accountNumber;
        this.ballance = ballance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBallance() {
        return ballance;
    }

    public void setBallance(int ballance) {
        this.ballance = ballance;
    }
}
