package tasks;

import java.util.ArrayList;

/**
 * This class is for adding clients and accounts to lists and display them.
 *
 * @author Mohamed Saeed Ahmed
 * @version 1.0
 * @since 22 April 2021
 */

public class Bank {
    /**
     * This array list is used for adding accounts
     */
    public ArrayList<Account> accounts = new ArrayList<>();
    /**
     * This array list is used for adding clients
     */
    public ArrayList<Client> clients = new ArrayList<>();
    /**
     * @param name  Bank’s name
     * @param address Bank’s address
     * @param phone  Bank’s phone number
     */

    private String name;
    /*constructor*/
    private String address;
    private String phone;


    /* Setters*/

    /**
     * Default constructor
     */
    public Bank() {
        name = "";
        address = "";
        phone = "";
    }

    /**
     * This is a parametrized constructor
     *
     * @param name    Bank's Name
     * @param address Bank's Address
     * @param phone   Bank's Central Phone
     */

    public Bank(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    /**
     * This method returns name
     *
     * @return return name
     */
    public String getName() {
        return name;
    }

    /*Getters*/

    /**
     * This method sets name
     *
     * @param name Bank's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns address
     *
     * @return return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * this method sets address
     *
     * @param address Bank's address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /*Array Lists*/

    /**
     * This method return phone number
     *
     * @return return phone number
     */
    public String getPhone() {
        return phone;
    }

    /**
     * this method sets phone number
     *
     * @param phone Bank's phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /* Add */

    /**
     * this method is used for adding client’s info to class Client
     * this method is used for adding object from class Account to array list accounts
     *
     * @param objClient  object from class Client
     * @param objAccount object from class Account
     */
    public void addClient(Client objClient, Account objAccount) {
        clients.add(objClient);
        accounts.add(objAccount);
        System.out.println("Your account has been created successfully... ");
    }

    /* Display */

    /**
     * This method is used to display clients
     */
    public void displayClient() {
        for (int i = 0; i < clients.size(); i++) {
            System.out.println("Name: " + clients.get(i).getName());
            System.out.println("Phone: " + clients.get(i).getPhone());
            System.out.println("Address: " + clients.get(i).getAddress());
            System.out.println("Account: " + clients.get(i).getAccount());
            System.out.println("National ID: " + clients.get(i).getNationalID());
            System.out.println("******************************************************");
        }
    }

    /**
     * This method is used to display accounts
     */

    public void displayAccount() {
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println("Account Number: " + accounts.get(i).getAccountNumber());
            System.out.println("Balance: " + accounts.get(i).getBalance());
            System.out.println("******************************************************");
        }
    }


}