package BusinessLogicLayer;

public class customer 
{
    //People order food from her for different events
    
    //Once the booking has taken place she gives a booking number.
    //The client must be able to register into the system with required details such as name, surname and phone number etc.
    int customerID;
    String customerName;
    String customerSurname;
    String customerPhoneNumber;

    public customer(String CustomerName, String CustomerSurname,String CustomerPhoneNumber)
    {
        this.customerName = CustomerName;
        this.customerSurname = CustomerSurname;
        this.customerPhoneNumber = CustomerPhoneNumber;
    }

    public customer(int CustomerID, String CustomerName, String CustomerSurname,String CustomerPhoneNumber)
    {
        this.customerID = CustomerID;
        this.customerName = CustomerName;
        this.customerSurname = CustomerSurname;
        this.customerPhoneNumber = CustomerPhoneNumber;
    }
}
