package tasks;

/**
 * class Account to maintain data of each account in the bank
 *
 * @author Aya Gamal
 * @version 1.0
 * @since 22 April 2021
 */
public class Account {
    private long balance;
    private long accountNumber;

    /**
     * default constructor that sets both account number and balance to zero
     */
    public Account() {
        balance = 0;
        accountNumber = 0;
    }

    /**
     * constructor that sets the account number and balance
     *
     * @param accountNumber the passed account number
     * @param balance       the passed balance
     */
    public Account(long balance, long accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    /*Setters*/

    /**
     * This method returns the balance.
     *
     * @return balance
     */
    public long getBalance() {
        return balance;
    }

    /**
     * This method sets the balance.
     *
     * @param balance The Client's balance in the account
     */
    public void setBalance(long balance) {
        this.balance = balance;
    }

    /*Getters*/

    /**
     * This method returns the account number.
     *
     * @return accountNumber
     */
    public long getAccountNumber() {
        return accountNumber;
    }

    /**
     * This method sets the account number.
     *
     * @param accountNumber Client's account number
     */
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                '}';
    }

    /*Methods*/

    /**
     * method withdraw to take money from the account,first checks if there is enough balance in the account, if yes then process is done else an error message pops up.
     *
     * @param moneyWithdraw value that will be taken from the balance
     */
    public void withdraw(long moneyWithdraw) {
        if (moneyWithdraw > balance) {
            System.out.println(balance);
            setBalance(0);
            System.out.println("Your account is not enough");

        } else if (moneyWithdraw == balance) {
            balance -= moneyWithdraw;
            System.out.println("Your account is empty");
            System.out.println(moneyWithdraw);
        } else {
            balance -= moneyWithdraw;
            System.out.println("The withdrawal was successful");
            System.out.print("Total = ");
            System.out.println(moneyWithdraw);
            System.out.print("Your Balance = ");
            System.out.println(getBalance());
        }
    }

    /**
     * This method deposit is to put money into the account
     *
     * @param moneyDeposited value of the amount deposited
     */
    public void deposit(long moneyDeposited) {
        balance += moneyDeposited;
        System.out.print("Your Balance = ");
        System.out.println(getBalance());
    }
}

