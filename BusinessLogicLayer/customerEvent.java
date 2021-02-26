package BusinessLogicLayer;

public class customerEvent 
{
    //People order food from her for different events
    //If any client requests to decorate the venue she does that according to client’s recommended theme.
    //Once the booking has taken place she gives a booking number.
    int customerID;
    String customerName;
    String customerSurname;
    int bookingNumber;
    
    String eventDate;
    String eventName;
    String eventType;
    Boolean themeFlag;
    String theme;

    public customerEvent(int CustomerID, int BookingNumber, String CustomerName, String CustomerSurname, String EventName, String EventType, Boolean ThemeFlag, String Theme)
    {
        this.customerID = CustomerID;
        this.bookingNumber = BookingNumber;
        this.customerName = CustomerName;
        this.customerSurname = CustomerSurname;
        this.eventName = EventName;
        this.eventType = EventType;
        this.themeFlag = ThemeFlag;
        this.theme = Theme;
    }
}
