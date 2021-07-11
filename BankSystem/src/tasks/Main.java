package tasks;

import java.util.Scanner;

/**
 * Main that integrate all the classes together
 *
 * @author Mohamed Saeed and Nada Khaled
 * @version 1.0
 * @since 22 April 2021
 */
public class Main {
    /**
     * This method helps in giving the client an account number
     *
     * @param min lowest range
     * @param max highest range
     * @return account Number
     */
    public static long generateTicketNumber(long min, long max) {
        long range = (max - min) + 1;
        return (long) (Math.random() * range) + min;
    }

    /**
     * MAIN METHOD
     *
     * @param args default
     */
    public static void main(String[] args) {
        Bank bank = new Bank("Al Ahly", "Cairo", "345444");
        Account account;
        Client client;
        System.out.println("Bank " + bank.getName() + " Welcomes You");


        while (true) {
            System.out.println("Please Choose an option :");
            System.out.println("1- Create an account");
            System.out.println("2- Services from the account");
            System.out.println("3- Show Bank info ");
            System.out.println("4- Exit");

            Scanner scan = new Scanner(System.in);
            int option = scan.nextInt();

            switch (option) {
                case 1: {
                    System.out.println("Please choose one of the choices:");
                    System.out.println("Would you like to be a commercial client? 1-Yes 2-No");
                    int option3 = scan.nextInt();
                    System.out.println("Will it be a special account? 1-yes 2-No");
                    int option4 = scan.nextInt();
                    System.out.println("Please enter your private information");

                    if (option3 == 2 && option4 == 1) {
                        System.out.println("Enter Name : ");
                        scan.nextLine();
                        String name = scan.nextLine();

                        System.out.println("Enter phone number : ");
                        String phone = scan.nextLine();

                        System.out.println("Enter Address : ");
                        String address = scan.nextLine();

                        System.out.println("Enter ID : ");
                        String id = scan.nextLine();

                        //Account
                        System.out.println("Enter Balance : ");
                        long balance = scan.nextLong();

                        System.out.println("Your account number is: ");
                        long accountNumber = generateTicketNumber(100, 500);
                        System.out.println(accountNumber);

                        account = new SpecialAccount(balance, accountNumber);
                        client = new Client(name, phone, address, id, account);
                        bank.addClient(client, account);

                    } else if (option3 == 2 && option4 == 2) {
                        System.out.println("Enter Name : ");
                        scan.nextLine();
                        String name = scan.nextLine();

                        System.out.println("Enter phone number : ");
                        String phone = scan.nextLine();

                        System.out.println("Enter Address : ");
                        String address = scan.nextLine();

                        System.out.println("Enter ID : ");
                        String id = scan.nextLine();

                        /* Account*/
                        System.out.println("Enter Balance : ");
                        long balance = scan.nextLong();

                        System.out.println("Your account number is: ");
                        long accountNumber = generateTicketNumber(501, 900);
                        System.out.println(accountNumber);

                        account = new Account(balance, accountNumber);
                        client = new Client(name, phone, address, id, account);
                        bank.addClient(client, account);

                    } else if (option3 == 1 && option4 == 1) {
                        System.out.println("Enter Name : ");
                        scan.nextLine();
                        String name = scan.nextLine();

                        System.out.println("Enter phone number : ");
                        String phone = scan.nextLine();

                        System.out.println("Enter Address : ");
                        String address = scan.nextLine();

                        System.out.println("Enter Commercial ID : ");
                        String id = scan.nextLine();


                        //Account
                        System.out.println("Enter Balance : ");
                        long balance = scan.nextLong();

                        System.out.println("Your account number is: ");
                        long accountNumber = generateTicketNumber(901, 1100);
                        System.out.println(accountNumber);

                        account = new SpecialAccount(balance, accountNumber);
                        client = new CommercialClient(name, phone, address, id, account);
                        bank.addClient(client, account);

                    } else if (option3 == 1 && option4 == 2) {
                        System.out.println("Enter Name : ");
                        scan.nextLine();
                        String name = scan.nextLine();

                        System.out.println("Enter phone number : ");
                        String phone = scan.nextLine();

                        System.out.println("Enter Address : ");
                        String address = scan.nextLine();

                        System.out.println("Enter Commercial ID : ");
                        String id = scan.nextLine();

                        //Account
                        System.out.println("Enter Balance : ");
                        long balance = scan.nextLong();

                        System.out.println("Your account number is: ");
                        long accountNumber = generateTicketNumber(1101, 1500);
                        System.out.println(accountNumber);

                        account = new Account(balance, accountNumber);
                        client = new CommercialClient(name, phone, address, id, account);
                        bank.addClient(client, account);
                    }
                }
                break;

                case 2: {
                    if (bank.accounts.size() != 0) {
                        System.out.println("1- Withdraw");
                        System.out.println("2- Deposit");
                        System.out.println("3- Show Account Details");
                        int option2 = scan.nextInt();

                        switch (option2) {
                            case 1: {
                                System.out.println("Enter your account number please");
                                long accountNumber = scan.nextLong();
                                for (int counter = 0; counter < bank.accounts.size(); counter++) {
                                    if (bank.accounts.get(counter).getAccountNumber() != accountNumber) {
                                        continue;
                                    } else {
                                        System.out.println("Enter the amount to be withdrawn");
                                        int money = scan.nextInt();
                                        bank.accounts.get(counter).withdraw(money);
                                        System.out.println(bank.accounts.get(counter).toString());
                                    }
                                    if (counter == bank.accounts.size() && bank.accounts.get(counter).getAccountNumber() != accountNumber) {
                                        System.out.println("INVALID ACCOUNT NUMBER");
                                    }
                                }
                            }
                            break;

                            case 2: {
                                System.out.println("Enter your account number please");
                                long accountNumber = scan.nextLong();
                                for (int counter = 0; counter < bank.accounts.size(); counter++) {
                                    if (bank.accounts.get(counter).getAccountNumber() != accountNumber) {
                                        continue;
                                    } else {
                                        System.out.println("Enter the amount to be deposited");
                                        int money = scan.nextInt();
                                        bank.accounts.get(counter).deposit(money);
                                        System.out.println(bank.accounts.get(counter).toString());
                                    }
                                    if (counter == bank.accounts.size() && bank.accounts.get(counter).getAccountNumber() != accountNumber) {
                                        System.out.println("INVALID ACCOUNT NUMBER");
                                    }
                                }
                            }
                            break;

                            case 3: {
                                System.out.println("Enter your account number please");
                                long accountNumber = scan.nextLong();
                                for (int counter = 0; counter < bank.accounts.size(); counter++) {
                                    if (bank.accounts.get(counter).getAccountNumber() != accountNumber) {
                                        continue;
                                    } else {
                                        System.out.println(bank.clients.get(counter).toString());
                                    }

                                    if (counter == bank.accounts.size() && bank.accounts.get(counter).getAccountNumber() != accountNumber) {
                                        System.out.println("INVALID ACCOUNT NUMBER");
                                    }
                                }
                            }

                            break;
                        }

                    } else {
                        System.out.println("PLEASE CREATE AN ACCOUNT...");
                    }
                }
                break;

                case 3: {
                    System.out.println("Hotline : " + bank.getPhone());
                    System.out.println("Address : " + bank.getAddress());
                }
                break;

                case 4: {
                    System.out.println("Thank you for banking with us...");
                    break;
                }
            }
            if (option == 4) {
                break;
            } else {
                continue;
            }
        }


    }
}
