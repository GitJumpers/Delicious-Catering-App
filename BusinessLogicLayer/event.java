package BusinessLogicLayer;

public class event 
{
    //client id
    int customerID;
    //Type of event?
    //Event date and time?
    //Event venue address?
    //The total number of people?
    //proposed system must generate a booking number so the client can check the status of the booking or can update the menu.
    
    int eventID;
    int eventBookingNumber;
    String eventDate;
    String eventName;
    String eventType;
    String eventVenue;
    int eventNumberOfPeople;
    Float eventCost;
    Float eventPaid;


    boolean confirmationStatus;

    //Any decorations? If the answer is yes ask additional questions.
    Boolean decorationFlag;
    String decorationDetails;

    //If any client requests to decorate the venue she does that according to client’s recommended theme.
    Boolean themeFlag;
    String theme;

    public event(int EventBookingNumber, String EventName, String EventType,String EventVenue, int EventNumberOfPeople, Float EventCost, Float EventPaid, Boolean ConfirmationStatus, Boolean ThemeFlag, String Theme)
    {
        this.eventBookingNumber = EventBookingNumber;
        this.eventName = EventName;
        this.eventType = EventType;
        this.eventVenue = EventVenue;
        this.eventNumberOfPeople = EventNumberOfPeople;
        this.eventCost = EventCost;
        this.eventPaid = EventPaid;
        
        this.confirmationStatus = ConfirmationStatus;
        this.themeFlag = ThemeFlag;
        this.theme = Theme;
    }

    public event(int CustomerID, int EventBookingNumber, String EventName, String EventType,String EventVenue, int EventNumberOfPeople, Float EventCost, Boolean ConfirmationStatus, Boolean ThemeFlag, String Theme)
    {
        this.customerID = CustomerID;
        this.eventBookingNumber = EventBookingNumber;
        this.eventName = EventName;
        this.eventType = EventType;
        this.eventVenue = EventVenue;
        this.eventNumberOfPeople = EventNumberOfPeople;
        this.eventCost = EventCost;
        this.confirmationStatus = ConfirmationStatus;
        this.themeFlag = ThemeFlag;
        this.theme = Theme;
    }
}
