package tasks;

/**
 * The CommercialClient class is inherited from the Client class for the company's clients and it has a
 * commercialID instead of the nationalID.
 * The nationalID is set to 000000000.
 *
 * @author Nada Khaled
 * @version 1.0
 * @since 22 April 2021
 */
public class CommercialClient extends Client {

    private String commercialID;

    /**
     * The parameterized constructor is for assigning the commercial client's information with the right attributes.
     *
     * @param name         Commercial Client's Name
     * @param address      Commercial Client's address
     * @param phone        Commercial Client's phone number
     * @param commercialID Commercial Client's commercialID
     * @param objAccount   Commercial Client's account.
     */
    public CommercialClient(String name, String address, String phone, String commercialID, Account objAccount) {
        super(name, "000000000", address, phone, objAccount);
        this.commercialID = commercialID;
    }

    /**
     * Default Constructor
     */

    public CommercialClient() {
        commercialID = "0";
    }

    //Setter

    /**
     * This method is for returning the commercialID.
     *
     * @return commercialID
     */

    public String getCommercialID() {
        return commercialID;
    }

    //Getter

    /**
     * This method is for setting the commercialID
     *
     * @param commercialID Client's commercialID
     */

    public void setCommercialID(String commercialID) {
        this.commercialID = commercialID;
    }

    /**
     * This is an overridden function "toString" that helps to return all needed attributes in the form of a string.
     *
     * @return all commercial client's attributes.
     */

    @Override
    public String toString() {

        return ("Name is: " + getName() + '\n' +
                "Commercial ID : " + this.commercialID + '\n' +
                "Address: " + getAddress() + '\n' +
                "Phone: " + getPhone() + '\n' +
                "Account Info : " + getAccount()
        );
    }
}
