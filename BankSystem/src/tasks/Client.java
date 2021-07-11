package tasks;

/**
 * The Client class is used to obtain the private information of the client to help in assigning it to their accounts.
 *
 * @author Nada Khaled
 * @version 1.0
 * @since 22 April 2021
 */
public class Client {
    private String name;
    private String nationalID;
    private String address;
    private String phone;
    private Account objAccount;

    /**
     * The parameterized constructor helps in assigning the given information with the attributes.
     *
     * @param name       Client's Name
     * @param nationalID Client's nationalID
     * @param address    Client's address
     * @param phone      Client's phone number
     * @param objAccount Client's registered account
     */
    public Client(String name, String nationalID, String address, String phone, Account objAccount) {
        this.name = name;
        this.nationalID = nationalID;
        this.address = address;
        this.phone = phone;
        this.objAccount = objAccount;
    }

    /**
     * Default constructor
     */
    public Client() {
    }
    //Setters

    /**
     * This method returns the name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets the name.
     *
     * @param name Client's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the nationalID.
     *
     * @return nationalID
     */

    public String getNationalID() {
        return nationalID;
    }

    /**
     * This method sets the nationalID.
     *
     * @param nationalID Client's nationalID
     */
    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    /**
     * This method returns the address.
     *
     * @return address
     */

    public String getAddress() {
        return address;
    }
    //Getter

    /**
     * This method sets the address.
     *
     * @param address Client's address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method returns the phone number.
     *
     * @return number
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method sets the phone number.
     *
     * @param phone Client's phone number
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * This method returns the client's account.
     *
     * @return objAccount
     */
    public Account getAccount() {
        return objAccount;
    }

    /**
     * This method sets the Client's account.
     *
     * @param objAccount Client's account
     */
    public void setAccount(Account objAccount) {
        this.objAccount = objAccount;
    }

    /**
     * This is an overridden function "toString" that helps to return all needed attributes in the form of a string.
     *
     * @return all client's attributes.
     */
    public String toString() {
        return (
                "Name is: " + this.name + '\n' +
                        "National ID : " + this.nationalID + '\n' +
                        "Address: " + this.address + '\n' +
                        "Phone: " + this.phone + '\n' +
                        "Account Info :" + this.objAccount
        );
    }

}