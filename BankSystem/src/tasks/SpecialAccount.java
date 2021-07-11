package tasks;

/**
 * This class SpecialAccount is inherited from Account class
 *
 * @author Aya Gamal
 * @version 1.0
 * @since 22 April 2021
 */

public class SpecialAccount extends Account {
    /**
     * default constructor that sets both account number and balance to zero
     */
    public SpecialAccount() {
        setBalance(0);
        setAccountNumber(0);
    }

    /**
     * child constructor that passes the arguments to base class(Account) constructor
     *
     * @param accountNumber passes account number
     * @param balance       passes balance
     */

    public SpecialAccount(long balance, long accountNumber) {
        super(balance, accountNumber);
    }

    /**
     * @param moneyWithdraw which is the money withdrawn
     *                      maximum variable is the maximum amount of money that can be overdraft from the account.
     */

    @Override
    public void withdraw(long moneyWithdraw) {
        long maximum = 1000;
        if (moneyWithdraw > 0 && moneyWithdraw <= 1000 && getBalance() >= 0) {
            long temp = getBalance() - moneyWithdraw;
            setBalance(-(temp + 1000));
            System.out.println("The withdrawal was successful");
            System.out.print("Money withdrawn = ");
            System.out.println(moneyWithdraw);

        } else if (moneyWithdraw > 0 && moneyWithdraw <= 1000 && getBalance() > -1000 && getBalance() <= 0) {
            maximum += getBalance();
            if (moneyWithdraw < maximum) {
                setBalance((maximum - moneyWithdraw) - 1000);
                System.out.println("The withdrawal was successful");
                System.out.print("Money withdrawn = ");
                System.out.println(moneyWithdraw);

            } else {
                System.out.println("The withdrawal was successful");
                System.out.print("Money withdrawn = ");
                System.out.println(maximum);
                setBalance(-1000);
            }
        } else {
            long originalBalance = getBalance(); //200
            long copy = getBalance() - moneyWithdraw; //-400
            setBalance(0);
            if (originalBalance == moneyWithdraw) {
                System.out.println("Money withdrawn is " + originalBalance);
                setBalance(0);
            } else {
                if (getBalance() == 0 && -copy < 1000) {
                    setBalance(-(copy + maximum));
                    System.out.println(originalBalance - copy);

                } else if (-copy > 1000) {
                    System.out.println(originalBalance + maximum);
                    System.out.println("The Maximum Withdraw is only 1000");
                    setBalance(-1000);
                }

            }
        }

    }
}
