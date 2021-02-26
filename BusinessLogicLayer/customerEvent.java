package BusinessLogicLayer;

public class customerEvent 
{
    //People order food from her for different events
    //If any client requests to decorate the venue she does that according to client’s recommended theme.
    //Once the booking has taken place she gives a booking number.
    //The client must be able to register into the system with required details such as name, surname and phone number etc.
    int customerID;
    String customerName;
    String customerSurname;
    String customerPhoneNumber;
    int customerBookingNumber;
    Float customerPaid;
    
    String eventDate;
    String eventName;
    String eventType;
    int eventNumberOfPeople;
    Float eventCost;


    Boolean themeFlag;
    String theme;

    public customerEvent(int CustomerID, int BookingNumber, Float CustomerPaid, String CustomerName, String CustomerSurname,String CustomerPhoneNumber, String EventName, String EventType, int EventNumberOfPeople, Float EventCost, Boolean ThemeFlag, String Theme)
    {
        this.customerID = CustomerID;
        this.customerBookingNumber = BookingNumber;
        this.customerName = CustomerName;
        this.customerSurname = CustomerSurname;
        this.customerPhoneNumber = CustomerPhoneNumber;
        this.customerPaid = CustomerPaid;
        this.eventName = EventName;
        this.eventType = EventType;
        this.eventNumberOfPeople = EventNumberOfPeople;
        this.eventCost = EventCost;
        this.themeFlag = ThemeFlag;
        this.theme = Theme;
    }
}
