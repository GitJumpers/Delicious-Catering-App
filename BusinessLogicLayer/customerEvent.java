package BusinessLogicLayer;

public class customerEvent 
{
    int customerID;
    String customerName;
    String customerSurname;
    int bookingNumber;

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
